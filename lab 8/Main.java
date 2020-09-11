/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex.pkg8;
import java.util.*;

/**
 *
 * @author Suuky Masanan
 */
public class Main {

 public static void main(String[] args) {
  permutationWithRepeation("PQR");

 }

 private static void permutationWithRepeation(String str1) {
  System.out.println("The given string is: PQR");
  System.out.println("The permuted strings are:");
  showPermutation(str1, "");
 }

 private static void showPermutation(String str1, String NewStringToPrint) {

  if (NewStringToPrint.length() == str1.length()) {
   System.out.println(NewStringToPrint);
   return;
  }
  for (int i = 0; i < str1.length(); i++) {

   showPermutation(str1, NewStringToPrint + str1.charAt(i));
  }
 }
}


