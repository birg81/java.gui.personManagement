package controller;
import model.Person;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class PersonManagement {
	// gestisce un ArrayList di persone e permette l'inserimento e l'eliminazione degli stessi
	protected List<Person> people = new ArrayList<>();
	public boolean addPerson(Person person) {
		return people.stream().noneMatch(p -> person.equals(p)) ? people.add(person) : false;
	}
	public boolean remove(int index) {
		return index >= 0 && index < people.size() ? people.remove(index) != null : false;
	}
	public List<Person> getPeople() {
		return people;
	}
	@Override
	public String toString() {
		return people.size() > 0 ? people.stream().map(Person::toString).collect(Collectors.joining("\n")) : "";
	}
}