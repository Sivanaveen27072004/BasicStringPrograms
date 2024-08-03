import java.util.Arrays;
public class BasicFunction {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		String s="Mahendra";
		int l=s.length();
		for (int i=0;i<l;i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		char ch[]=s.toCharArray();
		for(char c:ch)
			System.out.print(c+" ");
		System.out.println();
		String s2[]=s.split("h");
		System.out.println(Arrays.toString(s2));
		System.out.println(Arrays.toString(a));
		
		}

}
