/*
* simple Example how to produce exceptions
* */
import java.util.*;

public class Exception01 {
    public static void main(String[] args) {

        //    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        String[] pets = {"dog", "cat", "monkey"};
        System.out.println(pets[0]);
        try{
            System.out.println(pets[3]);
        }catch (Exception e){
            System.out.println(e);
        }
        //java.lang.NumberFormatException: For input string: "123c"
        try{
            String text = "123c";
            int i = Integer.parseInt(text);
        }catch (Exception e){
            System.out.println(e);
        }

        //java.lang.NullPointerException: Cannot invoke "java.util.ArrayList.get(int)" because "<local2>" is null
        try{
            ArrayList<String> list = null;
            list.get(0);
        }catch(Exception e){
            System.out.println(e);
        }

        // an sich sind Exceptions auch eine gute Sache -> frühe Fehlererkennung
        // das Programm wird nie bis hier her ausgeführt, wenn wir die Exceptions nicht fangen würden -> deshalb Verwendung von try-catch
        System.out.println("End of program");
    }
}
