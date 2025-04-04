package com.Nit.OOPs_Task_1_3_2;

public class MobileDetails {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.name="Apple 16";
		m.cost=15000;
		m.chargerInput="type-c";
		m.batteryCapacity="7000 MAH";
		m.version=13;
		m.frontCameraQuality="32MP";
		m.backCameraQuality="108MP";
		
		m.getDetailsOfMobile();
		m.finalDiscount();
		m.finalRate();

	}

}
