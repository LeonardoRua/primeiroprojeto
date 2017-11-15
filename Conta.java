package contacorrente;

public class Conta {
	String nome;
	int numero;
	double saldo;
	double limite;
	
	
//	public void sacar(double valor){
//		saldo=saldo-valor;
//				
//	}
	
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
	
		
		
		
