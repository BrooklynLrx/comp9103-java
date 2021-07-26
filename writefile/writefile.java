import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
    public class writefile {
        public static void main(String[] args){
            File f = new File("README.txt");
        
        try{
            PrintWriter writer = new PrintWriter(f);
            writer.println("hello");
            writer.println("world");
            writer.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    }
