import java.io.*;
import java.util.*;
import java.math.*;
class po
{
public static void main(String[] args)
{
double n,p,ans;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
n=s.nextInt();
System.out.println("Enter the power:");
p=s.nextInt();
if(n==0)
{
System.out.println("no power");
}
else
{
ans=Math.pow(n,p);
System.out.println("The answer is:"+ans);
}
}
}

