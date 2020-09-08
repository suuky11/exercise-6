/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex.pkg7;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Vignesha Masanan
 */
public class arraylistdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String>list=new ArrayList<>();
        list.add("make");
        list.add("each day");
        list.add("your");
        list.add("master piece");
        list.add("john wooden");
        System.out.println(list);
        list.add(4,"by");
        System.out.println(list);
        for(String element:list){
            if(element. contains("make"))
            {
                System.out.println("element found");
            }
        
        }
        boolean res=list.stream().anyMatch((a)->a.startsWith("ma"));
        System.out.println(""+res);
        
       
        
    }
    
}
