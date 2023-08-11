package application;

public class Programa {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();
		Conta meuSonho = new Conta();

		minhaConta.Titular = "Cuidado Arthur";
		minhaConta.numero = 34528;
		minhaConta.saldo = 200;
		
		meuSonho.Titular = "Arthur Cuidado";
		meuSonho.numero = 1259;
		meuSonho.saldo = 57672.00;
		

		System.out.println("Saldo Atual: R$ " + minhaConta.saldo);
		
		//TODO: Outra forma de fazer a mensagem de saldo insuficiente
		
		/*
		 * if(minhaConta.sacar(260)) {
		 * System.out.println("Operação Efetuada com sucesso!"); 
		 * }else {
		 * System.out.println("Saldo Insuficiente para Saque!"); 
		 * }
		 */
		
		minhaConta.sacar(198);
		System.out.println("Novo Saldo: R$ " + minhaConta.saldo);
		minhaConta.depositar(15000);
		System.out.println("Novo Saldo após Deposito: R$ " + minhaConta.saldo);

	}

}
