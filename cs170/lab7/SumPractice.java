/*
Yiyang Zhao 2065868 yzhao97 (Alan)
Zimo Ouyang 2084677 zouyan4
*/

import java.util.Scanner;

class SumPractice {
  
  // Calculates the sum of the first N odd
  // numbers.

  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	System.out.print("We will compute the sum of some odd numbers.  How many odd numbers would you like to add? ");
    int n = in.nextInt();

	int count = 0;
	int odd = 1;
    int sum = 0;
    
    while (count != n) {
      sum = sum + odd;
      odd = odd + 2;
      count++;
    }
    
    System.out.println("The sum of the first " + n + " odd numbers is " + sum + ".");
  }
}
