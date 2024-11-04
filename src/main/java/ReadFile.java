//Exercise 4
import java.io.*;

public class ReadFile {

    public static void readFile() {
        try{
            File file = new File("C:\\Users\\PC\\IdeaProjects\\Exceptions\\src\\main\\java\\textnoot.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);

        }catch (IOException e){
            System.out.println(" File not found :"+e.getMessage());
        }
        finally{
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) throws Exception {

        readFile();


    }
}
