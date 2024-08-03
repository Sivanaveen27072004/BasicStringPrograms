public class UpperCase {
	public static void main(String[] args) {
		String s="i am sivanaveen from final year ece ";
		char ch[]=s.toCharArray();
		System.out.println("input = "+s);
		for(int i=1;i<ch.length;i++)
		{
			if(ch[i-1]==' '&&(ch[i])>='a'&&ch[i]<='z');
			ch[i]=(char)(ch[i]-32);
		}
		if(ch[0]>='a'&&ch[0]<='z')
		{
			ch[0]=(char)(ch[0]-32);
     		String s2=new String(ch);
			System.out.println("Output = "+s2);
			
		}
		
			
		}

}
