/*
Yiyang Zhao
yzhao97 2065868
Bracketing : IMPROVED ALGORITHEM
*/
import java.util.Scanner;
public class Bracketing
{
	public static long storage[] = new long [9999];
	public static long bracket(int x) 
	{ 
		long a = 0;		
		if (x == 1) {return 1;}
		if (x == 2) {return 1;}
		if (storage[x] != 0 ) {return storage[x];}
		
		for (int i = 1; i<x; i++) {
			a = a + bracket(i) * bracket (x-i);
		}
		storage[x] = a;
		return a;
	}

//main
	public static void main(String[] args)
	{  
	
		for (int j = 1;j<9999;j++)
			storage[j] = 0;
			
		for (int i=1;i<=36;i++)
			System.out.println ("Bracketing of "+ i + " numbers generates "+ bracket(i)+" methods");
		
	}

}
