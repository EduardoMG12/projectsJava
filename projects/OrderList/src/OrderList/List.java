package OrderList;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class List {
    static final int QUANTITY_LIST = 1;
    public static Worker[] allListWorkers = new Worker[QUANTITY_LIST];

    static Integer workersAdd = 0;

    Worker worker = new Worker();




    public void addNewMemberList(Worker worker){
        if (workersAdd == allListWorkers.length){
            Worker[] newListWorkers = new Worker[QUANTITY_LIST + workersAdd];

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
            OrganizationList();
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
            for (int i = 0; i < workersAdd; i++){
                int indexPositonBase = i;
                Worker workerPositionBase = allListWorkers[i];
                while(indexPositonBase > 0){
                    int indexBeforePosition = indexPositonBase -1;
                   Worker workerBeforePosition = allListWorkers[indexBeforePosition];

                    Boolean workersPreviousPositionComesAfter = workerBeforePosition == null || workerBeforePosition.workerComesAfter(workerPositionBase);
                    if (workersPreviousPositionComesAfter){
                        allListWorkers[indexPositonBase] = allListWorkers[indexBeforePosition];

                        indexPositonBase--;
                    } else  {
                        break;
                    }
                }
                allListWorkers[indexPositonBase] = workerPositionBase;
            }



        }
}

