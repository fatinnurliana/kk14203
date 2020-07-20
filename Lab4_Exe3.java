import java.util.Scanner;
	
	class Menu
	{
	String Item;
	double Price;
	
	Menu(String i, double p)
	{
	Item = i;
	Price = p;
	}
	
	public double getPrice()
	{
	return Price;
	}
	
	String getItem()
	{
	return Item;
	}
	
	void setItem(String Item)
	{
	this.Item = Item;
	}
	
	public void printItem()
	{
	System.out.println(" " + Item);
	System.out.print("Price : ");
	}
	
	void setPrice(double Price)
	{
	this.Price = Price;
	}
	
	String getMenuItem()
	{
	return(Item + "RM" + String.format("%.2f", Price));
	}
	
	double callPrice(int Quant)
	{
	return ((double)(Price * Quant));
	}
	}
	
	class Order
	{
	private int i_Id;
	private String n_Name;
	private int q_Quant;
	private double subTotal;
	
	Order(int id, String name, int quant, double subtotal)
	{
	i_Id = id;
	n_Name = name;
	q_Quant = quant;
	subTotal = subtotal;
	}
	}
	
	public class Lab4_Exe3
	{
	public static void main(String[] args) throws java.io.IOException
	{
	Menu[] menu = new Menu[4];
	menu[0] = new Menu("[1] Nasi Lemak", 2.00);
	menu[1] = new Menu("[2] Roti", 1.00);
	menu[2] = new Menu("[3] Teh Tarik", 1.50);
	menu[3] = new Menu("[4] Kopi O", 1.00);
	
	char ch;
	int quant;
	double price = 0;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Menu : ");
	System.out.println("--------------------");
	System.out.println(menu[0].getMenuItem());
	System.out.println(menu[1].getMenuItem());
	System.out.println(menu[2].getMenuItem());
	System.out.println(menu[3].getMenuItem());
	System.out.println("--------------------");
	System.out.println("Press n for new order | q to exit.");
	
	do
	{
	System.out.print("Add order : ");
	ch = (char) System.in.read();
	
	switch(ch)
	{
	case '1' :
	System.out.print("Nasi Lemak - Quant: ");
	quant = scan.nextInt();
	menu[0].printItem();
	price += (menu[0].getPrice() * quant);
	System.out.println(menu[0].getPrice() * quant);
	break;
	
	case '2' :
	System.out.print("Roti - Quant : ");
	quant = scan.nextInt();
	menu[1].printItem();
	price += (menu[1].getPrice() * quant);
	System.out.println(menu[1].getPrice() * quant);
	break;
	
	case '3' :
	System.out.print("Teh Tarik - Quant : ");
	quant = scan.nextInt();
	menu[2].printItem();
	price += (menu[2].getPrice() * quant);
	System.out.println(menu[2].getPrice() * quant);
	break;
	
	case '4' :
	System.out.print("Kopi O - Quant : ");
	quant = scan.nextInt();
	menu[3].printItem();
	price += (menu[3].getPrice() * quant);
	System.out.println(menu[3].getPrice() * quant);
	break;
	
	default:
	break;
	}
	}
	while(ch!='q');
	System.out.println("\nThank you for your order.");
	System.out.printf("Total due : RM %.2f", price);
	}
	}