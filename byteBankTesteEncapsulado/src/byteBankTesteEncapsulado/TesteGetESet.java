package byteBankTesteEncapsulado;

public class TesteGetESet {
	
	public static void main(String[] args) {
		
		ContaTeste conta = new ContaTeste(1337, 24226);
		
		//mostrar o numero da conta		
		System.out.println(conta.getNumero());
		
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Da Silva");
		
		conta.setTitular(paulo);// mostrará q o titulos da conta é o Paulo
		
		System.out.println(conta.getTitular().getNome());
		
		
		
		// conta.getTitular().setProfissao("programador"); é a mesma coisa da linha de baixo:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		
		//Será a mesma coisa mesmo chamando de formas diferentes.
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		
		
	}

}
