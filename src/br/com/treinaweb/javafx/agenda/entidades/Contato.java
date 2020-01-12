/*
 * Arquivo: Classe - Contato
 * Autor: Paulo Alves
 * Descri��o: criada para utiliza��o das propriedades da entidade contato
 * Data: 12/01/2020
*/

package br.com.treinaweb.javafx.agenda.entidades;

public class Contato {
	
	private String nome;
	private int idade;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
