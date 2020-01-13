/*
 * Arquivo: interface - AgendaRepositorio
 * Autor: Paulo Alves
 * Descri��o: respons�vel por m�todos gen�ricos referentes a regra de neg�cio da aplica��o
 * Data: 12/01/2020
*/

package br.com.treinaweb.javafx.agenda.repositorios.interfaces;

import java.util.List;

public interface AgendaRepositorio<T> {
	
	List<T> selecionar();
	void inserir(T entidade);
	void atualizar(T entidade);
	void excluir(T entidade);
}
