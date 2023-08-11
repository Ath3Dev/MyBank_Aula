package application;

public class Conta {

	int numero;
	String Titular;
	double saldo;

	boolean sacar(double quantidade) {
		if (this.saldo < quantidade) {
			System.out.println("Saldo Insuficiente para Saque!");
			return false;
		} else {
			this.saldo -= quantidade;
			return true;
		}
	}

	void depositar(double quantidade) {
		this.saldo += quantidade;
	}

}
