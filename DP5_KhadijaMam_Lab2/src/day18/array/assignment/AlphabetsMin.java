package day18.array.assignment;
/*
 * 34.	WAP to find min character in character array. 
 * Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], 
 * so min character is ‘A’. 
 */
public class AlphabetsMin {
	
	public static void AlphabetMinimumCharcter(char ch[])
	{
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==65||ch[i]==97) {
				System.out.println(ch[i]);
			}
		}
	
	}
	public static void main(String[] args) {
		char ch[]= {'A','D','E','x','z','R'};
		AlphabetMinimumCharcter(ch);
	}

}
