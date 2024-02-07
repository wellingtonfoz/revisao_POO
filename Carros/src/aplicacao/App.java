package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
	private static List<Carro> carros = new ArrayList<>();
	private static Scanner leitor = new Scanner(System.in);

	public static void main(String[] args) {
		
		Marca marca = new Marca();
		marca.setNome("Fiat");
		
		Categoria categoria = new Categoria();
		categoria.setNome("SUV");
		
		Categoria categoria2 = new Categoria();
		categoria2.setNome("Hatch");
		
		
		Carro carro1 = new Carro();
		carro1.setNome("Fastback");
		carro1.setMarca(marca);
		carro1.setCategoria(categoria);
		
		Carro carro2 = new Carro();
		carro2.setNome("Uno");
		carro2.setMarca(marca);
		carro2.setCategoria(categoria2);
		
		Carro carro3 = new Carro();
		carro3.setNome("Argo");
		carro3.setMarca(marca);
		carro3.setCategoria(categoria2);
		
		carros.add(carro1);
		carros.add(carro2);
		carros.add(carro3);
		
		
		

		int opcao = 0;

		do {

			System.out.println("---------- MENU: -----");
			System.out.println("1) Listar carros");
			System.out.println("2) Incluir carro");
			System.out.println("5) Sair");
			System.out.println("Escolha a opção desejada: ");
			
			opcao = leitor.nextInt();


			switch (opcao) {
				case 1: listar(); break;
				case 2: incluir(); break;
			}

		} while (opcao != 5);


	}
	
	public static void listar() {
		
		System.out.println("listando...");
		
		if(carros != null)
			for(int i = 0; i<carros.size(); i++) {
				System.out.println(carros.get(i).getNome());
			}
		System.out.println("\n\n\n");
		
		
	}
	
	public static void incluir() {
		
		System.out.println("Digite a marca do carro:");
		String nomeMarca = leitor.next();
		
		Marca marca = new Marca();
		marca.setNome(nomeMarca);
		
		
		System.out.println("Digite a categoria do carro:");
		String nomeCategoria = leitor.next();

		Categoria categoria = new Categoria();
		categoria.setNome(nomeCategoria);
		
		System.out.println("Digite o nome do carro:");
		String nomeCarro = leitor.next();

		Carro carro = new Carro();
		carro.setNome(nomeCarro);
		carro.setMarca(marca);
		carro.setCategoria(categoria);
		
		carros.add(carro);
		
		System.out.println("Carro incluído com sucesso!");
	}

}
