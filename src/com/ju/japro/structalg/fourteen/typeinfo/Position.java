package com.ju.japro.structalg.fourteen.typeinfo;

public class Position {
	private String title;
	private Person person;

	public Position(String jobTitle, Person employee) {
		this.title = jobTitle;
		person = employee;
		if (person == null) {
			person = Person.NULL;
		}
	}

	public Position(String jobTitle) {
		this.title = jobTitle;
		person = Person.NULL;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String newTitle) {
		this.title = newTitle;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person newPerson) {
		this.person = newPerson;
		if (person == null)
			person = Person.NULL;
	}

	public String toString() {
		return new StringBuilder().append("Position:  ").append(title).append("  ").append(person).toString();
	}

}