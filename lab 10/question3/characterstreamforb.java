/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex10;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Vignesha Masanan
 */
public class characterstreamforb {

    public static void main(String[] args) throws FileNotFoundException, IOException {
      
        FileReader fr=new FileReader("G:\\lab10\\src\\main\\java\\filehandling\\speec.mp3");
        FileWriter fw=new FileWriter("G:\\lab10\\src\\main\\java\\filehandling\\Speech.mp3");
        int readd;
       
        while((readd=fr.read())!=-1){
            System.out.println((char)readd);
            fw.write((char)readd);
        }
    }
   
}
    

