import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class beautifuldaysatmovies {
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int max=0;
    for(int i=a;i<=b;i++){
        int reverse=0;
        int j=i;
        while(j!=0){
              int d=j%10;
              reverse=reverse*10+d;
              j/=10;
        }
        int sub=Math.abs(i-reverse);
        if(sub%c==0){max++;}
    
    }
    System.out.println(max);
    
    }
}

