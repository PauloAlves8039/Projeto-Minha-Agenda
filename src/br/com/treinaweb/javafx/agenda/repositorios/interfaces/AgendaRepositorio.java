/*
 * Arquivo: interface - AgendaRepositorio
 * Autor: Paulo Alves
 * Descrição: responsável por métodos genéricos referentes a regra de negócio da aplicação
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
