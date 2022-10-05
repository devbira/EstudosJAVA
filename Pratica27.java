package praticasEstudos;

public class Pratica27 {

	public static void main(String[] args) {
	int n1=10,qtd=0,multi=n1*3;
	do {multi=n1*3;
		n1=multi;
		qtd++;
		System.out.println(multi);
	} while (qtd<10);

	}

}
