package entities;

public class ContaBancaria {
	
	private int numeroDaConta;
	private String titularDaConta;
	private double saldo;
	
	public ContaBancaria(int numeroDaConta, String titularDaConta, double valorDeDeposito) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		this.depositar(valorDeDeposito);
	}
	
	public ContaBancaria(int numeroDaConta, String titularDaConta) {
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor + 5.0;
	}
}
