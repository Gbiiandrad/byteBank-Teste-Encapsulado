package byteBankTesteEncapsulado;

public class TestaValores {
	
	public static void main(String[] args) {
		
		int total = 0;	
		ContaTeste conta = new ContaTeste(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1232123);
		
		ContaTeste conta2 = new ContaTeste(1337, 16549);
		
		
		System.out.println("Total de contas criadas foi: " + ContaTeste.getTotal());
	}

}
