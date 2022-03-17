package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Importado;
import entities.Produto;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> lista = new ArrayList<>();
		Locale.setDefault(Locale.US);
		
		System.out.print("Entre com o numero de produtos:");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Produto #" + i +" dados: ");
			System.out.println();
			System.out.print("Comum, usado or importado (c/u/i)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("preco: ");
			double preco = sc.nextDouble();
			if(tipo == 'c') {
				lista.add(new Produto(nome,preco));
			}else if(tipo == 'u') {
				System.out.print("Data de Fabricacao (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				lista.add(new ProdutoUsado(nome,preco,date));
			}else {
				System.out.print("taxa importacao");
				double taxaImportacao = sc.nextDouble();
				lista.add(new Importado(nome,preco,taxaImportacao));
			}
		}
		
		System.out.println();
		System.out.println("Preços das etiquetas");
		for (Produto pr : lista) {
			System.out.println(pr.etiquetaPreco());
		}
		
		sc.close();
		
	}

}
