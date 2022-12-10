package OrderList;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Lists list = new Lists();

        Workers worker1 = new Workers();
        worker1.name = "Smith";
        worker1.role = 2;
        list.addNewMemberList(worker1);

        Workers worker2 = new Workers();
        worker2.name = "Pumba";
        worker2.role = 1;
        list.addNewMemberList(worker2);

        Workers worker3 = new Workers();
        worker3.name = "Timao";
        worker3.role = 1;
        list.addNewMemberList(worker3);

        Workers worker4 = new Workers();
        worker4.name = "Lucas";
        worker4.role = 1;
        list.addNewMemberList(worker4);

        Workers worker5 = new Workers();
        worker5.name = "Jorge";
        worker5.role = 1;
        list.addNewMemberList(worker5);

        list.createArchiveListMembers();
        System.out.println("------------------------------");
        list.readArchiveListMembers();

        for (var worker : list.backEnd) {
            System.out.println(worker.name);

        }
    }

}
