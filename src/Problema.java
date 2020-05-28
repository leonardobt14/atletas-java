import java.util.Locale;
import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome, alturamaior;
		char sexo, outroatleta;
		double altura, peso, pesomedio, pesototal,alturaatleta, porcentagemhomem, alturamediamulher, alturatotalmulher;
		int contagem, numeromulher, numerohomem;

		outroatleta = 0;
		contagem = 0;
		pesototal = 0;
		altura = 0;
		numerohomem = 0;
		numeromulher = 0;
		alturamediamulher = 0;
		alturatotalmulher = 0;
		alturaatleta = 0;
		
		
		do {
			System.out.print("Nome: ");
			if (outroatleta == 'S' || outroatleta == 's') {
				sc.nextLine();
			}
			nome = sc.nextLine();
			alturamaior = nome;
			alturaatleta = altura;
			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor Inválido! Digite novamente: ");
				sexo = sc.next().charAt(0);
			}
			if (sexo == 'M') {
				numerohomem = numerohomem + 1;
			}
			
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			if (sexo == 'F') {
				numeromulher = numeromulher + 1;
				alturatotalmulher = alturatotalmulher + altura;
			}
			while (altura < 0) {
				System.out.print("O valor da altura não pode ser negativo! Digite novamente: ");
				altura = sc.nextDouble();
			}
			alturaatleta = altura;
			while (alturaatleta > altura) {
			    alturamaior = nome;
			}

			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while (peso < 0) {
				System.out.print("O valor do peso não pode ser negativo! Digite novamente: ");
				peso = sc.nextDouble();
			}
			System.out.print("Digitar outro atleta (S/N)? ");
			outroatleta = sc.next().charAt(0);
			
			contagem = contagem + 1;
			pesototal = pesototal + peso;
			

		} while (outroatleta == 'S' || outroatleta == 's');
		
		pesomedio = pesototal / contagem;
		porcentagemhomem = (100.0 / contagem) * numerohomem;
		alturamediamulher = alturatotalmulher / numeromulher;
		
		
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n" , pesomedio);
		System.out.println("Atleta mais alto: " + alturamaior);
		System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemhomem );
		System.out.printf("Altura média das mulheres: %.2f%n" , alturamediamulher);
		System.out.println();
		System.out.print("FIM DO PROGRAMA!");

		sc.close();
	}

}
