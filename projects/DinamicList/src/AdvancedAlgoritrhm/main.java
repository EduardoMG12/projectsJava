package AdvancedAlgoritrhm;

public class main {
    public static void main(String[] args){
        StudentList list = new StudentList();
        Student student = new Student();

        Student student1 = new Student();
        student1.name = "Rodrigo";
        list.addStudent(student1);

        Student student2 = new Student();
        student2.name = "Thiago";
        list.addStudent(student2);

        Student student3 = new Student();
        student3.name = "Rodolfo";
        list.addStudent(student3);

        Student student4 = new Student();
        student4.name = "Roger";
        list.addStudent(student4);

        Student student5 = new Student();
        student5.name = "Charles";
        list.addStudent(student5);

        Student student6 = new Student();
        student6.name = "Diogenes";
        list.addStudent(student6);

        list.getStudentsPrint();
        System.out.println(list.scale());
        System.out.println("-------------------------");
        list.removeStudent(student3);
        list.getStudentsPrint();
        System.out.println(list.scale());

    }


}
