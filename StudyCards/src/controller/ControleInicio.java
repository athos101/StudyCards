package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.JanelaInicial;

public class ControleInicio implements ActionListener{
	private JanelaInicial janela;
	
	public ControleInicio(JanelaInicial janela) {
		this.janela = janela;
		
		this.janela.getMenu_inicio().addActionListener(this);
		this.janela.getMenu_baralho().addActionListener(this);
		
		this.janela.getPainelInicio().getButton_adicionar().addActionListener(
			new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					janela.getCard_layout().show(janela.getContentPane(), "painelAdicionar");
					
				}
			});
		
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {

		if(evento.getActionCommand().equals("inicio")) {
			janela.getCard_layout().show(janela.getContentPane(), "painelInicio");
		}
		
		if(evento.getActionCommand().equals("baralho")) {
			janela.getCard_layout().show(janela.getContentPane(), "painelBaralho");
			ControleBaralho controle_baralho = new ControleBaralho(
					janela.getPainelBaralho());
			controle_baralho.carregar_baralho();
		}
		
	}
}
