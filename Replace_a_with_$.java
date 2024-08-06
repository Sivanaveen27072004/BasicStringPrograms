import java.util.*;
public class Replace_a_with_$
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String : ");
String s=sc.nextLine();
System.out.println("The input is = "+s);
char ch[] = s.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]=='a')
ch[i]='$';
}
s=new String(ch);
System.out.println("The output is = "+s);
}
}
