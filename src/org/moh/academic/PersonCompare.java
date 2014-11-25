package org.moh.academic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		return o2.getName().compareTo(o1.getName());
	}
}

class PersonNameScoreComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		int result = -1;
		if (o1.getScore() == o2.getScore()) {
			result = o1.getName().compareTo(o2.getName());
		}
		if (o1.getScore() > o2.getScore()) {
			result = 1;
		}
		return result;
	}
}

// select * form Person order by score;
class PersonScoreComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getScore() == o2.getScore()) {
			return 0;
		}
		if (o1.getScore() > o2.getScore()) {
			return 1;
		}
		return -1;

	}

}

class Person {
	// final static

	private String name;
	private int score;
	private String address1;

	public Person() {

	}

	public Person(String name, int score, String address1) {
		super();
		this.name = name;
		this.score = score;
		this.address1 = address1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

}

public class PersonCompare {
	private List<Person> people;

	PersonCompare() {
		people = new ArrayList<Person>();
	}

	public static void main(String[] args) {
		PersonCompare app = new PersonCompare();
		app.fillPeople();
		app.sortByName();
		app.sortByScore();
		// app.sortByScoreName();
		app.sortBy(new PersonNameComparator(), "Name reverse");
		app.sortBy(new PersonNameScoreComparator(), "Name score");
	}

	void printList(List lst, String msg) {
		System.out.println(msg);

		// Set namesSet;
		Iterator namesIterate = lst.iterator();
		while (namesIterate.hasNext()) {
			Object o = namesIterate.next();
			System.out.println(o);
		}
		System.out.println("");
	}

	private void sortBy(Comparator comp, String msg) {
		Collections.sort(people, comp);
		printList(people, msg);

	}

	private void sortByScoreName() {
		PersonNameScoreComparator compr = new PersonNameScoreComparator();
		Collections.sort(people, compr);
		printList(people, "Score Name");

	}

	private void sortByScore() {
		// TODO Auto-generated method stub

	}

	private void sortByName() {
		// TODO Auto-generated method stub

	}//

	private void fillPeople() {
		Person p1 = new Person("Mujeeb", 80, "aa");
		people.add(p1);
		Person p2 = new Person("Adnan", 90, "ff");
		people.add(p2);
		Person p3 = new Person("Zia", 79, "ff");
		people.add(p3);
		Person p4 = new Person("Aana", 63, "f3");
		people.add(p4);
		Person p5 = new Person("Sajid", 80, "aa");
		people.add(p5);
		printList(people, "Initial");
	}

}

class Fruit{
	
	private String name;
	private int price;
	
	public Fruit() {
		
	}
	public Fruit(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
