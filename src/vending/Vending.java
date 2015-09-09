package vending;


import java.util.Random;
import java.util.ArrayList;

public class Vending  {

		public	int amount = 0;
		public	int user = 0;
		public  int total = 0;
		
		public ArrayList<Integer> inventory = new ArrayList<Integer>();
		{
		inventory.add(20);
		inventory.add(20);
		inventory.add(20);
		inventory.add(20);
		inventory.add(20);
		inventory.add(20);
		inventory.add(20);
		inventory.add(20);
		inventory.add(20);
		inventory.add(20);
		}
      	   Random RG = new Random();
      
		public void vendingMachine()
		{


			  while (true) {
				    try {
				    
				  
				    	System.out.println("welcome, make your pick");
				        user = RG.nextInt(10)+100;
                    			        System.out.println(user);
				        if ((user > 110)|| (user < 101))
				                {
				                    System.out.println("NOT valid");
				                    System.out.println("try again");
				                   

				                }
				        else 
				        {
				        	break;
				        }
				    	}
				 
				    catch (Exception e)
				    {
				       System.out.println("error"); 
				       break;
			    	    }
				  }
		
				  	
			switch (user)
	    	{
	    	case 101: 
	    		while (true){
		    	    try {
		    	    System.out.println("how many would you like?");
		    	   	amount = RG.nextInt(10)+1;
                  	System.out.println(amount);
                  	total = amount + total;
		    	   	if (amount > inventory.get(0))
		    	   	{
		    	 		    System.out.println("NOT valid");
				            System.out.println("try again");
			                  
				}
		    	   	else
		    	   	{
			    		System.out.println("You picked "+amount+ " Kitkat");
				    	System.out.println("Your total is $"+ amount);
		    	   		break;
		    	   	}
		    	    }
		    	    
		    	    catch (Exception e)
				    {
				       System.out.println("error"); 
				       break;
			    	}
		    	}

	    		inventory.set(0, inventory.get(0)-amount);
	    		break;
	    	case 102: 
	    		while (true){
		    	    try {
		    	    System.out.println("how many would you like?");
		    	   	amount = RG.nextInt(10)+1;
                  	System.out.println(amount);
                  	total = amount + total;
		    	   	if (amount > inventory.get(0))
		    	   	{
		    	 		    System.out.println("NOT valid");
				            System.out.println("try again");
			                  
				}
		    	   	else
		    	   	{
			    		System.out.println("You picked "+amount+ " Cheetos");
				    	System.out.println("Your total is $"+ amount);
		    	   		break;
		    	   	}
		    	    }
		    	    
		    	    catch (Exception e)
				    {
				       System.out.println("error"); 
				       break;
			    	}
		    	}

	    		inventory.set(1, inventory.get(1)-amount);
	    		break;
	    	case 103: 
	    		while (true){
		    	    try {
		    	    System.out.println("how many would you like?");
		    	   	amount = RG.nextInt(10)+1;
                  	System.out.println(amount);
                  	total = amount + total;
		    	   	if (amount > inventory.get(0))
		    	   	{
		    	 		    System.out.println("NOT valid");
				            System.out.println("try again");
			                  
				}
		    	   	else
		    	   	{
			    		System.out.println("You picked "+amount+ " Sprite");
				    	System.out.println("Your total is $"+ amount);
		    	   		break;
		    	   	}
		    	    }
		    	    
		    	    catch (Exception e)
				    {
				       System.out.println("error"); 
				       break;
			    	}
		    	}

	    		inventory.set(2, inventory.get(2)-amount);
	    		break;
	    	case 104: 
	    		while (true){
		    	    try {
		    	    System.out.println("how many would you like?");
		    	   	amount = RG.nextInt(10)+1;
                  	System.out.println(amount);
                  	total = amount + total;
		    	   	if (amount > inventory.get(0))
		    	   	{
		    	 		    System.out.println("NOT valid");
				            System.out.println("try again");
			                  
				}
		    	   	else
		    	   	{
			    		System.out.println("You picked "+amount+ " Coke");
				    	System.out.println("Your total is $"+ amount);
		    	   		break;
		    	   	}
		    	    }
		    	    
		    	    catch (Exception e)
				    {
				       System.out.println("error"); 
				       break;
			    	}
		    	}

	    		inventory.set(3, inventory.get(3)-amount);
	    		break;
	    	case 105: 
	    		while (true){
		    	    try {
		    	    System.out.println("how many would you like?");
		    	   	amount = RG.nextInt(10)+1;
                  	System.out.println(amount);
                  	total = amount + total;
		    	   	if (amount > inventory.get(0))
		    	   	{
		    	 		    System.out.println("NOT valid");
				            System.out.println("try again");
			                  
				}
		    	   	else
		    	   	{
			    		System.out.println("You picked "+amount+ " Kitkat");
				    	System.out.println("Your total is $"+ amount);
		    	   		break;
		    	   	}
		    	    }
		    	    
		    	    catch (Exception e)
				    {
				       System.out.println("error"); 
				       break;
			    	}
		    	}

	    		inventory.set(4, inventory.get(4)-amount);
	    		break;
	    	case 106: 
	    		while (true){
		    	    try {
		    	    System.out.println("how many would you like?");
		    	   	amount = RG.nextInt(10)+1;
                 	System.out.println(amount);
                 	total = amount + total;
		    	   	if (amount > inventory.get(0))
		    	   	{
		    	 		    System.out.println("NOT valid");
				            System.out.println("try again");
			                  
				}
		    	   	else
		    	   	{
			    		System.out.println("You picked "+amount+ " Cheetos");
				    	System.out.println("Your total is $"+ amount);
		    	   		break;
		    	   	}
		    	    }
		    	    
		    	    catch (Exception e)
				    {
				       System.out.println("error"); 
				       break;
			    	}
		    	}

	    		inventory.set(5, inventory.get(5)-amount);
	    		break;
	    	case 107: 
	    		while (true){
		    	    try {
		    	    System.out.println("how many would you like?");
		    	   	amount = RG.nextInt(10)+1;
                  	System.out.println(amount);
                  	total = amount + total;
		    	   	if (amount > inventory.get(0))
		    	   	{
		    	 		    System.out.println("NOT valid");
				            System.out.println("try again");
			                  
				}
		    	   	else
		    	   	{
			    		System.out.println("You picked "+amount+ " Sprite");
				    	System.out.println("Your total is $"+ amount);
		    	   		break;
		    	   	}
		    	    }
		    	    
		    	    catch (Exception e)
				    {
				       System.out.println("error"); 
				       break;
			    	}
		    	}

	    		inventory.set(6, inventory.get(6)-amount);
	    		break;
	    	case 108: 
	    		while (true){
		    	    try {
		    	    System.out.println("how many would you like?");
		    	    amount = RG.nextInt(10)+1;
               		System.out.println(amount);
               		total = amount + total;
		    	   	if (amount > inventory.get(0))
		    	   	{
		    	 		    System.out.println("NOT valid");
				            System.out.println("try again");
			                  
				}
		    	   	else
		    	   	{
			    		System.out.println("You picked "+amount+ " Coke");
				    	System.out.println("Your total is $"+ amount);
		    	   		break;
		    	   	}
		    	    }
		    	    
		    	    catch (Exception e)
				    {
				       System.out.println("error"); 
				       break;
			    	}
		    	}

	    		inventory.set(7, inventory.get(7)-amount);
	    		break;
	    	case 109: 
	    		while (true){
		    	    try {
		    	    System.out.println("how many would you like?");
		    	   	amount = RG.nextInt(10)+1;
                  	System.out.println(amount);
                  	total = amount + total;
		    	   	if (amount > inventory.get(0))
		    	   	{
		    	 		    System.out.println("NOT valid");
				            System.out.println("try again");
			                  
				}
		    	   	else
		    	   	{
			    		System.out.println("You picked "+amount+ " Kitkat");
				    	System.out.println("Your total is $"+ amount);
		    	   		break;
		    	   	}
		    	    }
		    	    
		    	    catch (Exception e)
				    {
				       System.out.println("error"); 
				       break;
			    	}
		    	}

	    		inventory.set(8, inventory.get(8)-amount);
	    		break;
	    	case 110: 
	    		while (true){
		    	    try {
		    	    System.out.println("how many would you like?");
		    	   	amount = RG.nextInt(10)+1;
                 	System.out.println(amount);
                 	total = amount + total;
		    	   	if (amount > inventory.get(0))
		    	   	{
		    	 		    System.out.println("NOT valid");
				            System.out.println("try again");
			                  
				}
		    	   	else
		    	   	{
			    		System.out.println("You picked "+amount+ " Cheetos");
				    	System.out.println("Your total is $"+ amount);
		    	   		break;
		    	   	}
		    	    }
		    	    
		    	    catch (Exception e)
				    {
				       System.out.println("error"); 
				       break;
			    	}
		    	}

	    		inventory.set(9, inventory.get(9)-amount);
	    		break;
	    		
	    	}
	    	System.out.println("Pay");
	    	while(true){
	    	int pay = RG.nextInt(10);
         		System.out.println(pay);
	    	if (pay >= amount)
	    	{
	    		int change = (pay-amount);
	    		System.out.println("Your change is $" +change);
	    		break;
	    		
	    	}
	    	else 
	    	{
	    		System.out.println("NOT ENOGH");
	    		System.out.println("Try again");
	    	}
	    	}
		}
		
