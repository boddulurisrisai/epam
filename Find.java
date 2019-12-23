import java.util.*;
import java.io.*;

class Find{
public static void main(String[] args)throws Exception{
Scanner sc=new Scanner(System.in);
System.out.println("enter arrray size");
int n=sc.nextInt();
System.out.println("enter array values:");
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int min=a[0];
int max=a[0];
for(int i=0;i<n;i++){
if(min>a[i]){
min=a[i];
}
}
for(int i=0;i<n;i++){
if(max<a[i]){
max=a[i];
}
}
System.out.println("minimum is:"+min);
System.out.println("maximum is:"+max);
}
}