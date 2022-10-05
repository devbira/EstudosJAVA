package praticasEstudos;
import java.util.*;
public class AnosBissextos {

	public static void main(String[] args) {
//sequencia com for anos bissextos
		int ano=1900;
		System.out.println("Sequencia Crescente: \n"
				+ "");
		for (;ano<=2032; ano++) {
			if (ano%4==0 && ano%100!=0|| ano%400==0) {
				System.out.println(ano+"");
			}
			
		}
//sequencia com do/while anos bissextos
		System.out.println("Sequencia decrescente\n");
			do {ano--;
				if (ano%4==0 && ano%100!=0|| ano%400==0) {
				System.out.println(ano);
			}
			} while (ano>=1900);
//sequencia com while anos bissextos
			System.out.println("Sequencia Crescente com While\n");
			while (ano<=2032) {
				ano++;
				if (ano%4==0 && ano%100!=0|| ano%400==0) {
					System.out.println(ano+"");
				}
			}
		}

	}