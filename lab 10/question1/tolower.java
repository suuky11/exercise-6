/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex10;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class toLower {


    public static void main(String[] args) throws FileNotFoundException, IOException {

        DataInputStream ds=new DataInputStream(new BufferedInputStream(new FileInputStream ("G:\\lab10\\src\\main\\java\\filehandling\\dog.txt")));
        FileWriter fw=new FileWriter("G:\\lab10\\src\\main\\java\\filehandling\\dog_to_lower.txt");
        String line;
        while((line=ds.readLine())!=null){//null represents end of line

            fw.write(line.toLowerCase());//reads the entire line
            fw.write("\n");//going to next line
    }
        fw.close();

    }
    
}
