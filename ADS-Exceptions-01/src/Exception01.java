/*
* simple Example how to produce exceptions
* */
import java.util.*;

public class Exception01 {
    public static void main(String[] args) {

        //    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        String[] pets = {"dog", "cat", "monkey"};
        System.out.println(pets[0]);

        System.out.println(pets[3]);

        //java.lang.NumberFormatException: For input string: "123c"
        String text = "123c";
        int i = Integer.parseInt(text);


        //java.lang.NullPointerException: Cannot invoke "java.util.ArrayList.get(int)" because "<local2>" is null
        ArrayList<String> list = null;
        list.get(0);


        System.out.println("End of program");
    }
}
