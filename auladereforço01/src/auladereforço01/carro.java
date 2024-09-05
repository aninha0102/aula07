package auladereforço01;

public class carro {
	int portas;
	String motor;
	int pneu;
	String cor;
	
	public carro(int portas, String motor, int pneu, String cor) {
		
		this.portas = portas;
		this.motor = motor;
		this.pneu = pneu;
		this.cor = cor;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getPneu() {
		return pneu;
	}

	public void setPneu(int pneu) {
		this.pneu = pneu;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}
