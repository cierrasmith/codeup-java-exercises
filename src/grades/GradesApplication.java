package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Student student = new Student("Rei");
        students.put("sailormoon2", student);
//        students.put("sailormars3", "91");
//        students.put("sailorsaturn8", "80");
//        students.put("chibimoon2", "65");

        System.out.println(students);

    }
}
