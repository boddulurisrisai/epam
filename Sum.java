import java.util.*;
import java.io.*;
class Sum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("enter arrray size");
int n=sc.nextInt();
System.out.println("enter array values:");
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
sum+=a[i];
}
double avg=sum/n;
System.out.println("sum is:"+sum);
System.out.println("average is:"+avg);
}
}