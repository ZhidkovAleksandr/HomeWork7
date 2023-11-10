package Task3;

import Task2.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static boolean findPrintStore(ArrayList<Price> arrayList, String serStore){


        for (Price e:arrayList) {

            if(e.getNameStore().equals(serStore)){
                System.out.println(e.getNamePoduct() + " / "+ e.getPrice() +"гривень");
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String nameProduct;
        String nameStore;
        int price;

        Scanner scan = new Scanner(System.in);
        ArrayList<Price> arrayList = new ArrayList<>();

        for (int i =0; i<2; i++){
            System.out.println("Type in the name of product");
            nameProduct = scan.nextLine();
            System.out.println("Type in the name of store");
            nameStore = scan.nextLine();
            System.out.println("Type in the price of product");
            price = scan.nextInt();
            scan.nextLine();
            arrayList.add(new Price(nameProduct,nameStore,price));
        }

        Comparator<Price> sortStore = Comparator.comparing(Price::getNameStore);

        Collections.sort(arrayList,sortStore);

        System.out.println("Type in searching name of store");
        String serStore =  scan.nextLine();

        try {
            if (!findPrintStore(arrayList, serStore)){
                throw new Exception("Store was not found");
            }
        }
            catch (Exception e){
                System.out.println("Try again, store was not found");
        };
        //findPrintStore(arrayList);



    }
}
