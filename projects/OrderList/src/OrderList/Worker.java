package OrderList;

public class Worker {
    public String name;

    boolean workerComesAfter(Worker worker){
        if(worker == null){
            return false;
        }
        return name.compareTo(worker.name) > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addName(String name){
        name = this.name;
    }
}
