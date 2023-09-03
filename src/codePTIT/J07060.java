package codePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class J07060 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Subject> subjects = new HashMap<>();
        Map<String, ExamTime> examTimes = new HashMap<>();

        // Read data from "MONTHI.in"
        String path = "MONTHI.in";
        Scanner scanner1 = new Scanner(new File(path));
        int t = Integer.parseInt(scanner1.nextLine());
        while (t-- > 0) {
            String code = scanner1.nextLine();
            String name = scanner1.nextLine();
            String form = scanner1.nextLine();
            Subject subject = new Subject(code, name, form);
            subjects.put(code, subject);
        }
        scanner1.close();

        // Read data from "CATHI.in"
        path = "CATHI.in";
        Scanner scanner2 = new Scanner(new File(path));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        t = Integer.parseInt(scanner2.nextLine());
        for (int i = 1; i <= t; i++) {
            String code = String.format("C%03d", i);
            String date = scanner2.nextLine();
            String time = scanner2.nextLine();
            String roomID = scanner2.nextLine();
            LocalDateTime dateTime = LocalDateTime.parse(date + " " + time, dateTimeFormatter);
            ExamTime examTime = new ExamTime(code, dateTime, roomID);
            examTimes.put(code, examTime);
        }
        scanner2.close();

        // Read data from "LICHTHI.in"
        path = "LICHTHI.in";
        Scanner scanner3 = new Scanner(new File(path));
        t = Integer.parseInt(scanner3.nextLine());
        while (t-- > 0) {
            String[] data = scanner3.nextLine().split(" ");
            String codeExamTime = data[0];
            String codeSubject = data[1];
            String codeGroup = data[2];
            int numberStudents = Integer.parseInt(data[3]);
            ExamTime examTime = examTimes.get(codeExamTime);
            examTime.setSubject(subjects.get(codeSubject));
            examTime.setCodeGroup(codeGroup);
            examTime.setNumberStudents(numberStudents);
        }
        scanner3.close();

        // Print result
        Set<ExamTime> examTimes0 = new TreeSet<>(examTimes.values());
        for (ExamTime examTime : examTimes0) {
            System.out.println(examTime);
        }

    }

    static class Subject {
        private String code;
        private String name;
        private String form;

        public Subject(String code, String name, String form) {
            this.code = code;
            this.name = name;
            this.form = form;
        }

        public String getName() {
            return name;
        }
    }

    static class ExamTime implements Comparable {
        private String code;
        private LocalDateTime dateTime;
        private String roomID;
        private Subject subject;
        private String codeGroup;
        private int numberStudents;

        public ExamTime(String code, LocalDateTime dateTime, String roomID) {
            this.code = code;
            this.dateTime = dateTime;
            this.roomID = roomID;
        }

        public String getCode() {
            return code;
        }

        public LocalDateTime getDateTime() {
            return dateTime;
        }

        public void setSubject(Subject subject) {
            this.subject = subject;
        }

        public void setCodeGroup(String codeGroup) {
            this.codeGroup = codeGroup;
        }

        public void setNumberStudents(int numberStudents) {
            this.numberStudents = numberStudents;
        }

        @Override
        public int compareTo(Object o) {
            ExamTime otherExamTime = (ExamTime) o;
            if (this.dateTime.isBefore(otherExamTime.getDateTime())) {
                return -1;
            } else if (this.dateTime.isAfter(otherExamTime.getDateTime())) {
                return 1;
            } else {
                return this.code.compareTo(otherExamTime.getCode());
            }
        }

        @Override
        public String toString() {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            return String.format("%s %s %s %s %d",
                    dateTime.format(dateTimeFormatter),
                    roomID,
                    subject.getName(),
                    codeGroup,
                    numberStudents);
        }
    }
}


/*
* 2
MUL1320
Nhap mon da phuong tien
Bai tap lon + Van dap truc tuyen
BAS1203
Giai tich 1
Thi viet + Van dap truc tuyen
2
09/01/2022
15:30
70172
09/01/2022
10:00
70279
2
C001 MUL1320 01 46
C002 BAS1203 04 72*/