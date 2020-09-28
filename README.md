# Hackerrank
Bracket balancing hackerrank solution in java

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

public class bracketbalancing {

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s =sc.nextLine();
Stack<Character> a=new Stack<>();
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(ch=='(' || ch=='{' || ch=='['){
a.push(ch);
}
else if(!a.empty() && ((ch==')' && a.peek()=='(') || (ch==']' && a.peek()=='[') || (ch=='}' && a.peek()=='{'))){
a.pop();
}
else{
a.push(ch);
}
 }
if(a.empty()){
System.out.println("Balanced");;      
}
else{
System.out.println("Not Balanced");
}
}
}
