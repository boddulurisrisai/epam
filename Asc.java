import java.util.*;
import java.io.*;
class Asc{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
int c[]=new int[n];
System.out.println("enter ascii values");
for(int i=0;i<n;i++){
c[i]=sc.nextInt();
}
char ch[]=new char[n];
for(int i=0;i<n;i++){
ch[i]=(char)c[i];
System.out.println(ch[i]);
}
}
}