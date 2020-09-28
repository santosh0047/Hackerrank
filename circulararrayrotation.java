import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class circulararrayrotation {
public static void main(String args[]){
    Scanner sc =new Scanner (System.in);
    int n=sc.nextInt();
    int s=sc.nextInt();
    int d=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int b[]=new int[d];
    for(int i=0;i<d;i++){
        b[i]=sc.nextInt();
    }
    while(s--!=0){
        int e=a[n-1];
    for(int i=n-1;i>0;i--){

        a[i]=a[i-1];   
    }
    a[0]=e;
    }
    for(int i=0;i<d;i++){
        System.out.println(a[b[i]]);
    }

}
}
