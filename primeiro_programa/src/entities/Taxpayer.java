package entities;

public abstract class Taxpayer {
	
	private String name;
	private Double annualIcomme;
	
	public Taxpayer() {
		super();
	}

	public Taxpayer(String name, Double annualIcomme) {
		super();
		this.name = name;
		this.annualIcomme = annualIcomme;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIcomme() {
		return annualIcomme;
	}

	public void setAnnualIcomme(Double annualIcomme) {
		this.annualIcomme = annualIcomme;
	}
	
	public abstract double tax();
}
