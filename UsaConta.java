package contacorrente;

public class UsaConta {
	public static void main(String[] args) {
		
		Conta c=new Conta();
		
		c.numero=001;
		c.nome="Jo�o";
		c.saldo=1000;
		c.limite=2000;
		
		System.out.println("N�mero da conta: "+c.numero);
		System.out.println("Titular "+c.nome);
		System.out.println("Saldo atual: "+c.saldo);
		System.out.println("Limite: "+c.limite);
		
		double saque = 3001;
		
		boolean resultadoSaque = c.sacar(saque);
			
		if(resultadoSaque){
			System.out.println("Voc� sacou R$: "+saque+" e seu saldo � R$: "+c.saldo);
		} else {
			System.out.println("Voc� � pobre! N�o tem limites Mwahahaha");
		}
	 
	
	Conta b=new Conta ();
	
		b.numero=001;
		b.nome="Jo�o";
		b.saldo=1000;
		b.limite=2000;
	
//		boolean resultadoSaque = c.sacar(saque);
		if (c==b){
			System.out.println("As duas contas s�o iguais");
		} else {
			System.out.println("As duas contas s�o diferentes");
		}
				
	}
}
