/*Don't forget your collaboration statement (see syllabus) here */
/*
YIYANG ZHAO (Alan)
2065868 / yzhao97@emory.edu
I worked on thie assignment alone, using only this semester's course material.
*/

/*Now it is joking time.
but i have no jokes for now.
sorry*/

//the program starts here...

import java.util.Scanner;
public class ReplaceWhile {
	public static void main(String[] args) {

		//Var	
		String string1="", string2="", string3="", stringrp="";
		char ori='\0',rpl='\0';
		int sleng=0,i=0;		
		
		//Input
		Scanner inpn;
		inpn = new Scanner(System.in);		
		System.out.print("Please enter a character:_");
		string1=inpn.next();
	
		System.out.print("Please enter a replacement character:_");
		string2=inpn.next();

	
		System.out.print("Please enter a string:_");
		string3=inpn.next();
		
		
		//Datatypeconversion
		ori=string1.charAt(0);
		rpl=string2.charAt(0);
		
		//Initialize
		sleng=string3.length();
		stringrp="";
		
		//Generate new string
		while (i<sleng) {
			if (string3.charAt(i) == ori) {
				stringrp = stringrp + rpl;				
			} else {
				stringrp = stringrp + string3.charAt(i);				
			}
			i = i + 1;
		}
		
		//Output
		System.out.println ("Your new string is: "+ stringrp);
		
	}
}
