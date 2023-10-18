package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Escreva o parametro 1: ");
		int parametro1 = sc.nextInt();
		System.out.print("Escreva o parametro 2: ");
		int parametro2 = sc.nextInt();
		
		try {
			contar(parametro1, parametro2);
		}catch(ParametrosInvalidosException e) {
			System.out.println("O parametro 1 deve ser maior que o parametro 2!  ");
		}
		
		sc.close();
	}

	static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
		if(parametro1 > parametro2) {
			throw new ParametrosInvalidosException();
		}else {
			for(int i = 0; i < (parametro2 - parametro1); i++) {
				System.out.println("Imprimindo o número " + (i + 1));
			}
		}
		
		
	}
	
}
