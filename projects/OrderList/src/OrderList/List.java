package OrderList;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
            String content = Files.readString(Paths.get(path));
            System.out.println(content.length());
            String[] listRead = content.split("\n");
            System.out.println(listRead);
            System.out.println(listRead.length);
            OrganizationList(listRead);
            FileWriter newFile = new FileWriter("orderList.txt");
            OrganizationList(listRead);
            newFile.write(printListOrdersMembers(listRead));
            newFile.close();

        } catch (IOException e){
            System.out.println("Read error" + e.getMessage());
        }
    }
    public void createArchiveListMembers() throws IOException {
        FileWriter newFile = new FileWriter("ListExercise.txt");
        newFile.write(printListMembers());
        newFile.close();
    }
    public static void OrganizationList(String[] list){
            for (int i = 0; i < list.length; i++){
                int indexPositonBase = i;
                String workerPositionBase = list[i];
                while(indexPositonBase > 0){
                    int indexBeforePosition = indexPositonBase -1;
                   String workerBeforePosition = list[indexBeforePosition];
                    boolean workerComesAfter = false;

                    Boolean workersPreviousPositionComesAfter = workerComesAfter = workerBeforePosition.compareTo(workerPositionBase) > 0;
                    if (workersPreviousPositionComesAfter){
                        list[indexPositonBase] = list[indexBeforePosition];

                        indexPositonBase--;
                    } else  {
                        break;
                    }
                }
                list[indexPositonBase] = workerPositionBase;
            }



        }
    public String printListOrdersMembers(String[] list){
        String allNames = "";

        for(int i = 0; i < list.length; i++){
            if (list[i] != null){
                System.out.println(list[i]);
                allNames += list[i] + "\n";
            }}

        return allNames;
    }

}

