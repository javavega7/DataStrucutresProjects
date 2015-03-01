
/**
 *
 * @author javier vega
 * 
 * Data Structures Project 2015
 * @Stockton University (NJ)
 * 
 * Class BuySellQueue demonstrates 
 * the Capital Gain or Loss using a Queue  
 */

import java.util.Scanner;

public class BuySellStockQueue<E> {
    
    public static void main(String[] args) {
        
        //create a StockQueue object
        StockQueue stock = new StockQueue();
        
        int number; //to hold the number of stocks
        int price;  //to hold the price (int)
       
        Scanner keyboard = new Scanner(System.in);

        //some instance varaibles    
        char repeat;
        String input;
        char transaction;
        
        //buy-sell process
        do{
            System.out.println("What transaction do you want to do? Buy(B) or Sell(S): ");
            
            input = keyboard.next();
            input = input.toUpperCase();
            transaction = input.charAt(0);
            
            switch(transaction)
            {
                case 'B':
                    System.out.println("Fill the number of shares and price:");
            
                    System.out.println("Buy number of share(s):");      
                    number = keyboard.nextInt();

                    System.out.println("Each at $:");
                    price = keyboard.nextInt();
                    
                    stock.buyShares(number, price);
                    break;
                
                case 'S':

                    System.out.println("Fill the number of shares and prices:");
            
                    System.out.println("Sell number of share(s): ");
                    number = keyboard.nextInt();
                    
                    if(number>stock.share.getSize()){
                        System.out.println("Error! Not enough shares to sell!");
                        break;
                    }
                    
                    System.out.println("Price of Stocks: ");
                    price = keyboard.nextInt();

                    stock.sellShares(number, price);
                    break;
                
                default:
                    System.out.println("Error: Invalid input! - Please Try Again!!");
                    break;
            }

            System.out.println("do you want to continue with more transactions Y/N? ");
            String c = keyboard.next();
            repeat = c.charAt(0);
            
        }while(repeat == 'Y' || repeat == 'y');
        
        
        System.out.println("====================REPORT======================");

        System.out.println("We sold $:"+ stock.getAmtSold() + " with a "
                 + "Capital Gain of: $" + stock.getGainLoss());
         
        System.out.println("Quantity of Stocks remaining: " + stock.share.getSize());  
    }

}
