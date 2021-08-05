package code.com.desfaio.appRafael.tests;

import code.com.desfaio.appRafael.domain.Plant;

public class PlantTest {
	public static void main(String[] args) {
		Plant plant = new Plant("Epipremnum pinnatum", "Araceae", "Jibóia");
		
		plant.setDaysToGrow(14);
		plant.setMaxHight(4.75f);
		
		System.out.println(plant);
	}
}
