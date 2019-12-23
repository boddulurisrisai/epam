import java.util.*;
import java.io.*;

class Search{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter arrray size");
int n=sc.nextInt();
System.out.println("enter array values:");
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int c=0,flag=0;
System.out.println("enter the value to find");
int k=sc.nextInt();
for(int i=0;i<n;i++){
if(a[i]==k){
flag=1;
c=i;
break;
}
else{
flag=0;
}
}
if(flag==1){
System.out.println("element is found at index:"+(c+1));
}
else{
System.out.println("elemnet not found");
}
}
}