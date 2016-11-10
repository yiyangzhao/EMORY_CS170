/*
Yiyang Zhao
yzhao97 2065868
I worked on this assignment alone, using only this semester's course material
*/
public class HW5
{
//1
	public static boolean disneyRide(int x) //takes in height in inchs
	{ 
		return (((x/0.39370 > 120))&&((x/0.39370)<190)); //convert into cm and compare against rule
	}
//2
	public static String allLetters(String inps) //takes input string
	{ 
		String news = ""; //initialize a new string
		char a = '\0';
		for (int i=0; i<=inps.length(); i++)
		{
			a = inps.charAt(i);
			if (((a>=65)&&(a<=90)) || ((a>=97)&&(a<=122))) news = news + a; //if the i th character is letter than add it into the new string
		}
		return news; //return the value of the new generated string
	}
//3
	public static int quesoForFishy(double m)
	{ 
		if (m<0) return 0; else return (((int)(m*100))/298); //covert money and price into a int in order to do int division
		
	}
//4
	public static double trafficJam(int l, double m)
	{ 
		if (l>0 && m>0) return (l*m*5280.0)/15; //if the input is valid then returns the number of cars
		return -1.0; //otherwise return -1.0
	}
//5
	public static int timeLeft(int t, double h)
	{ 
		if (t>0 && h>0 && t<h*60) return (int)(t/(h*60)*100); //if the input is valid then return the percentage
		return -1; //otherwise return 1
	}
//6
	public static double daffoidils(int f, double p, double m) //f:number of flowers;p:price per 12 flowers;m:money contributed
	{
		return (Math.round((Math.ceil(f/12.0) * p -m)*100))/100; //no comments
	}
//main
	public static void main(String[] args)
	{  //no comments
	}

}
