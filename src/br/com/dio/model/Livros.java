package br.com.dio.model;

import java.util.Objects;

public class Livros {
	
	private String nome;
	private String genero;
	private String autor;
	private Integer ano;
	
	public Livros(String nome, String genero, String autor, Integer ano) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.autor = autor;
		this.ano = ano;
	}
	
	public Livros() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ano, autor, genero, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		return Objects.equals(ano, other.ano) && Objects.equals(autor, other.autor)
				&& Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", genero=" + genero + ", autor=" + autor + ", ano=" + ano + "]";
	}

}
