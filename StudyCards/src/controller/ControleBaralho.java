package controller;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import dao.CartaDAO;
import model.Carta;
import view.PainelBaralho;

public class ControleBaralho implements ActionListener{
	private PainelBaralho painel_baralho;
	private ArrayList<Carta> lista_cartas_salvas;
	private ArrayList<JButton> lista_de_botoes;
	private CartaDAO carta_dao;
	
	public ControleBaralho(PainelBaralho painel_baralho) {
		this.painel_baralho = painel_baralho;
		this.painel_baralho.getLabelCards().setText("");
		this.lista_de_botoes = new ArrayList<JButton>();
	}
	
	public void carregar_baralho() {
		obter_cartas();
		for(Carta carta : lista_cartas_salvas) {
			JButton carta_criada = new JButton(carta.getTitulo());
			painel_baralho.getLabelCards().add(carta_criada);
			lista_de_botoes.add(carta_criada);
			
		}
	}
	
	private void obter_cartas() {
		carta_dao = new CartaDAO(null);
		lista_cartas_salvas = carta_dao.resgatar_cartas_do_banco();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
