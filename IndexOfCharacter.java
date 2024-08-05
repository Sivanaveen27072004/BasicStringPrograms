import java.util.Scanner;
public class IndexOfCharacter
{
public static void main(String []args)
{
System.out.println("Enter The String ");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println("Enter The character ");
char key=sc.nextLine().charAt(0);
int index=-1;
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
if (c==key )
{
index = i;
break;
}
}
System.out.println(index);
}
