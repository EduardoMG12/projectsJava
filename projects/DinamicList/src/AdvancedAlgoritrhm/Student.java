package AdvancedAlgoritrhm;

public class Student {

    String name;

    boolean studentComesAfter(Student student){
        if(student == null){
            return false;
        }
        return name.compareTo(student.name) > 0;
    }

}

