package contacorrente;

public class TestaConta2 {
	public static void main(String[] args) {
		Conta2 c2 = new Conta2();
		Cliente c1 = new Cliente();
		c1 =c2.cliente;
		c2.cliente.nome = "Clayton";
		System.out.println(c2.cliente.nome);
	}

}
