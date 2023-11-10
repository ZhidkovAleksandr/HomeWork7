package Task2;

public class Worker {
    private String nameOfWorker;
    private String position;
    private int yearOfStart;


    public Worker(String nameOfWorker, String position,int yearOfStart){
        this.nameOfWorker = nameOfWorker;
        this.position = position;
        this.yearOfStart = yearOfStart;
    }

    public String getNameOfWorker() {
        return nameOfWorker;
    }

    public String getPosition() {
        return position;
    }

    public long getYearOfStart() {
        return yearOfStart;
    }
}
