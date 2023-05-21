package string;

public class Program1 {
	public static int size(String s)
	{
		int count=0;
		char[] ch=s.toCharArray();
		for(int i = 0; i <=ch.length; i++)
		{
			if(s.charAt(i)!='\u0000')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String s="Ram is very talented guy";
		System.out.println(size(s));
	}

}
