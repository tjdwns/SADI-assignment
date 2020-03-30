package sadi.a1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student s1 = new Student("s123456", "Tom", "1999-11-11");
        Student s2 = new Student("s123457", "Tim", "1998-12-11");
        Student s3 = new Student("s123458", "Andy", "2000-05-11");
        Student s4 = new Student("s123480", "Mike", "1999-11-12");
        Student s5 = new Student("s123472", "Travis", "1996-05-29");
        Course c1 = new Course("COSC2440", "SADI", 12);
        Course c2 = new Course("COSC2430", "SEF", 12);
        Course c3 = new Course("COSC2450", "SEPM", 12);
        Course c4 = new Course("COSC2580", "Programming I", 12);
        Course c5 = new Course("COSC2720", "Web Programming", 12);
        StudentEnrollManager studentEnrollManager = new StudentEnrollmentList();
        int option = 0;
        System.out.println("Samples: ");
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5);
        System.out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4 + "\n" + c5);
        do {
            Scanner scan = new Scanner(System.in);
            System.out.printf("\nWhat do you want to do?\n1. Enroll\n2. Update\n0. Quit\nEnter a number of the option: ");
            option = scan.nextInt();
            System.out.println();
            switch (option) {
                //Quit
                case 0:
                    System.out.println("Good Bye !!");
                    break;
                //Enroll courses
                case 1:
                    Scanner scan1 = new Scanner(System.in);
                    System.out.print("Enter your student ID: ");
                    String id = scan1.nextLine();
                    Student student = getStudent(s1, s2, s3, s4, s5, id);
                    if (student == null) break;
                    System.out.print("Enter semester: ");
                    String sem = scan1.nextLine();
                    System.out.print("Enter course name: ");
                    String cName = scan1.nextLine();
                    Course course = getCourse(c1, c2, c3, c4, c5, cName);
                    if (course == null) break;
                    StudentEnrollment studentEnrollment = new StudentEnrollment(student, course, sem);
                    studentEnrollManager.add(studentEnrollment);
                    break;
                //Update
                case 2:
                    Scanner scan2 = new Scanner(System.in);
                    System.out.print("Enter your student ID: ");
                    String sId = scan2.nextLine();
                    if (getStudent(s1, s2, s3, s4, s5, sId) != null) {
                        System.out.print("Enter the semester you are in: ");
                        String semester = scan2.nextLine();
                        System.out.println();
                        for (StudentEnrollment studentEnrollment1 : ((StudentEnrollmentList) studentEnrollManager).getStudentEnrollments()) {
                            if (studentEnrollment1.getStudent().getId().equals(sId) && studentEnrollment1.getSemester().equals(semester)) {
                                System.out.println(studentEnrollment1);
                            }
                        }
                        System.out.print("\nWhat do you want to do?\n1. Delete\n2. Add\nEnter a number of the option: ");
                        int option2 = scan2.nextInt();
                        switch (option2) {
                            //Delete function
                            case 1:
                                Scanner scan3 = new Scanner(System.in);
                                System.out.print("Choose course to delete: ");
                                String courseName = scan3.nextLine();
                                for (StudentEnrollment studentEnrollment1 : ((StudentEnrollmentList) studentEnrollManager).getStudentEnrollments()) {
                                    if (studentEnrollment1.getStudent().getId().equals(sId)
                                            && studentEnrollment1.getSemester().equals(semester)) {
                                        if (studentEnrollment1.getCourse().getName().equals(courseName)) {
                                            studentEnrollManager.delete(studentEnrollment1);
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                break;
                            //Add courses
                            case 2:
                                Scanner scan4 = new Scanner(System.in);
                                Student student1;
                                student1 = getStudent(s1, s2, s3, s4, s5, sId);
                                if (student1 == null) break;
                                System.out.print("Enter course name: ");
                                String name = scan4.nextLine();
                                Course course1;
                                course1 = getCourse(c1, c2, c3, c4, c5, name);
                                if (course1 == null) break;
                                StudentEnrollment studentEnrollment1 = new StudentEnrollment(student1, course1, semester);
                                studentEnrollManager.add(studentEnrollment1);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid value !!");
            }
        } while (option != 0);
    }

    private static Course getCourse(Course c1, Course c2, Course c3, Course c4, Course c5, String cName) {
        Course course;
        if (cName.equals(c1.getName())) {
            course = c1;
        } else if (cName.equals(c2.getName())) {
            course = c2;
        } else if (cName.equals(c3.getName())) {
            course = c3;
        } else if (cName.equals(c4.getName())) {
            course = c4;
        } else if (cName.equals(c5.getName())) {
            course = c5;
        } else {
            System.out.println("Course does not exist!");
            return null;
        }
        return course;
    }

    private static Student getStudent(Student s1, Student s2, Student s3, Student s4, Student s5, String sId) {
        Student student;
        if (sId.equals(s1.getId())) {
            student = s1;
        } else if (sId.equals(s2.getId())) {
            student = s2;
        } else if (sId.equals(s3.getId())) {
            student = s3;
        } else if (sId.equals(s4.getId())) {
            student = s4;
        } else if (sId.equals(s5.getId())) {
            student = s5;
        } else {
            System.out.println("ID does not exist!");
            return null;
        }
        return student;
    }
}
