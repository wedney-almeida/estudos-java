package entities;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double desconto;
	public double acrescimo;
	
	
	public double descontoSlario() {
		double calcD = salario - desconto;
		return calcD;
	}
	
	public double aumentoDeSalario() {
		double aumento = salario * acrescimo;
		return aumento;
	}
/*Falta ajustar a formatação como "%.2f%n para retornar com duas casas decimais somente" */	
	public String formato() {
		String formatacao = 
				"FUNCIONARIO: " +
				nome + 
				", $ " 
				+ salario;
		return formatacao;
	}
}
