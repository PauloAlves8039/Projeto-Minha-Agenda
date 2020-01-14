/*
 * Arquivo: Classe - ContatoRepositorio
 * Autor: Paulo Alves
 * Descri��o: respons�vel por implementar m�todos da interface AgendaRepositorio
 * Data: 12/01/2020
*/

package br.com.treinaweb.javafx.agenda.repositorios.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.treinaweb.javafx.agenda.entidades.Contato;
import br.com.treinaweb.javafx.agenda.repositorios.interfaces.AgendaRepositorio;

public class ContatoRepositorio implements AgendaRepositorio<Contato> {

	private static List<Contato> contatos = new ArrayList<Contato>();

	@Override
	public List<Contato> selecionar() {
		return contatos;
	}

	@Override
	public void inserir(Contato entidade) {
		contatos.add(entidade);
	}

	@Override
	public void atualizar(Contato entidade) {
		var original = contatos.stream().filter(contato -> contato.getNome().equals(entidade.getNome())).findFirst();
		if (original.isPresent()) {
			original.get().setIdade(entidade.getIdade());
			original.get().setTelefone(entidade.getTelefone());
		}
	}

	@Override
	public void excluir(Contato entidade) {
		contatos.remove(entidade);
	}

}
