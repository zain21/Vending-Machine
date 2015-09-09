package vending;


import java.util.Random;


public class Vend2 {


	public static void main (String [] args)
	 {

	Random RG = new Random();
	Vending newVend = new Vending();
	foodInfo newFood = new foodInfo();
	dispenser newVenddispenser = new dispenser();
	int customer = RG.nextInt(5)+1;
	newFood.FoodInfo();
	
	for (int i = 0; i < customer; i++)
	{	 
         	newVend.vendingMachine();
         	newVenddispenser.vendDispenser();
	}
	        try {Thread.sleep(2000);}
	        catch (Exception e){}
	        
	        System.out.println("\nVending Machine Off");
	        newVend.Inventory();
	    
}
}


