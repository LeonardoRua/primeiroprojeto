package contacorrente;

public class Conta2 {
	Cliente cliente = new Cliente();
	int numero;
	double saldo;
	double limite;
	double novoSaldo;
	
	
	
	
	public void deposito(double valor){
		saldo=saldo+valor;
		
	}
	
	
	public boolean sacar(double valor){
		if (saldo+limite<valor){
			return false;
		}	else {
			saldo=saldo-valor;
			return true;
		}
	}
}
	

	
	
	
		
		
		
