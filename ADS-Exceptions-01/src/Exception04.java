/*
 * example how to throw a checked exception
 */

import java.io.*;

public class Exception04 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        String line;
        int i = 0;

        try (BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)))) {
            while ((line = br.readLine()) != null && i < 2) {
                numbers[i] = Integer.parseInt(line);
                i++;
                br.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("result is: "+(numbers[0]+numbers[1]));
    }
}