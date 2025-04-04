package com.Nit.OOPs_Task_1_3_2;

public class Mobile {
	String name;
	int cost;
	String chargerInput;
	String batteryCapacity;
	int version;
	String frontCameraQuality;
	String backCameraQuality;
	
	
	public void getDetailsOfMobile()
	{
		System.out.println("Name of the mobile: "+name);
		System.out.println("Cost of the mobile: "+cost);
		System.out.println("Charging input of mobile: "+chargerInput);
		System.out.println("Battery capacity of mobile: "+batteryCapacity);
		System.out.println("Version of the mobile: "+version);
		System.out.println("Quality of Front Camera: "+frontCameraQuality);
		System.out.println("Quality of Back Camera: "+backCameraQuality);
		
	}
	
	public void finalDiscount()
	{
		System.out.println("The final discount of this mobile is: "+(cost*0.1));
	}
	
	public void finalRate()
	{
		System.out.println("The final cost of this mobile is: "+(cost-(cost*0.1)));
	}
}
