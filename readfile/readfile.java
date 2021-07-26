import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class readfile{
    public static void main(String[] args){
        File f = new File("readme.txt");
        
        try{
            Scanner scan = new Scanner(f);
            while(scan.hasNextLine()){
                String a = scan.nextLine();
                System.out.println(a);
                
            }
        } catch (FileNotFoundException e){
            System.err.println("No such file");
        }
    }
}

