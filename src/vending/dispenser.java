package vending;

import java.util.Date;
import java.util.Random;

public class dispenser {
	public void vendDispenser()
	{
			Random RG = new Random();
			int vendNumber = RG.nextInt(2);
			System.out.println("Vending Machine: " +vendNumber);
	    		Date date = new Date();
			System.out.print("Your arrivl time is ");
			System.out.println(date.toString());
						
			}

}
