/*
* example how to catch a RuntimeException
* */

import java.util.*;

public class Exception02{
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Eingabe der Zahlen zum Dividieren");
        int num1;
        int num2;
        int result;

        try{
            num1 = keyboardInput.nextInt();
            num2 = keyboardInput.nextInt();
            result = num1 / num2;
            System.out.println("Division Ergebnis ist: " + result);
        }catch(Exception e) {
            System.out.println("falsche Eingabe! " + e);
        }finally {
            keyboardInput.close();
        }
    }
}