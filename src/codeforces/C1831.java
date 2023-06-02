package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class C1831 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    // DFS: return number of steps to visit all nodes of graph, start from 'node'
    public static int getNumSteps(List<int[]>[] graph, int node, boolean[] isVisited, int numOrder) {
        isVisited[node] = true;
        int ans = 1;
        List<int[]> neighbours = graph[node];
        for (int[] neighbour : neighbours) {
            int nodeValue = neighbour[0];
            if (!isVisited[nodeValue]) {
                int smallestNumOrder = neighbour[1];
                int numSteps = getNumSteps(graph, nodeValue, isVisited, smallestNumOrder);
                if (smallestNumOrder < numOrder) {
                    numSteps += 1;
                }
                ans = Math.max(ans, numSteps);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int t = fastReader.nextInt();
        while (t-- > 0) {
            int n = fastReader.nextInt();
            List<int[]>[] graph = new LinkedList[n+1];
            for (int i = 0; i < n+1; i++) {
                graph[i] = new LinkedList<int[]>();
            }
            for (int numOrder = 1; numOrder < n; numOrder++) {
                int u = fastReader.nextInt();
                int v = fastReader.nextInt();
                graph[u].add(new int[] {v, numOrder});
                graph[v].add(new int[] {u, numOrder});
            }
            boolean[] isVisited = new boolean[n+1];
            System.out.println(getNumSteps(graph, 1, isVisited, 0));
        }
    }
}

