import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class bonappetit {

   public static void main(String args[]){
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int k=s.nextInt();
       int a[]=new int[n];
       int sum=0;
       for(int i=0;i<n;i++){
           a[i]=s.nextInt();
           if(i!=k){
               sum+=a[i];
           }
       }
       int b=s.nextInt();
       if(sum/2==b){
           System.out.println("Bon Appetit");
       }
       else{System.out.println(b-(sum/2));}
   }
}
