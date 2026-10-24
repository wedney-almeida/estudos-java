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

	@Override
	public double tax() {
		double basicTax = 0.0;
		if(getAnualIcomme() < 20000) {
			basicTax = getAnualIcomme() * 0.15;
		}
		else {
			basicTax = getAnualIcomme() * 0.25;
		}
		basicTax =  basicTax - (getHealthcareExpenses() * 0.50);
		return basicTax;
	}
	
}
