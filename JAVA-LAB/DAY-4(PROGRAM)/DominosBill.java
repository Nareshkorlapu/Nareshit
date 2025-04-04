/*
Program 01:
-----------
Write a  program in Java that will generate and print the bill at Dominos for four chicken rolls (@ Rs 60 per chicken rolls) and three vegetable puffs (@ Rs 25 per vegetable puffs). There is a special discount of Rs 50 on the final bill amount. Calculate and print final bill as well as all item bill.
*/
public class DominosBill
{
	public static void main(String [] args)
	{
		int chickenroll =60;
		int vegpuff = 25;
		int specialdiscount=50;

		int noofchickenroll=Integer.parseInt(args[0]);
		int noofvegpuff =Integer.parseInt(args[1]);
		
		int totalbill=(chickenroll*noofchickenroll+vegpuff*noofvegpuff)-specialdiscount;
		
		System.out.println("Chicken rolls="+chickenroll+"*"+noofchickenroll+"="+chickenroll*noofchickenroll);
		System.out.println("Veg puffs ="+vegpuff+"*"+noofvegpuff+"="+vegpuff*noofvegpuff);
		System.out.println("The total bill is:"+totalbill);
	}
}