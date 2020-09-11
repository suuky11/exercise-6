/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex.pkg8;
import java.util.Scanner;

/**
 *
 * @author Suuky Masanan
 */
public class sortname {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sorting obj=new Sorting();
        obj.sortStrings();
    }
    
}
class Sorting
{
    void sortStrings()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=s.nextInt();
        String[]str=new String[n];
        System.out.println("enter the strings:");
        for(int i=0;i<n;i++)
        {
            str[i]=new String(s.next());
        }
        for(int i=0;i<n;i++)
        {
            int j;
            for(j=i+1;j<n;j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("sorted list of string is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
        
    }
}
