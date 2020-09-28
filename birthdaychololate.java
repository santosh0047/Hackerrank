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

public class birthdaychololate {

   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       int d=sc.nextInt();
       int m=sc.nextInt();
       int count=0;
       for(int i=0;i<n-m+1;i++){
           int sum=0;
           for(int j=i;j<i+m;j++){
               sum+=a[j];
           }
           if(sum==d){
              count++;
           }
       }
            System.out.println(count);
        }
}
