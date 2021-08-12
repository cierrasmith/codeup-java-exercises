package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        // Create 4 student objects with at least 3 grades
        Student usagi = new Student("Usagi");
        usagi.addGrade(60);
        usagi.addGrade(75);
        usagi.addGrade(78);

        Student rei = new Student("Rei");
        rei.addGrade(80);
        rei.addGrade(82);
        rei.addGrade(90);

        Student amy = new Student("Amy");
        amy.addGrade(98);
        amy.addGrade(96);
        amy.addGrade(100);

        Student mina = new Student("Mina");
        mina.addGrade(78);
        mina.addGrade(82);
        mina.addGrade(76);

        students.putIfAbsent("sailormoon", usagi);
        students.putIfAbsent("sailormars", rei);
        students.putIfAbsent("sailormercury", amy);
        students.putIfAbsent("sailorjupiter", mina);

        commandLineInterface(students);
    }

    public static void commandLineInterface(HashMap<String, Student> students) {

        Input input = new Input();

        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students: ");

        for (String key : students.keySet()) {
            System.out.print("|" + key + "| ");
        }

        System.out.println("What student would you like to see more information on?");

        String userKey = input.getString();

        if (students.containsKey(userKey)) {

            Student currentStudent = students.get(userKey);

            System.out.println("Name: " + currentStudent.getName() + "\nGitHub Username: " + userKey);
            System.out.println("Current Average: " + currentStudent.getGradeAverage());

        } else {
            System.out.println("Sorry there's no student with that GitHub username: " + userKey);
        }

    }
}
