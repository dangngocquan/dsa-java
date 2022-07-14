package ntucoder;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * <a href = "http://ntucoder.net/Problem/Details/3349?fbclid=IwAR13frqxzH35yF4TJgllDGqB6R4PKv6QwRm-CVURUO8A6IMB1dUs9hl9I-s"> Link </a>
 * @author Bris
 * @version 1.0
 * @since 10:03:18 PM -  Jul 14, 2022
 */
public class ID3349 {
	public static Map<Integer, Integer> cardNumberMap = new LinkedHashMap<>();
	public static Map<Integer, Integer> roomCardNumberMap = new LinkedHashMap<>();
	public static int m;
	public static int n;
	
	public static void primeFactorsOfCardNumber(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			while (number % i == 0) {
				if (cardNumberMap.containsKey(i)) {
					cardNumberMap.put(i, cardNumberMap.get(i) + 1);
				}else {
					cardNumberMap.put(i, 1);
				}
				number /= i;
			}
		}
		if (number > 1) {
			if (cardNumberMap.containsKey(number)) {
				cardNumberMap.put(number, cardNumberMap.get(number) + 1);
			}else {
				cardNumberMap.put(number, 1);
			}
		}
	} 
	
	public static void primeFactorsOfRoomCardNumber(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			while (number % i == 0) {
				if (roomCardNumberMap.containsKey(i)) {
					roomCardNumberMap.put(i, roomCardNumberMap.get(i) + 1);
				}else {
					roomCardNumberMap.put(i, 1);
				}
				number /= i;
			}
		}
		if (number > 1) {
			if (roomCardNumberMap.containsKey(number)) {
				roomCardNumberMap.put(number, roomCardNumberMap.get(number) + 1);
			}else {
				roomCardNumberMap.put(number, 1);
			}
		}
	}
	
	public static boolean canOpen() {
		for (int key : roomCardNumberMap.keySet()) {
			if (cardNumberMap.containsKey(key) && cardNumberMap.get(key) >= roomCardNumberMap.get(key)) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		m = scanner.nextInt();
		n = scanner.nextInt();
		List<Integer> answerList = new ArrayList<>();
		
		for (int i = 1; i <= m; i++) {
			primeFactorsOfCardNumber(scanner.nextInt());
		}
		
		for (int i = 1; i <= n; i++) {
			roomCardNumberMap.clear();
			for (int j = 1; j <= m; j++) {
				primeFactorsOfRoomCardNumber(scanner.nextInt());
			}
			if (canOpen()) {
				answerList.add(i);
			}
		}
		System.out.println(answerList.size());
		for (int i = 0; i < answerList.size(); i++) {
			System.out.print(answerList.get(i) + " ");
		}
		scanner.close();
	} 
}
