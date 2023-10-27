package JavaExamples;

public class StringPalindrome {
	public void palindrome()
	{
		String s="A man, a plan, a canal, panama";
		
		String c="";
		String replace = s.replaceAll("[^a-zA-Z0-9]", "");
		
		String lowerCase = replace.toLowerCase();
		System.out.println(lowerCase);
		char[] ch = lowerCase.toCharArray();
		
		int len = ch.length;
		
		
		for(int i=len-1;i>=0;i--)
		{
			c = c+ch[i];
		}
		char[] ch1 = c.toCharArray();

		System.out.println(ch1);
		for(int j=0;j<=ch.length-1;j++)
		{
			for(int k=0;k<=ch1.length-1;k++)
			{
				if(ch[j]==ch1[k])
				{
					System.out.println("The entered string value is palindrom");
					
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		{
			StringPalindrome palin = new StringPalindrome();
			palin.palindrome();
		}
		
		
		
	}

}
