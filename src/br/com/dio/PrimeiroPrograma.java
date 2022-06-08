package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livros;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("nome", "cor", "idade");
		Livros livros = new Livros();
		
		livros.setNome("O conto da aia");
		livros.setAno(1985);
		livros.setAutor("Margaret Atwood");
		livros.setGenero("Ficção Científica");
		
		System.out.println(livros);
		
	
		
		
		System.out.println(gato);

	}

}