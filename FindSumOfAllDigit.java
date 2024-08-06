import java.util.*;
public class FindSumOfAllDigit
{
public static void main (String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String s=sc.nextLine();
int sum=0;
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch>='0' && ch<='9')
sum+=Integer.parseInt(ch+"");
}
System.out.println(sum);
}
}
