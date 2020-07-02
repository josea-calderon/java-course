// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      //System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  
		Scanner keyboard = new Scanner(System.in);
		
		String firstName;
		String itemOrder;
		String frostingType;
		String fillingType;
		String toppings;
		String input;
		
		double cost = 15.00;
		final double TAX_RATE = 0.066;
		double tax;
	 
    // Introduce shop and prompt user to input first name
      
		System.out.println("Bienvenidos a la tienda Pasteles y Mantecadas Java");
		System.out.println("We make custome cakes with our secret cake batter!");
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
		System.out.println("¿Cuál es tu nombre?");
		firstName = keyboard.nextLine();
		
		System.out.println(firstName + ", please, find the Menu below: ");
		System.out.println("\n");
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

		System.out.println("__________________________________________");
		System.out.println("     Menu     Quantity     Base cost     ");
		System.out.println("__________________________________________");
		System.out.println("     Cake         1           $15        ");
		System.out.println(" Set of cupcakes  6           $15        ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Frostings (vanilla, chocolate, coco, lemon)");
		System.out.println("Fillings (vanilla, moka, milk, caramel, mint)");
		System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
		System.out.println("__________________________________________");
      

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

		System.out.println("Do you want Cupcakes or Cake?");
		itemOrder = keyboard.nextLine();
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

		System.out.println("What is please the FROSTING that you want?");
		frostingType = keyboard.nextLine();
	 	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING

		System.out.println("What is please the FILLING that you want?");
		fillingType = keyboard.nextLine();
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS

		System.out.println("What TOPPINGS do you want");
		toppings = keyboard.nextLine();
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION


		System.out.println("\n");
		System.out.println(firstName + ", tú orden es la siguiente: ");
		System.out.println("__________________________________________");
		System.out.println("Platillo ordenado: " +  itemOrder);	  
		System.out.println("Cubierta: " +  frostingType);
		System.out.println("Relleno: " + fillingType);
		System.out.println("Toppings: " + toppings);
		System.out.println("__________________________________________");
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
		
		System.out.printf("The cost of your order is: $%.2f\n", cost);
		tax = cost * TAX_RATE;
		System.out.printf("The tax is: $%.2f\n", tax);
		System.out.printf("The total due is: $%.2f\n", (tax + cost));
  
    }   
}