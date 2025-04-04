package com.Nit.OOPs_Task_23_Abstract;

import java.util.*;
public class CakeOrder
{
    public static void main(String[] args)
    {
    OrderedCake cake = null;
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter your choice as[1/2/3]");
    int option = sc.nextInt();
    sc.nextLine();
    switch(option)
    {
        case 1:
           cake = new OrderedCake();
           System.out.println(cake);
           break;
        case 2:
        	System.out.println("Enter the shape of the cake: ");
            String shape = sc.nextLine();
            System.out.println("Enter the flavour of the cake: ");
            String flavor = sc.nextLine();
            System.out.println("Enter the quantity of the cake: ");
            int quantity = sc.nextInt();
            if(quantity>0)
            {
                cake = new OrderedCake(shape,flavor,quantity);
        System.out.println(cake);
        }
        else
        {
            System.out.println("Quantity must be positive.");
        }
        break;
        case 3:
        	System.out.println("Enter the shape of the cake: ");
        shape = sc.nextLine();
        System.out.println("Enter the flavour of the cake: ");
        flavor = sc.nextLine();
        System.out.println("Enter the quantity of the cake: ");
        quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the message for this cake: ");
        String msg = sc.nextLine();
        if(quantity>0)
        {
        cake = new OrderedCake(shape,flavor,quantity,msg);
        System.out.println(cake);
        }
        else
        {
            System.out.println("Quantity must be positive.");
        }
        break;
        default:
        System.out.println("Invalid choice.");
    }
}
}
abstract class Cake
{
    private String shape;
    private String flavor;
    private int quantity;
    private double price;

    public Cake(String shape,String flavor,int quantity)
    {
        this.shape = shape;
        this.flavor = flavor;
        this.quantity = quantity;
    }
    public String getShape()
    {
        return shape;
    }
    public void setShape(String shape)
    {
        this.shape = shape;
    }
    public String getFlavor()
    {
        return flavor;
    }
    public void setFlavor(String flavor)
    {
        this.flavor = flavor;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public abstract String toString();
}
class OrderedCake extends Cake
{
    private String message;
    public OrderedCake()
    {
        super("Rounded","Vanilla",1);
        setPrice(400.0);
    }
    public OrderedCake(String shape,String flavor,int quantity)
    {
        // this.shape = shape;
        // this.flavor = flavor;
        // this.quantity = quantity;
        super(shape,flavor,quantity);
        setPrice(quantity*400.0);
    }
    public OrderedCake(String shape,String flavor,int quantity,String message)
    {
        super(shape,flavor,quantity);
        setPrice(quantity*400.0);
        this.message = message;
    }
    @Override
    public String toString()
    {
         if (message != null) {
            return "A"+getShape()+""+getFlavor()+" Cake of "+getQuantity()+"KG is Ready with "+message+" message @ Rs."+getPrice();
        } else {
            return  "A "+getShape()+" "+getFlavor()+" Cake of "+getQuantity()+" KG is Ready @ Rs."+getPrice();
        }

    }
}