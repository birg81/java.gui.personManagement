package controller;
import model.Person;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
// estende la superclasse per permettere di rendere persistenti le modifiche effettuando caricamento e salvataggio su file
public class PersonManagementTxtFile extends PersonManagement{
	static final String FILE_NAME = "peoplelist.csv";
	public PersonManagementTxtFile() {
		super();
		load();
	}
	@Override
	public boolean addPerson(Person person) {
		return super.addPerson(person) ? save() : false;
	}
	@Override
	public boolean remove(int index) {
		return super.remove(index) ? save() : false;
	}
	public boolean save() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(PersonManagementTxtFile.FILE_NAME))){
			bw.write(toString());
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean load() {
		try {
			Files.lines(Paths.get(PersonManagementTxtFile.FILE_NAME))
				.map(l -> l.split(","))
				.map(fields -> {
					try {
						return new Person(
							fields[2].strip(),
							fields[1].strip(),
							Integer.parseInt(fields[0].strip())
						);
					} catch (Throwable e) {
						e.printStackTrace();
					}
					return null;
				})
				.forEach(this::addPerson);
			return true;
		} catch (IOException e) {
			System.err.println("Errore durante il caricamento del file: " + e.getMessage());
			return false; // Restituisce false in caso di errore
		}
	}
}