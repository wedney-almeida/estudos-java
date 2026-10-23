package entities;

public class LegalEntity extends Taxpayer {
	
	private Integer numberOfEmployees;
	
	public LegalEntity() {
		super();
	}

	public LegalEntity(String name, Double annualIcomme, Integer numberOfEmployees) {
		super(name, annualIcomme);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
}
