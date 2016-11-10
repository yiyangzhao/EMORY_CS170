import java.util.Scanner;
public class Hi
{
	public static void main(String[] args)
	{ 
		Scanner input;
		input = new Scanner(System.in);
		String inp = input.next();
		String inpa = inp + " ";
		String news = "";
		int i = 0;
		int j = 0;
		int count = 0;
		int len = inpa.length()-1;
		while (i < len) {
			j = i;
			while (inpa.charAt(j) == inpa.charAt(j+1)) {
				j++;
			}
		if (i!=j) {
			news = news + inpa.charAt(i)+ (j-i+1); 
		} else {
			news = news + inpa.charAt(i);
		}
		i = j;
		i++;
		}
		if (len-1 <= news.length()) {
		System.out.println(inp);
		} else {
		System.out.println(news);
		}
	}
}
