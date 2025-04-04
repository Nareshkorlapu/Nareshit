package CommandLineArgument;

import java.util.Scanner;

public class MainTicket
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option==1)
        {

            String ename=sc.nextLine();
            int seatNum = sc.nextInt();
           
            double price =Double.parseDouble(sc.nextLine());
            boolean sDiscount = sc.nextBoolean();
StudentTicket s1 = new StudentTicket(ename,seatNum,price,sDiscount);
                System.out.println(s1);
        }
        else if(option==2)
        {
             String ename=sc.nextLine();
            int seatNum = sc.nextInt();
           
            double price =Double.parseDouble(sc.nextLine());
            String specialAccess = sc.nextLine();
     VIPTicket v1 = new VIPTicket(ename,seatNum,price,specialAccess);
     System.out.println(v1);

        }
        else
        {
            System.out.println("Invalid input option");
        }
        
        sc.close();
        
    }
}

class Ticket
{
    private String eventName;
    private int seatNumber;
    private double price;

    public Ticket(String eventName,int seatNumber,double price)
    {
        this.eventName = eventName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
    
}

class VIPTicket extends Ticket
{
    private String specialAccess;

    public VIPTicket(String eventName,int seatNumber,double price,String specialAccess)
    {
        super(eventName,seatNumber,price);
        this.specialAccess = specialAccess;
    }

	public String getSpecialAccess() {
		return specialAccess;
	}

	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}

	@Override
	public String toString() {
		return "VIPTicket [getEventName()=" + getEventName() + ", getSeatNumber()=" + getSeatNumber() + ", getPrice()="
				+ getPrice() + ", specialAccess=" + specialAccess + "]";
	}

    

}

class StudentTicket extends Ticket
{
    private boolean studentDiscount;

    public StudentTicket(String eventName,int seatNumber,double price,boolean studentDiscount)
    {
        super(eventName,seatNumber,price);
        this.studentDiscount = studentDiscount;
    }
    
    public boolean getStudentDiscount()
    {
        return studentDiscount;
    }
    public void setStudentDiscount(boolean studentDiscount)
    {
        this.studentDiscount = studentDiscount;
    }

	@Override
	public String toString() {
		return "StudentTicket [getEventName()=" + getEventName() + ", getSeatNumber()=" + getSeatNumber()
				+ ", getPrice()=" + getPrice() + ", studentDiscount=" + studentDiscount + "]";
	}
    
}