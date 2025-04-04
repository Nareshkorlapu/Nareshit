package com.Nit.OOPs_Task_1_2;

public class FanDetails {

	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.name = "usha";
		fan.coil="external coil";
		fan.wings=3;
		
		fan.getFanDetails();
		fan.switchOn();
		fan.switchOff();

	}

}
