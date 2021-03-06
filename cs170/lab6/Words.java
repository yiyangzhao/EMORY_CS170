/*
This work is done by:
Yiyang Zhao 2065868 yzhao97 (Alan)
Zimo Ouyang 2084677 zouyan4
*/


//specify the import statements needed to use

import java.util.Scanner;

//a Scanner object and File objects

import java.io.*;


public class Words {

	// add a throws exception to the main method

	public static void main(String[] args) throws IOException {
		int wordCount = 0;
		int lineCount = 0;

		//declare and initialize a file built from poe.txt
		
		File myFile = new File("poe.txt");
		

		//declare and initialize a Scanner which reads the File object

		Scanner in = new Scanner(myFile);		

		//write a while-loop to count all *words* in the file

		while (in.hasNext()) {
			System.out.println (in.next());
			wordCount++;

		} 

		//reset your Scanner
		
		in = new Scanner(myFile);

		//write a while-loop to count all *lines* in the file
		
		while (in.hasNextLine()) {
			System.out.println (in.nextLine());
			lineCount++;
		}

		System.out.println("Total words = " + wordCount);
		System.out.println("Total lines = " + lineCount);
	}
}
