package JavaExamples;

public class LastStringLength {

	public static void main(String[] args) {
		// with input hello world
		String input="Heloo World";
		int len = input.length();
		
		String[] split = input.split(" ");
		int arrlen = split.length;
		
		System.out.println("The last word of the input is: "+split[arrlen-1]);
		char[] ch = split[arrlen-1].toCharArray();
		int lastLen= ch.length;
		
		System.out.println("The length os the last word is : "+lastLen);
		
		//With the input fly me to the moon
		
		String input1="fly me to the moon";
		int len1 = input1.length();
		
		String[] split1 = input1.split(" ");
		int arrlen1 = split1.length;
		
		System.out.println("The last word of the input is: "+split1[arrlen1-1]);
		char[] ch1 = split1[arrlen1-1].toCharArray();
		int lastLen1= ch1.length;
		
		System.out.println("The length os the last word is : "+lastLen1);
		
		//With input luffy is still joyboy
		
		
		String input2="luffy is still joyboy";
		int len2 = input2.length();
		
		String[] split2 = input2.split(" ");
		int arrlen2 = split2.length;
		
		System.out.println("The last word of the input is: "+split2[arrlen2-1]);
		char[] ch2 = split[arrlen-1].toCharArray();
		int lastLen2= ch.length;
		
		System.out.println("The length os the last word is : "+lastLen2);
		
		
		/*
		Given a string s consisting of words and spaces, return the length of the last word in the string.

		A word is a maximal substring consisting of non-space characters only.

		 Example 1:

		Input: s = "Hello World"
		Output: 5
		Explanation: The last word is "World" with length 5.
		Example 2:

		Input: s = "   fly me   to   the moon  "
		Output: 4
		Explanation: The last word is "moon" with length 4.
		Example 3:

		Input: s = "luffy is still joyboy"
		Output: 6
		Explanation: The last word is "joyboy" with length 6.
		
		
		
		*/
		

	}

}
