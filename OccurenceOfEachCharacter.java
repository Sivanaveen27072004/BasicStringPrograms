import java.util.Scanner;
public class OccurenceOfEachCharacter
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String s=sc.nextLine();
while(s.length()>0)
{
int prev = s.length();
char c=s.charAt(0);
s=s.replace(c+"", "");
int current=s.length();
int count =prev-current;
System.out.println(c+" -->"+count);
}
}
}