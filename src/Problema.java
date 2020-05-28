import java.util.Locale;
import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		char sexo, outroatleta;
		double altura, peso;

		outroatleta = 0;
		
		do {
			System.out.print("Nome: ");
			if (outroatleta == 'S' || outroatleta == 's') {
				sc.nextLine();
			}
			nome = sc.nextLine();
			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor Inválido! Digite novamente: ");
				sexo = sc.next().charAt(0);
			}
			
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while (altura < 0) {
				System.out.print("O valor da altura não pode ser negativo! Digite novamente: ");
				altura = sc.nextDouble();
			}
			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while (peso < 0) {
				System.out.print("O valor do peso não pode ser negativo! Digite novamente: ");
				peso = sc.nextDouble();
			}
			System.out.print("Digitar outro atleta (S/N)? ");
			outroatleta = sc.next().charAt(0);

		} while (outroatleta == 'S' || outroatleta == 's');

		sc.close();
	}

}
