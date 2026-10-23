package entities;

public class Individual extends Taxpayer {
	
	private Double healthcareExpenses;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double annualIcomme, Double healthcareExpenses) {
		super(name, annualIcomme);
		this.healthcareExpenses = healthcareExpenses;
	}

	public Double getHealthcareExpenses() {
		return healthcareExpenses;
	}

	public void setHealthcareExpenses(Double healthcareExpenses) {
		this.healthcareExpenses = healthcareExpenses;
	}
}
