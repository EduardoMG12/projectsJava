package OrderList;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        List list = new List();

        Worker worker1 = new Worker();
        worker1.name = "Smith";
        list.addNewMemberList(worker1);

        Worker worker2 = new Worker();
        worker2.name = "Pumba";
        list.addNewMemberList(worker2);

        Worker worker3 = new Worker();
        worker3.name = "Timao";
        list.addNewMemberList(worker3);

        Worker worker4 = new Worker();
        worker4.name = "Lucas";
        list.addNewMemberList(worker4);

        Worker worker5 = new Worker();
        worker5.name = "Jorge";
        list.addNewMemberList(worker5);

        Worker worker6 = new Worker();
        worker6.name = "Arnaldo";
        list.addNewMemberList(worker6);

        Worker worker7 = new Worker();
        worker7.name = "Bruno";
        list.addNewMemberList(worker7);

        Worker worker8 = new Worker();
        worker8.name = "Bruna";
        list.addNewMemberList(worker8);

        list.createArchiveListMembers();
        System.out.println("------------------------------");
        list.readArchiveListMembers();

    }

}
