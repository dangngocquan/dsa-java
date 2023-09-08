package codePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07036 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Student> students = new HashMap<>();
        Map<String, Subject> subjects = new HashMap<>();
        Map<String, TreeSet<Grade>> classes = new HashMap<>();
        List<String> classCodes = new LinkedList<>();

        String path1 = "SINHVIEN.in";
        String path3 = null;
        Scanner scanner1 = new Scanner(new File(path1));
        int t = Integer.parseInt(scanner1.nextLine());
        while (t-- > 0) {
            String code = scanner1.nextLine();
            String name = scanner1.nextLine();
            String classCode = scanner1.nextLine();
            String email = scanner1.nextLine();
            Student student = new Student(
                    code,
                    name,
                    classCode,
                    email
            );
            students.put(code, student);
        }
        scanner1.close();

        String path2 = "MONHOC.in";
        Scanner scanner2 = new Scanner(new File(path2));
        t = Integer.parseInt(scanner2.nextLine());
        while (t-- > 0) {
            String code = scanner2.nextLine();
            String name = scanner2.nextLine();
            int numberCredits = Integer.parseInt(scanner2.nextLine());
            Subject subject = new Subject(
                    code,
                    name,
                    numberCredits
            );
            subjects.put(code, subject);
        }
        scanner2.close();

        path3 = "BANGDIEM.in";
        Scanner scanner3 = new Scanner(new File(path3));
        t = Integer.parseInt(scanner3.nextLine());
        while (t-- > 0) {
            String[] data = scanner3.nextLine().split(" ");
            String studentCode = data[0];
            String subjectCode = data[1];
            String score = data[2];
            Student student = students.get(studentCode);
            Subject subject = subjects.get(subjectCode);
            Grade grade = new Grade(
                    student,
                    subject,
                    score
            );

            if (!classes.containsKey(student.getClassCode())) {
                classes.put(student.getClassCode(), new TreeSet<Grade>());
            }
            classes.get(student.getClassCode()).add(grade);
        }

        t = Integer.parseInt(scanner3.nextLine());
        while (t-- > 0) {
            String classCode = scanner3.nextLine();
            classCodes.add(classCode);
        }

        scanner3.close();

        // Output
        for (String classCode : classCodes) {
            System.out.printf("BANG DIEM lop %s:\n", classCode);
            for (Grade grade : classes.get(classCode)) {
                System.out.println(grade);
            }
        }
    }


    public static String toCamelCase(String s) {
        String[] words = s.split("\\s+");
        String ss = "";
        for (int i = 0; i < words.length; i++) {
            String word = (words[i].charAt(0) + "").toUpperCase()
                    + words[i].substring(1).toLowerCase();
            ss += word + " ";
        }
        return ss.trim();
    }

    static class Subject {
        private String code;
        private String name;
        private int numberCredits;

        public Subject(String code, String name, int numberCredits) {
            this.code = code;
            this.name = name;
            this.numberCredits = numberCredits;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }

    static class Student {
        private String code;
        private String name;
        private String classCode;
        private String email;

        public Student(String code, String name, String classCode, String email) {
            this.code = code;
            this.name = name;
            this.classCode = classCode;
            this.email = email;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public String getClassCode() {
            return classCode;
        }
    }

    static class Grade implements Comparable {
        private Student student;
        private Subject subject;
        private String grade;

        public Grade(Student student, Subject subject, String grade) {
            this.student = student;
            this.subject = subject;
            this.grade = grade;
        }

        public Student getStudent() {
            return student;
        }

        public Subject getSubject() {
            return subject;
        }

        @Override
        public int compareTo(Object o) {
            Grade that = (Grade) o;
            if (this.getSubject().getCode()
                    .equals(that.getSubject().getCode())) {
                return this.getStudent().getCode()
                        .compareTo(that.getStudent().getCode());
            }
            return this.getSubject().getCode()
                    .compareTo(that.getSubject().getCode());
        }

        @Override
        public String toString() {
            return String.format("%s %s %s %s %s",
                    student.getCode(),
                    toCamelCase(student.getName()),
                    subject.getCode(),
                    subject.getName(),
                    grade);
        }
    }
}

