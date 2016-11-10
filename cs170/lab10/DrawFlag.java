/*
Yiyang Zhao       yzhao97           2065868
Zimo   Ouyang     zouyan4           2084677
*/

import java.awt.*;
import java.awt.image.*;

/* ========================================================
   Coordinate system of the Canvas:

           0    1       col#       400
           +----+--------+----------+
           |                        |  ^
         1 |                        |  |
           |                        |  |
           |                        |  |  height
      row# |        (col#,row#)     |  |
           |                        |  |
           |                        |  |
       300 +------------------------+  v
            <----------------------> (400,300)
                    width

    Coordinate = (col#,row#)
   ======================================================== */


public class DrawFlag
{

   static public void main(String[] args)
   {
      /* ======================================================
         This section of the program defines color values and
         make a canvas variable (named 'pic') for drawing

         Do NOT change anything in this section
         ====================================================== */
      final int RED    = 0xFF0000;         // Color code for red
      final int GREEN  = 0x00FF00;         // Color code for green
      final int BLUE   = 0x0000FF;         // Color code for blue
      final int YELLOW = 0xFFFF00;         // Color code for yellow
      final int WHITE  = 0xFFFFFF;         // Color code for white
      final int BLACK  = 0x000000;         // Color code for black

      /* ------------------------------------------------
         Preparing to draw picture...
         ------------------------------------------------ */
      Frame f = new Frame( "My image" );    // Create a Frame

      MyCanvas pic = new MyCanvas(400,300); // Make a 400x300 canvas 
      f.add("Center", pic);                 // Put the canvas in the window

      f.setSize(400,330);                   // Set window size
      f.setVisible(true);                   // Make window visible 

      /* ====================================================
         You must complete the lab by doing the tasks below

         This program draws a picture of the Dutch flag
         ==================================================== */

      /* ------------------------------------------------------
         Define a 400x300 array of integer named 'pixel'

         This variable will contain the pixels (= color code)
         for the Dutch flag
         ------------------------------------------------------ */
      int[][] pixel = new int[400][300];

      /* ------------------------------------------------------
         Define necessary variables to help you write the program
         (decide for yourself how many and what kind of variables
          you will need)
         ------------------------------------------------------ */
      int col, row;


      /* ==========================================================
         Try this:


         ========================================================== */
           for ( col = 0; col < 400; col++ )
               pixel[col][100] = YELLOW;

      /* ==========================================================
         TODO Part 1:

         Write a nested for-statement (a for-statement inside 
         a for-statement) to store the RED pixel color code
         in the rows 0 - 299 and columns 0 - 399 of the variable 
         'pixel'

         After you have written this statement, test your program
         You should see a red image (the "background" of the flag).
         ========================================================== */
	for (int i=0; i<300; i++){
		for (int j=0; j<400; j++){
			pixel[j][i] = RED;
		}	
	}
           

      /* ==========================================================
         TODO Part 2: draw a BLUE diagonal across.

         Write a nested for-statement (a for-statement inside 
         a for-statement) to store the BLUE pixel color code
         in the variable 'pixel[col][row]' if:

                 -150 <= 3*col - 4*row <= 150

         After you have written this part, test you program.
         You should see a blue diagonal running from the upper 
		 left to lower right of the flag.
         ========================================================== */
	for (int i=0; i<300; i++){
		for (int j=0; j<400; j++){
			if ((3*j-4*i>=-150)&&(3*j-4*i<=150)) pixel[j][i] = BLUE ;
		}	
	}

      /* ==========================================================
         TODO Part 3: draw the other diagonal across

         Use the hint in the lab handout to write a nested
         for-statement that makes the other diagonal BLUE
         (It will be the same width as previous diagonal).
         ========================================================== */

	for (int i=0; i<300; i++){
		for (int j=0; j<400; j++){
			if ((3*j+4*i>=1050)&&(3*j+4*i<=1350)) pixel[j][i] = BLUE ;
		}	
	}



    /* ===============================================================
       DO NOT touch this statement (this draws the picture)
       =============================================================== */
       pic.draw( pixel );
       pic.repaint();   // Repaint the frame

       System.out.println();
       System.out.println("**** Type Control-C to exit !!! ****");
       System.out.println("** Hold the Control-key... and then type C !!! **");
       System.out.println();
       System.out.println();
   }
}

