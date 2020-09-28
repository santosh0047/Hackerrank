import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class catmouse{
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int s=sc.nextInt();
    while(s--!=0){
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        int m=sc.nextInt();
        int p1=0;
        int p2=0;
        if(c1<=m){
            while(c1!=m){
                c1++;
                p1++;
            }
        }
        else{
            while(c1!=m){
                c1--;
                p1++;
            }
        }
        if(c2<=m){
            while(c2!=m){
                c2++;
                p2++;
            }
        }
        else{
            while(c2!=m){
                c2--;
                p2++;
            }
        }
        if(p1<p2){System.out.println("Cat A");}
        else if(p1>p2){System.out.println("Cat B");}
        else{System.out.println("Mouse C");}
    }
}
}
