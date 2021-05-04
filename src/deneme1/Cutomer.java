package deneme1;

import java.time.LocalDate;

public class Cutomer   {

	private int id;
	private String name;
	private String lastName;
	private String idendityNumber;
	private int dateOfBirth;
	
	public Cutomer(int id, String name, String lastName, String idendityNumber, int dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.idendityNumber = idendityNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdendityNumber() {
		return idendityNumber;
	}

	public void setIdendityNumber(String idendityNumber) {
		this.idendityNumber = idendityNumber;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


}
