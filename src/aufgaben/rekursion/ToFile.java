package aufgaben.rekursion;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ToFile {

    public ToFile(){

    }

    public static void writeToFile(String s){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt",true));
            bw.append(s);
            bw.newLine();
            bw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
