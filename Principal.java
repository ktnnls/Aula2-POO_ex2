package empresa;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(111, "Ribamar",2000,500);
		
		c1.info();
		
		if(!c1.sacar(200)) {
			System.out.println("Ocorreu um problema ao sacar!.");
		};
		
		if(!c1.depositar(500)) {
			System.out.println("Ocorreu um problema ao depositar!");
		};
		System.out.println();
		c1.info();

	}

}
