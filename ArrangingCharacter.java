import java.util.*;
public class ArrangingCharacter
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String s=sc.nextLine();
String upper=" ";
String lower=" ";
String digit=" ";
String special=" ";
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch>='A' && ch<='Z') upper+=ch;
else if(ch>='a' && ch<='z') lower+=ch;
else if(ch>='0' && ch<='9') digit+=ch;
else special+=ch; 
}
System.out.println(s);
System.out.println(upper+" "+lower+" "+digit+" "+special);
}
}
