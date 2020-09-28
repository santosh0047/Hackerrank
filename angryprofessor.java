import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class angryprofessor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int max=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]<=0){max++;}
            }
            if(max>=k){
                System.out.println("NO");
            }
            else{System.out.println("YES");}
        }
    }
}
