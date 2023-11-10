package Task5;

public class Calculator {

    static void add(double a, double b){
        System.out.println(a+b);
    }

    static void sub(double a, double b){
        System.out.println(a-b);
    }

    static void mul(double a, double b){
        System.out.println(a*b);
    }

    static void div(double a, double b){
        try {
            if (b==0){
                throw new ArithmeticException();
            }
        }catch (ArithmeticException e){
            System.out.println("division by 0");
        }

    }

}
