package code.com.desfaio.appRafael.domain;

public class Plant {
	private String species;
	private String name;
	private String region;
	private String family;
	private int daysToGrow;
	private int daysToWater;
	private float maxHight;
	private boolean isFruitful;
	
	public Plant(String species, String family, String name) {
		this.species = species;
		this.family = family;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  "Especies: " + species +
				" | Family: " + family +
				" | Name: " + name +
				" | Days to grow: " + daysToGrow +
				" | Maximum height: " + maxHight;
	}
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}
	public int getDaysToGrow() {
		return daysToGrow;
	}
	public void setDaysToGrow(int daysToGrow) {
		this.daysToGrow = daysToGrow;
	}
	public int getDaysToWater() {
		return daysToWater;
	}
	public void setDaysToWater(int daysToWater) {
		this.daysToWater = daysToWater;
	}
	public float getMaxHight() {
		return maxHight;
	}
	public void setMaxHight(float maxHight) {
		this.maxHight = maxHight;
	}
	public boolean isFruitful() {
		return isFruitful;
	}
	public void setFruitful(boolean isFruitful) {
		this.isFruitful = isFruitful;
	}
	
	
}
