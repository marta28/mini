
public class Car {

	private String brand;
	private int year;
	Color color;
	
	public Car(String brand, int year, Color color){
		this.brand = brand;
		this.color = color;
		this.year = year;
		
	}

	@Override
	public String toString() {
		return  brand + " " + year + " " + color;
	}

	public String getBrand() {
		return brand;
	}

	public int getYear() {
		return year;
	}

	public Color getColor() {
		return color;
	}
	
}
