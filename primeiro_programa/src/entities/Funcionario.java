package entities;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double desconto;
	
	
	public double descontoSalario() {
		double calcD = salario - desconto;
		return calcD;
	}
	
	public void aumentoDeSalario(double acrescimo) {
		salario = salario + salario * acrescimo / 100;

	}

	public String toString() {
		return "FUNCIONARIO: " 
				+ nome + ", $ "
				+ String.format("%.2f", descontoSalario());
	}
}
