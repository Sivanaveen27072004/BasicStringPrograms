import java.util.Scanner;
public class FindIndexFromLast
{
public static void main (String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String :");
String s=sc.nextLine();
System.out.println("Enter the char :");
char ch=sc.nextLine().charAt(0);
int index=-1;
for(int i=s.length()-1;i>=0;i--)
{
if(ch==s.charAt(i))
{
index =i;
break;
}
}
System.out.println(index);
}
}