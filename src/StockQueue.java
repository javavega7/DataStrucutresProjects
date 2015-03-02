/**
 *
 * @author javier vega
 * 
 * Data Structures Project 2015
 * @Stockton University (NJ)
 * 
 * Class StockQueue creates objects Queues and its
 * methods to store the number of stocks and the prices
 * 
 * 
*/
public class StockQueue{

    private int totalGain = 0;    //to store the total gain or loss
    private int gainPerShare;   //to store gain or loss per share sold 
    private int AmountPaid;     //to atore total cost of buy transaction
    private int AmountSold;     //to store total amount os selling transaction
    private int totalShares;    //to store total shares after transactions
    private int totalAmountSold;
    private int pricePerShare;  
    private int numberSold;
    private int pricePaid;
    
    //Two queues to represent the share and
    //its correponding price 
    Queue share = new Queue();
    Queue price = new Queue();
    
    //method that executes the buying transaction
    public void buyShares(int numberShares, int buyingPrice){
        totalShares += numberShares;
        pricePaid = buyingPrice;
        AmountPaid = numberShares * buyingPrice;
        
        //to represent one unit of shares
        int one = 1;
        
        //to store the number of shares and 
        //price in the queues
        for(int i=1; i<=numberShares; i++){    
            share.offer(one);
            price.offer(buyingPrice);
        }
        
    }
    
    //method that excecutes the selling transaction
    public void sellShares(int numberShares, int sellPrice){
        
        numberSold = numberShares;
        totalShares -= numberShares;
        AmountSold = numberShares*sellPrice;
        totalAmountSold += AmountSold;
         
        int one; //to represent one unit of share
        int onePrice; //its price
        
        //to calculate the Gain-Loss
        //poll one element of the Queue at a time
        //with its price make the calculations
        for(int i = 1; i<=numberShares; i++ ){
           one = (int) share.poll();
           onePrice = (int) price.poll();
           gainPerShare = sellPrice - onePrice;
           totalGain += gainPerShare; 
        }      
    }
    
    /**
     *  
     * Methods to return values from 
     * transactions
     * @return 
     */
    public int getGainLoss(){  
        return totalGain;
    }
    
    public int getAmtSold(){
        return totalAmountSold;
    }
   
    public int getAmtPaid(){
        return AmountPaid;
    }        
    
    public void toEmpty(){
        while(share.hasItems() || price.hasItems()){
            System.out.println("share:" + share.poll()+ "  price:"+ price.poll());
        }
    }
    
    public int getSize(){
        return totalShares;
    }
    
}
