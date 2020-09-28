import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class breakrecord {

 public static void main(String args[]){
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int max;
     int min=0;
     int countmin=0;
     int countmax=0;
     int a[]=new int[n];
     for(int i=0;i<n;i++){
         a[i]=s.nextInt();
     }
            min=a[0];
            max=a[0];
         int i=1;
         while(i<n){
             if(a[i]>max){
                 max=a[i];
                 countmax ++;
             }
            else if(a[i]<min){
                 min=a[i];
                 countmin++;
             }i++;
         }
         System.out.println(countmax+ " "+countmin);
     }
 }

