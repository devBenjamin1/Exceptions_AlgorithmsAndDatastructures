/*
* example how to produce a checked exception
 */
import java.io.*;

public class Exception03 {
    public static void main(String[] args) {

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter your name: ");
                String name = reader.readLine();
                System.out.println("Your name is: " + name);
    }
}


