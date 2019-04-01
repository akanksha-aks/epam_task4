/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akanksha singh
 */
import java.util.regex.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class sparseArray {

public static void main(String[] args) {
   Scanner sc=new Scanner(System.in); 
      int n=sc.nextInt();
      String []s=new String[n];   
      int counter=0;
     for(int i=0;i<n;i++)
        {
          sc.nextLine();
           s[i]=sc.next();
        }   
    int n1=sc.nextInt();
    String[] s1=new String[n1];
    for(int j=0;j<n1;j++)
        {
           sc.nextLine();
           s1[j]=sc.next();  
      }
   for(int i=0;i<n1;i++)
       {
          counter=0;
          for(int j=0;j<n;j++)
              {
                 if((s[j].equals(s1[i])))
                     {
                     counter++;
                    }

              }
         System.out.println(counter);
       }
}
}


