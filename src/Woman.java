import java.util.List;

public class Woman extends Person{

	List<Car> cars;
	double salary;
	public Woman(String imie, String nazwisko, int wiek, long pesel, double salary, List<Car> cars) {
		super(imie, nazwisko, wiek, pesel);
		this.salary = salary;
		this.cars = cars;
		
	}
	public double getSalary() {
		return salary;
	}
	public List<Car> getCars() {
		return cars;
	}
	@Override
	public String toString() {
		return super.toString()+salary+" "+cars;
	}
	
	

}
