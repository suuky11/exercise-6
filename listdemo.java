/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex.pkg7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Vignesha Masanan
 */
public class listdemo {
    public static void main(String[] args){
        ArrayList<student>list=new ArrayList<student>();
        list.add(new student("aaa",200, (float) 83.25));
        list.add(new student("bbb",102, (float) 83.26));
        list.add(new student("ccc",101, (float) 83.27));
        list.add(new student("ddd",488, (float) 83.28));
        list.add(new student("eee",500, (float) 83.29));
        list.add(new student("fff",342, (float) 83.30));
        list.add(new student("ser",754, (float) 83.31));
        list.add(new student("erf",231, (float) 83.32));
        list.add(new student("gth",123, (float) 83.33));
        list.add(new student("vvv",423, (float) 83.34));
        list.add(new student("uyj",876, (float) 83.35));
        list.add(new student("yth",234, (float) 83.36));
        list.add(new student("ehk",756, (float) 83.37));
        list.add(new student("jnm",569, (float) 83.38));
        list.add(new student("nhm",326, (float) 83.39));
        list.add(new student("nmm",161, (float) 83.40));
        list.add(new student("mmm",141, (float) 83.41));
        list.add(new student("nnn",860, (float) 83.42));
        list.add(new student("jkk",345, (float) 83.43));
        list.add(new student("haa",436, (float) 83.44));
        System.out.println("unsorted");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        Collections.sort(list,new Sortbyroll());
        System.out.println("\nsorted by rollno");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
class student
{
    String name;
    int rollno;
    float cgpa;
    public student(String name,int rollno,float cgpa)
    {
        this.name=name;
        this.rollno=rollno;
        this.cgpa=cgpa;
    }
    @Override
    public String toString()
    {
        return this.name+" "+this.rollno+" "+this.cgpa;
    }
}
class Sortbyroll implements Comparator <student>
{
    public int compare(student a,student b)
    {
        return a.rollno-b.rollno;
    }

}
