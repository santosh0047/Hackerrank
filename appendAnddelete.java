import java.util.*;
 class appendAnddelete {
    public static void main(String args[] ) throws Exception {
  Scanner sc=new Scanner(System.in);
    String s=sc.next();
  String s1=sc.next();
  int k=sc.nextInt();
  int a=0;
   String ss[]=s.split("");
   String ss1[]=s1.split("");
   int e=Math.min(s1.length(),s.length());
   for(int i=0;i<e;i++){
       
     char ch=s.charAt(i);
     char ch1=s1.charAt(i);
       if(ch==ch1){a++;}
       else{break;}
       
       
   }
      int b=s.length()-a;
      int c=s1.length()-a;
      int d=c+b;
      if(d<=k){
     System.out.println("Yes"); 
      }   
      else{System.out.println("No");} 
  }
    }
