package lista1;

import java.util.ArrayList;


public class Agenda {
	private ArrayList<contato> contatos;
	
	public Agenda(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public void addContato(Contato ctt) {
		contatos.add(ctt);
	}
	
	public Contato buscarContato(String nome) {
		for(int i = 0; i < contatos.size(); i++) {
			if(contatos.get(i).getNome() == nome) {
				return contatos.get(i);
		}
	}
	return null;
}
	public void excluirContato(String nome) {
		Contato c = this.buscarContato(nome);
		this.contatos.remove(c);
		for (int i = 0; i < contatos.size(); i++) {
			if(contatos.get(i).getNome() == nome) {
				contatos.remove(i);
			}
		}
	}
