
//////////////////////////////////////////////////////////////
//author: Junfei Gu 9453512
//purpose:this is a shape & number display system depends on user inputs
//////////////////////////////////////////////////////////////

import java.util.Scanner;


// shape 1 class
class l_inverse_triangle
{
	private int rows;
    
	// default constractor -- for testing 
	public l_inverse_triangle()
	{
		rows = 5;		
	}
	
	// setting rows for the first shape 
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
	
	// output the shape
	public void print()
	{
		for(int i = 0; i<rows; i++)
		{
			for(int j = rows;j>i; j--)
			{
			   System.out.print(j);
			}
		   System.out.print("\n");
		}
		
		
		System.out.print("\n\nSo,Which pattern do you want to print now?");
	}
}



// shape 2 class
class triangle
{
	private int rows;
   
	// default constractor -- for testing 
	public  triangle()
	{
		rows = 5;	
	}
	
	// setting rows for the first shape 
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
	
	
	// output the shape
	public void print()
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
	
}



// shape 3 class
class r_inverse_triangle
{
	private int rows;
    
	// default constractor -- for testing 
	public r_inverse_triangle()
	{
		rows = 5;		
	}
	
	// setting rows for the first shape 
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
	
	
	// output the shape
	public void print()
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
}



// shape 4 class
class dimonde
{
	private int rows;
	
	
	// default constractor -- for testing 
	public  dimonde()
	{
		rows = 5;
	}
	
	// setting rows for the first shape 
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
	
	
	
	// output the shape
	public void print()
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
public class ShapePrinter {
	
     public static void main (String args[])
     
     {  	 
    	 System.out.println("=== Welcome to Junfei Gu's Triangle/Diamond Printer === \n");
    	 System.out.println("Which pattern do you want to print?");
    	 int input = 0; // default value to see if need display sample shapes 
    	 boolean showinfo = true;// variable to determine if need to show the option menu 
    	 
    	 while(true)
    	 {
    		 
    		 
    		 if(input<5 && showinfo == true)
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
    	 	 
    	    switch (input)
    	    {
    	         case 1:
        	         l_inverse_triangle shape = new l_inverse_triangle();
        	         shape.set_row();
        	         shape.print();
        	         showinfo = false;
                 break;
                 
    	         case 2:
    	        	 triangle shape2 = new triangle();
        	         shape2.set_row();
        	         shape2.print(); 
        	         showinfo = false;
    	         break;
    	         
    	         case 3:
        	         r_inverse_triangle shape3 = new r_inverse_triangle();
        	         shape3.set_row();
        	         shape3.print();
        	         showinfo = false;
                 break;
                 
    	         case 4:
        	         dimonde shape4 = new dimonde();
        	         shape4.set_row();
        	         shape4.print();
        	         showinfo = false;
        	         
    	         break;
    	         
    	         case 5:
    	        	 System.out.println("Hope you enjoyed the triangles....");
    	        	 System.exit(0);
    	         break;	 
    	         
    	         default:
    	         System.out.print("Woops! "+input+" is an illegal choice. Try agian \nPlease enter a number between 1 and 5 inclusive:");
    	     }
    	  
    	 }
    	 
    	
     }

}
