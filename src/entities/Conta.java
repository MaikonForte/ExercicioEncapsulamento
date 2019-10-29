package entities;

public class Conta {
	// Atributos

	private String titular;
	private int numeroConta;
	private double saldo;

	// metodos

	public Conta(String titular, int numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
	}

	public Conta(String titular, int numeroConta, double depositoInicial) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saldo -= valor + 5;
	}

	public String toString() {

		return "Conta "

				+ numeroConta

				+ ", Titular: "

				+ titular

				+ ", saldo: $ "

				+ String.format("%.2f", saldo);

	}

}
