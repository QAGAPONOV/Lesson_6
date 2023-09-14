import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class AppData {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("text.csv");

            if(!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("Value 1; Value 2; Value 3");
            pw.println("100; 200; 123");
            pw.println("300; 400; 500");
            pw.close();

            br = new BufferedReader(new FileReader("text.csv"));
            String line;
            while((line = br.readLine()) !=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.print("Error: " + e);
        } finally {
            try {
                br.close();
            }catch (IOException e){
                    System.out.print("Error: " + e);
                 }
        }
    }
}