package entities;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double area() {
		double calc = altura * largura;
		return calc;
	}
	
	public double perimetro() {
		double calcP = 2 * (altura + largura);
		return calcP;
	}
	
	public double diagonal() {
		double calcD = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
		return calcD;
	}
}
