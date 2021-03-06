/*
YIYANG ZHAO 2065868 yzhao97
I worked on this assignment alone using only this semester material.
*/
public class HW9 {

	public static int numBlocks(int a) {
		if (a == 1) return 1;
		return numBlocks(a-1)+a;
	}

	public static int sumDigits(int n) {
		if (n == 0) return 0;
		return sumDigits(n/10)+n%10;
	}
	
	public static boolean isNested(String s) {
		
		if (s.length() % 2 == 1) return false; //string of even chars dies at very beginning
		if (s.length() == 2) {  //then if it is a base case...
			if (s.equals("[]")) return true; else return false;
		} //if not a base case, see if the first is [ and last is ]
		if ((s.charAt(0) != '[') || (s.charAt(s.length()-1) != ']')) return false; 
		return (isNested(s.substring(1,s.length()-1))); //if everything is fine call a recursion
		
	}
//Test
/*
	public static void main(String[] args){
		System.out.println(numBlocks(3));
		System.out.println(sumDigits(194));
		System.out.println(isNested("[[[]]]"));
		System.out.println(isNested("[[]"));
		System.out.println(isNested("[[4]]"));	
	}
*/
}
