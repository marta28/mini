import java.util.List;

public class Person {

	protected String imie;
	protected String nazwisko;
	protected int wiek;
	protected long pesel;

	public Person(String imie, String nazwisko, int wiek, long pesel) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.pesel = pesel;
	}

	public String getImie() {
		return imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public int getWiek() {
		return wiek;
	}

	public long getPesel() {
		return pesel;
	}

	@Override
	public String toString() {
		return imie+" "+nazwisko+" "+wiek;
	}

	
}
