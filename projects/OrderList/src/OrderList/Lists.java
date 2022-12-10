package OrderList;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lists {
    static final int QUANTITY_LIST = 1;
    public static Workers[] allListWorkers = new Workers[QUANTITY_LIST];

    public static final Workers[] frontEnd = Arrays.stream(allListWorkers).filter(workers -> workers.role == 2).toArray(Workers[]::new);
    public static final Workers[] backEnd = Arrays.stream(allListWorkers).filter(workers -> workers.role == 1).toArray(Workers[]::new);
    Integer workersAdd = 0;

    Workers worker = new Workers();




    public void addNewMemberList(Workers worker){
        if (workersAdd == allListWorkers.length){
            Workers[] newListWorkers = new Workers[QUANTITY_LIST + workersAdd];

            for (int i= 0; i < workersAdd; i++){
                newListWorkers[i] = allListWorkers[i];

            }
            allListWorkers  = newListWorkers;
        }

        allListWorkers[workersAdd] = worker;
        workersAdd++;
    }
    public String printListMembers(){
        String allNames = "";

        for(int i = 0; i < allListWorkers.length; i++){
            if (allListWorkers[i].name != null){
            System.out.println(allListWorkers[i].name);
            allNames += allListWorkers[i].name + "\n";
        }}

        return allNames;
    }

    public void readArchiveListMembers(){
        String path = "ListExercise";
        try{
            String content = Files.readString(Paths.get(path));
            System.out.println(content);
        } catch (IOException e){
            System.out.println("Read error" + e.getMessage());
        }
    }
    public void createArchiveListMembers() throws IOException {
        FileWriter newFile = new FileWriter("ListExercise");
        newFile.write(printListMembers());
        newFile.close();
    }
    public static void OrganizationList(){
    for (int i = 1; i < allListWorkers.length; i++){
        int indexPositionBase = i;
        int indexPositionBefore = i - 1;

        while (allListWorkers[indexPositionBase].name.compareTo(allListWorkers[(indexPositionBefore)].name) == 1) {
            allListWorkers[indexPositionBase] = allListWorkers[indexPositionBefore];
        }


    }
}
}
