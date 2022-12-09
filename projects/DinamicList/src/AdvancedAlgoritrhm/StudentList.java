package AdvancedAlgoritrhm;

public class StudentList {

    static final int QUANTITY_LIST = 2;

    Student[] list = new Student[QUANTITY_LIST];

    int scaleList = 0;

    int scale(){
        return scaleList;
    }
    void addStudent(Student student){
        if(scaleList == list.length) {
           Student[] newList = new Student[list.length + QUANTITY_LIST];

            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }

        list[scaleList] = student;
        scaleList++;
    }

    void removeStudent(Student student){
        for (int i = 0 ; i < scaleList; i++){
            Student a = list[i];
            if (a != null && a.equals(student)){
                removeStudent(i);
                break;
            }else if(a == null && student == null){
                removeStudent(i);
                break;
            }
        }
    }

    void removeStudent(int indice){

        for (int i = indice; i < scaleList - 1; i++){
            list[i] = list[i + 1];

        }
        scaleList--;
        list[scaleList] = null;
    }




    Student getStudent(int indice){
        return list[indice];
    }


    void getStudentsPrint() {
        for (int i = 0; i < scaleList; i++) {
            if(getStudent(i) != null) {
                Student a = getStudent(i);
                System.out.println("Student: " + a.name);
            }else {
                System.out.println("Student any name");
            }
        }

    }

}
