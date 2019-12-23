import java.util.*;
import java.io.*;
class Main{
public static void main(String[] args)throws Exception{
Scanner sc=new Scanner(System.in);
System.out.println("enter arrray size");
int n=sc.nextInt();
System.out.println("enter array values:");
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n-1;j++){
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("larger two:"+a[n-2]+" "+a[n-1]);
System.out.println("smaller two:"+a[0]+" "+a[1]);
}
}