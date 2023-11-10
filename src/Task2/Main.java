package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static final int todayYear = 2023;
    static void callSortedWorkers(ArrayList<Worker> arrayList){
        for (Worker e:arrayList) {
            System.out.println(e.getNameOfWorker());
        }
    }

    static void findAnCallExpWorker(ArrayList<Worker> arrayList, int workExp){

        int realWorkExp;

        for (Worker e:arrayList) {

            realWorkExp = (int) (todayYear - e.getYearOfStart());
            if (realWorkExp>workExp){
                System.out.println(e.getNameOfWorker());
            }

        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Worker> arrayList = new ArrayList<>();
        String workersName;
        String positionOfWorker;
        int year;

        for(int i=0; i<=5;i++){
            System.out.println("In progress: "+ i +"/5");
            System.out.println("Type in the name of worker");
            workersName = scan.nextLine();
            System.out.println("Type in the position of worker");
            positionOfWorker = scan.nextLine();
            System.out.println("Type in the year when worker started to work");
            year = scan.nextInt();
            scan.nextLine();

            try {
                if(year<2000){
                    throw new ArithmeticException("The year must be more than 2000");
                }

                    arrayList.add(new Worker(workersName, positionOfWorker, year));


            }
                catch (Exception e){
                    System.out.println("The year was set by default");
                    arrayList.add(new Worker(workersName, positionOfWorker, 2000));
            }


        }
        System.out.println("Creating of workers is finished");

        Comparator<Worker> compWorker = Comparator.comparing(Worker::getNameOfWorker);

        Collections.sort(arrayList,compWorker);

        callSortedWorkers(arrayList);

        System.out.println("Type in work experience");
        int workExp = scan.nextInt();
        findAnCallExpWorker(arrayList,workExp);
        scan.close();





    }
}