package com.Nit.OOPs_Task_1_3_1;

public class TelevisonDetails {

	public static void main(String[] args) {
		Televison tv = new Televison();
		tv.name="Samsung";
		tv.cost=35000;
		tv.quality="HDR+";
		tv.size=32.5;
		tv.model="A125DD4E";
		
		tv.getTvInformation();
		tv.finalCost();

	}

}
