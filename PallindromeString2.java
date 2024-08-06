import java.util.Scanner;
public class PallindromeString2
{
public static void main (String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String :");
String s=sc.nextLine();
int i=0;
int j=s.length()-1;
boolean flag=false;
while(i<=j)
{
if(s.charAt(i)==s.charAt(j))
{
flag=true;
break;
}
i++;
j--;
}
if(flag)System.out.println(s+" is a pallindrome String");
else System.out.println(s+" is not a pallindrome String");
}
}
