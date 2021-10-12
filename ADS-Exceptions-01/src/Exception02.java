/*
* example how to catch a RuntimeException
* */

import java.util.*;

public class Exception02{
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Eingabe der ganzen Zahlen zur Division");
        int num1;
        int num2;
        int result;

        try{
            num1 = keyboardInput.nextInt();
            num2 = keyboardInput.nextInt();
            result = num1 / num2;
            System.out.println("Division Ergebnis ist: " + result);
        }catch(ArithmeticException arithmeticException) {
            System.out.println("falsche Eingabe! Sie koennen nicht durch 0 dividieren ");
            System.out.println(arithmeticException);
        }catch(InputMismatchException e) {
            System.out.println("falsche Eingabe! Sie koennen nur ganze Zahlen eingeben");
            System.out.println( e);
        }catch(Exception e) {
            System.out.println("falsche Eingabe!");
            System.out.println( e);
        }finally {
            keyboardInput.close();
        }
    }
}