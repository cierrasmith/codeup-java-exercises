package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student (String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sumOfGrades = 0;
        double amountOfGrades = grades.size();
        for(Integer grade :grades){
            sumOfGrades += grade;
        }
        return sumOfGrades/amountOfGrades;
    }

    public static void main(String[] args) {
        Student student = new Student("Rei");
        student.addGrade(90);
        student.addGrade(78);
        student.addGrade(82);
        System.out.println(student.getGradeAverage());

    }

}
