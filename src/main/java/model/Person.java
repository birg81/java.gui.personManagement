package model;
public class Person {
	String firstname, lastname;
	int age;
	public Person(String firstname, String lastname, int age) throws Throwable {
		setFirstname(firstname);
		setLastname(lastname);
		setAge(age);
	}
	public void setFirstname(String firstname) throws Throwable {
		if(firstname == null || firstname.isBlank() || firstname.strip().length() <= 3) throw new Throwable("Nome non valido o troppo corto!");
		this.firstname = firstname;
	}
	public void setLastname(String lastname) throws Throwable {
		if(lastname == null || lastname.isBlank() || lastname.strip().length() <= 3) throw new Throwable("Cognome non valido o troppo corto!");
		this.lastname = lastname;
	}
	public void setAge(int age) throws Throwable {
		if(age < 1) throw new Throwable("Età non valida!");
			this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "%d,%s,%s".formatted(age, lastname, firstname);
	}
	@Override
	public boolean equals(Object o) {
		return ((Person) o).toString().equalsIgnoreCase(this.toString());
	}
}