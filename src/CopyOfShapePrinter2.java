

//////////////////////////////////////////////////////////////
//author: Junfei Gu 9453512
//purpose:this is a shape & number display system depends on user inputs
//////////////////////////////////////////////////////////////

import java.util.Scanner;


// shape class for creat shape object and output the shape user wants 
class shapes
{
	private int rows;
    
	// default contractor -- for testing 
	public shapes()
	{
		rows = 5;		
	}
	
	// setting rows for the shapes 
	public void set_row()
	{
		Scanner kb = new Scanner(System.in);
		int i;
		do
		{
	    	System.out.print("How many rows would you like to print (more than 1 please)");
            i = kb.nextInt();
		}while (i<2);
		
        rows = i;		
        //kb.close();
	}
	
	// output the shape_1
	public void print_shape_1()
	{
		for(int i = 0; i<rows; i++)
		{
			for(int j = rows;j>i; j--)
			{
			   System.out.print(j);
			}
		   System.out.print("\n");
		}
		
		// finish input output the following string and go to the top of while;
		System.out.print("\n\nSo,Which pattern do you want to print now?");
	}

	// output the shape_2
	public void print_shape_2()
	{
		for(int i = 1; i<=rows; i++)
		{
		   // print space
		   for(int j = rows-i; j>0; j--)
		   {
			   System.out.print(" ");;
		   }
		   // print numbers
		   for(int k = 0; k<i; k++)
		   {
			   System.out.print(k+1);;
		   }
		   System.out.print("\n");
		}
		
		
		System.out.print("\n\nSo,Which pattern do you want to print now?");
	}

	// output the shape_3
	public void print_shape_3()
	{
		for(int i = 0; i<rows; i++)
		{
		  // print space
		  for(int k=0;k<i;k++)
		  {
			  System.out.print(" ");
		  }
		  
		  // print numbers
		  for (int j=i; j<rows;j++)
		  {
			  System.out.print(j+1);
		  }
		  System.out.print("\n");
		}
		
		System.out.print("\n\nSo,Which pattern do you want to print now?");
	}

	// output the shape_4
	public void print_shape_4()
	{
		
		if(rows%2!=0)/// to see the user input is odd or even 
		{
			////////// first half odd dimonde ///////
		    for(int i = 0; i<rows/2+1; i++)
		    {
			     for(int k = (rows/2)-i; k>0;k--)
			         {
				          System.out.print(" ");
			         }
		         for(int j = 0 ; j<2*i+1; j++)
			         {
				          System.out.print(j+1);
			         }
		         		         
		         System.out.print("\n");
		    }
	        ////////// second half odd dimonde ///////
		    for(int i = rows/2; i>0; i--)
		    {
			     for(int k = 0; k<(rows/2+1)-i;k++)
			         {
				          System.out.print(" ");
			         }
			         for(int j = 0 ; j<2*i-1; j++)
		             {
			              System.out.print(j+1);
		             }
		         System.out.print("\n");
		    }
		    
		}
		else
		{
	         ////////// first half even dimonde ///////
			 for(int i = 0; i<rows/2; i++)
			    {
				     for(int k = (rows/2)-i-1; k>0;k--)
				         {
					          System.out.print(" ");
				         }
			         for(int j = 0 ; j<2*i+1; j++)
				         {
					          System.out.print(j+1);
				         }
			         System.out.print("\n");
			    }
	         ////////// second half even dimonde ///////
			 for(int i = rows/2; i>0; i--)
			    {
				     for(int k = 0; k<(rows/2)-i;k++)
				         {
					          System.out.print(" ");
				         }
				         for(int j = 0 ; j<2*i-1; j++)
			             {
				              System.out.print(j+1);
			             }
			         System.out.print("\n");
			    }
		}
		System.out.print("\n\nSo,Which pattern do you want to print now");
	}
}



// main 
public class CopyOfShapePrinter2 {
	
     public static void main (String args[])
     
     {  	 
    	 System.out.println("=== Welcome to Junfei Gu's Triangle/Diamond Printer === \n");
    	 System.out.println("Which pattern do you want to print?");
    	 int input = 0; // default value to see if need display sample shapes 
    	 boolean showinfo = true;// variable to determine if need to show the option menu 
    	 
    	 while(true)
    	 {
    		 
    		 
    		 if( showinfo == true)  // input control 
    		 {
    		 System.out.println("1)  54321  2)      1  3)  12345  4)    1");
        	 System.out.println("    5432          12       2345       123");
        	 System.out.println("    543          123        345      12345");
        	 System.out.println("    54          1234         45       123");
        	 System.out.println("    5          12345          5        1");
        	 System.out.print("\nEnter your choice (5 to quit):");
    		 }
        	   
    		 Scanner kb2 = new Scanner(System.in);
    		 input = kb2.nextInt();
    	 	 shapes sa = new shapes();
    	 	 
    	    switch (input)
    	    {
    	         case 1:
        	         sa.set_row();
        	         sa.print_shape_1();
        	         showinfo = false;
                 break;
                 
    	         case 2:
        	         sa.set_row();
        	         sa.print_shape_2(); 
        	         showinfo = false;
    	         break;
    	         
    	         case 3:
        	         sa.set_row();
        	         sa.print_shape_3();
        	         showinfo = false;
                 break;
                 
    	         case 4:
        	         sa.set_row();
        	         sa.print_shape_4();
        	         showinfo = false;
        	         
    	         break;
    	         
    	         case 5:
    	        	 System.out.println("Hope you enjoyed the triangles....");
    	        	 System.exit(0);
    	         break;	 
    	         
    	         default:
    	         System.out.println("Woops! "+input+" is an illegal choice. Try agian \nPlease enter a number between 1 and 5 inclusive:");
    	         showinfo = false;
    	     }
    	  
    	 }
    	 
    	
     }

}
