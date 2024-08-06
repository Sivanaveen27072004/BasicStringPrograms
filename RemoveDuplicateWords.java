import java.util.*;
public class RemoveDuplicateWords
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String s=sc.nextLine();
String sarray[]=s.split(" ");
for(int i=0;i<sarray.length;i++)
{
if(sarray[i]==null)continue;
for(int j=i+1;j<sarray.length;j++)
{
if(sarray[i].equals(sarray[j]))
sarray[j]=null;
}
}
String s2=" ";
for(int i=0;i<sarray.length;i++)
{
if(sarray[i]==null)continue;
s2+=sarray[i]+" ";
}
System.out.println("Output "+s2);
}
}
