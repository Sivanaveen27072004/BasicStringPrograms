import java.util.Scanner;
public class CountVowels
{
public static void main(String [] args)
{
System.out.println("Enter the String");
Scanner sc=new Scanner (System.in);
String s=sc.nextLine();
int count =0;
int total=s.length();
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
count++;
}
System.out.println("The Number Of Vowels is : "+count);
System.out.println("The Number of consonants is : "+(total-count));
}
}