		public void Inventory()
		{
			System.out.println("The inventory: "+inventory);
			int Kitkat =((inventory.get(0)-20) + (inventory.get(4)-20)+(inventory.get(8)-20))*-1;
			int Cheetos = ((inventory.get(1)-20) + (inventory.get(5)-20) + (inventory.get(9)-20))*-1;
			int Sprite = ((inventory.get(2)-20)+ (inventory.get(6)-20))*-1;
			int Coke = ((inventory.get(3)-20)+(inventory.get(7)-20))*-1;
			System.out.println("Total Kitkats sold: " + Kitkat );
			System.out.println("Total Cheetos sold: " + Cheetos);
			System.out.println("Total Sprites sold: "+ Sprite);
			System.out.println("Total Cokes sold: "+ Coke);
			System.out.println("Total items sold " + total);
			System.out.println("what you like to restock all of the items");
			int stock = RG.nextInt(2)+1;
			if (stock>1)
			{
				System.out.println("Yes");
				inventory.set(0,20);
				inventory.set(1,20);
				inventory.set(2,20);
				inventory.set(3,20);
				inventory.set(4,20);
				inventory.set(5,20);
				inventory.set(6,20);
				inventory.set(7,20);
				inventory.set(8,20);
				inventory.set(9,20);
				System.out.println("New inventory: "+inventory);
			}
			else 
			{
				System.out.println("No");
			}
	
		}

	}






