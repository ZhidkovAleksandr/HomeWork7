package Task5;

import java.util.Scanner;

public class Main {

    static void calculate(double a, double b, String opType){

      switch (opType){
          case "+":
              Calculator.add(a, b);
              break;
          case "-":
              Calculator.sub(a, b);
              break;
          case "*":
              Calculator.mul(a, b);
              break;
          case "/":
              Calculator.div(a, b);
              break;
      }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a;
        double b;
        String opType;


        while (true){

            System.out.println("Type in first operand");
            try {
                a = scan.nextDouble();
            }catch (Exception e){
              continue;
            }

            System.out.println("Type in second operand");
            try {
                b = scan.nextDouble();
            }catch (Exception e){
                continue;
            }

            System.out.println("Type in your operation: + - * /");
            try {
                opType = scan.next();
            }catch (Exception e){
                System.out.println("oups...");
                continue;
            }

            try {
                calculate(a,b,opType);
            }catch (Exception e){
                continue;
            }
        }

    }
}
