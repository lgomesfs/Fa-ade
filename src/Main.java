import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Selecione seu compo");
		System.out.println("1. Combo Master");
		System.out.println("2. Super Combo");System.out.print("Sua escolha: ");
		Scanner sc = new Scanner(System.in);
		int tipo = sc.nextInt();
		
		Combo combo = new Combo();
		combo.criarCombo(tipo);
		System.out.println(combo);
		
		sc.close();

	}

}
