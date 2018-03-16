/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipping;
import java.util.Scanner;

/**
 *
 * @author Rich Wertz
 */
public class Shipping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	double shipLevel = 0;
	double shipLevel1 = 15;
	double shipLevel2 = 10;
	double shipLevel3 = 5;
	double totalSale = 0;
	double initialSale;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter total for the sale: ");
	
	initialSale = in.nextDouble();
	totalSale = initialSale;
	
	if (totalSale < 25) {
	    totalSale = totalSale + shipLevel1;
	    shipLevel = shipLevel1;
	} else if (totalSale < 50) {
	    totalSale = totalSale + shipLevel2;
	    shipLevel = shipLevel2;
	} else if (totalSale <= 75) {
	    totalSale = totalSale + shipLevel3;
	    shipLevel = shipLevel3;
	}
	
	System.out.println("Total cost for this sale is: " + initialSale + " + shipping amount: " + shipLevel + ". Bringing the grand total to: " + totalSale);
	
    }
    
}
