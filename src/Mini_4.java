import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mini_4 {

	public static void main(String[] args) {

		Car c1 = new Car("Kia", 2017, Color.BLACK);
		Car c2 = new Car("Toyota", 2009, Color.RED);
		Car c3 = new Car("Ford", 2012, Color.SILVER);
		Car c4 = new Car("BMW", 2016, Color.BLACK);

		List<Car> car1 = new ArrayList<>();
		car1.add(c1);
		car1.add(c2);
		car1.add(c3);

		List<Car> car2 = new ArrayList<>();
		car2.add(c4);

		Person p1 = new Child("Krzys", "Zbys", 4, 94029381999L);
		Person p2 = new Child("Paul", "Miks", 7, 95049382719L);
		Person p3 = new Child("Rafcio", "Kik", 9, 92019283049L);
		Person p4 = new Woman("Renata", "Lof", 47, 69071799281L, 1500, car1);
		Person p5 = new Woman("Natala", "Kot", 21, 96019283749L, 1500, car2);
		Person p6 = new Man("Mateusz", "Klucz", 21, 96039281029L, 5000);
		Person p7 = new Man("Ludwik", "Bos", 50, 67583920302L, 10000);

		List<Person> personList = new ArrayList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		personList.add(p6);
		personList.add(p7);

		Map<Long, Person> personMap = new HashMap<>();
		for (Person person : personList) {
			personMap.put(person.getPesel(), person);
		}

		Set<Long> pesels = new HashSet<>();
		Set<Entry<Long, Person>> entmap = personMap.entrySet();
		for (Entry<Long, Person> entry : entmap) {
			Person person = entry.getValue();
			if (person instanceof Woman) {
				Woman woman = (Woman) person;
				if (woman.getCars().size() > 1) {
					pesels.add(woman.getPesel());
				}
			}
		}
		double age = 0;
		double avg = 0;
		Set<String> young = new HashSet<>();
		Set<Entry<Long, Person>> entmapy = personMap.entrySet();
		for (Entry<Long, Person> entry : entmapy) {
			Person youngPerson = entry.getValue();
			if (youngPerson instanceof Child) {
				Child child = (Child) youngPerson;
				young.add(youngPerson.getNazwisko());
				age = youngPerson.getWiek();
				avg += age;

			}

		}
		System.out.println(young);
		System.out.println(avg / young.size());

		for ( Long key : personMap.keySet()) {
			Person person = personMap.get(key);
			if (person instanceof Woman) {
				Woman woman = (Woman) person;
				for (Car car : woman.getCars()) {
					System.out.println(car.getBrand() + " " + woman.getNazwisko());
				}
			}
		}

		// System.out.println(personList);
		// System.out.println(personMap);
		//
		//
		// List<Person> adultPersons = getAdultPersons(personList);
		// System.out.println(adultPersons);
		//
		// List<Person> oldPersons = getOldPersons(personList);
		// System.out.println(oldPersons);
		//
		// List<String> surname = surnames(personList);
		// System.out.println(surname);
		//
		// Person oldest = oldest(personList);
		// System.out.println(oldest);
		//
		// double sum = sum(personList);
		// System.out.println(sum);
		//
		// List<Person> avgWoman = new ArrayList<>();
		// double womanSum = 0;
		// double manSum = 0;
		// int amountW = 0;
		// int amountM = 0;
		// for (Person person : personList) {
		// if (person instanceof Woman) {
		// Woman woman = (Woman) person;
		// amountW++;
		// womanSum += woman.getSalary();
		//
		// }
		//
		// if (person instanceof Man) {
		// Man man = (Man) person;
		// manSum += man.getSalary();
		// amountM++;
		// }
		// }
		// System.out.println(womanSum / amountW);
		// System.out.println(manSum / amountM);
		//
		// highSalary(personList);

	}

	private static void highSalary(List<Person> personList) {
		List<String> highSalary = new ArrayList<>();
		for (Person person : personList) {
			if (person instanceof Woman) {
				Woman woman = (Woman) person;

				if (woman.getSalary() >= 2000) {
					highSalary.add(woman.getNazwisko());

				}
			}
			if (person instanceof Man) {
				Man man = (Man) person;
				if (man.getSalary() >= 2000) {
					highSalary.add(man.getNazwisko());
				}
			}
		}
		System.out.println(highSalary);
	}

	private static double sum(List<Person> personList) {
		double sum = 0;
		for (Person person : personList) {
			if (person instanceof Woman) {
				Woman woman = (Woman) person;
				sum += woman.getSalary();

			}
			if (person instanceof Man) {
				Man man = (Man) person;
				sum += man.getSalary();
			}
		}
		return sum;
	}

	private static Person oldest(List<Person> personList) {
		Person oldest = null;
		int oldestNow = -1;
		for (Person person : personList) {
			if (person.getWiek() > oldestNow) {
				oldestNow = person.getWiek();
				oldest = person;
			}

		}
		return oldest;
	}

	private static List<String> surnames(List<Person> personList) {
		List<String> surname = new ArrayList<>();
		for (Person person : personList) {
			String surnames = person.getNazwisko().toUpperCase();
			surname.add(surnames);

		}
		return surname;
	}

	private static List<Person> getOldPersons(List<Person> personList) {
		List<Person> oldPersons = new ArrayList<>();
		for (Person person : personList) {
			if (person.getWiek() >= 30) {
				oldPersons.add(person);

			}

		}
		return oldPersons;
	}

	private static List<Person> getAdultPersons(List<Person> personList) {
		List<Person> adultPersons = new ArrayList<>();
		for (Person person : personList) {
			if (person instanceof Man || person instanceof Woman) {
				adultPersons.add(person);

			}

		}
		return adultPersons;
	}

}
