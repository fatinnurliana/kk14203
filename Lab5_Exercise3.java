import java.util.Scanner;
abstract  class Cake{
   public String name;
   public String[] topping, toppingOrder;
   public double priceSmall,priceMedium,priceBig,totalPrice;
   public int size, quantity;
  
  Cake(String name){
     this.name = name;
  }
    abstract void setCake(String[] Topping, double PriceSmall, double PriceMedium, double PriceBig);
    
    void orderCake(String[] toppingOrder, int quantity, int size){
     this.topping = toppingOrder;
     this.quantity = quantity;
     this.size = size;
     
    }
    
    double getSizePrice()
    {
     if(size == 1)
     {
      return priceSmall;
     }
     else if(size == 2)
     {
      return priceMedium;
     }
     else
     {
      return priceBig;
     }
    }
    
    double getTotalPrice()
    {
     totalPrice = getSizePrice() * quantity + (toppingOrder.length *10);
     return totalPrice;
    }
    
    String getSize()
    {
     String Size = " ";
     if(size == 1 )
     {
       Size = "S";
     }
     else if( size == 2)
     {
      Size = "M";
     }
     else if (size == 3)
     {
       Size = "B";
     }
     return Size;
    }
    void printCake(){
        System.out.println("-------------------------------");
        System.out.println("            Cake Menu         ");
        System.out.println("-------------------------------");
        System.out.println(name + "with available toppings : ");
        
        for( int i=0; i< topping.length; i++){
               System.out.println ((Integer.toString(i+1)) + ")" +topping[i]);
    }
    
     System.out.println("\nPrice : ");
     System.out.println( "[1] Small : RM " + priceSmall);
     System.out.println( "[2] Medium :RM " + priceMedium);
     System.out.println( "[3] Big :RM " + priceBig);
     
   }
   void printOrder(){
   
    System.out.println("\nCake Order detail: ");
      System.out.println("--------------------------------------");
      System.out.print("Topping : ");
      for(int i = 0; i < toppingOrder.length; i++)
         System.out.print(i+1 + ") " + toppingOrder[i] + " ");
      System.out.println("\n size \t: " + getsize(size));
      System.out.println("--------------------------------------");
      System.out.println("Total Price: RM" + getTotalPrice());
      System.out.println("--------------------------------------");
     }
    }
class BlackForest extends Cake{
     
     BlackForest(String n){
      super(n);
     }
     
     void setCake(String[] t, double ps, double pm, double pb){
     
      topping = t;
      priceSmall = ps;
      priceMedium = pm;
      priceBig = pb;
      }
     
   }
   
public class Lab5_Exercise3{
     
      public static void main(String args[]){
         Cake c = new BlackForest("BlackForest");
         String[] topping ={"Chocolate", "Cherries", "Whipped Cream"};
         c.setCake(topping, 45.00, 65.00 , 80.00);
         c.printCake();
         String[] order = {"Chocolate" , "Cherries"};
         
         c.orderCake(order, 1,2);
         c.printOrder();
      }
     
     }
