package com.Nit.OOPs_Task_16_1;

import java.util.Scanner;
public class MainTicket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter your option: ");
        int option=Integer.parseInt(sc.nextLine());
        if(option==1)
        {
        	System.out.println("Enter Event Name: ");
           String type=sc.nextLine();
           System.out.println("Enter Seat Number: ");
            int seatNo=Integer.parseInt(sc.next());
            System.out.println("Enter Price: ");
            double price=Double.parseDouble(sc.next());
            System.out.println("Enter Discount is true/false: ");
            boolean b=sc.nextBoolean();
                   

    StudentTicket studentTicket = new StudentTicket(type, seatNo, price, b);
    if(seatNo>0 && price>0)
    {
        System.out.println("\nStudent Ticket:");
        System.out.println(studentTicket);
    }
    else{
        System.out.println("Error Invalid Input");
    }
     

        }
        else if(option==2)
        {
             System.out.println("Enter Event Name: ");
            String type=sc.nextLine();
            System.out.println("Enter Seat Number: ");
            int seatNo=Integer.parseInt(sc.nextLine());
            System.out.println("Enter price: ");
            double price=Double.parseDouble(sc.nextLine());
            System.out.println("Enter Special Access: ");
            String Access=sc.next();
            VIPTicket vipTicket = new VIPTicket(type, seatNo, price,Access);
            if(seatNo>0 && price>0)
    {
        System.out.println("VIP Ticket:");
            System.out.println(vipTicket);
    }
    else{
        System.out.println("Error Invalid Input");
    }
            
        }
        else
        {
            System.out.println("invalid Ticket Type");
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
		return "Event: " + getEventName() + "\nSeat Number: " + getSeatNumber() + "\nPrice: $"
				+ getPrice() + "\nSpecial Access: " + specialAccess ;
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
		return "Event: " + getEventName() + "\nSeat Number: " + getSeatNumber() + "\nPrice: $"
				+ getPrice() + "\nStudent Discount: " + studentDiscount ;
	}
    
}
