
public class Man extends Person {
double salary;
	public Man(String imie, String nazwisko, int wiek, long pesel, double salary) {
		super(imie, nazwisko, wiek, pesel);
	this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}

}
