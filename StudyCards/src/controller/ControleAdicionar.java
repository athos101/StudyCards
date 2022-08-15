package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.JanelaInicial;

public class ControleAdicionar implements ActionListener{
	private JanelaInicial janela;
	
	public ControleAdicionar(JanelaInicial janela) {
		this.janela = janela;
		this.janela.getPainelAdicionar().getButtonSalvar().addActionListener(this);
		this.janela.getPainelAdicionar().getButtonCancelar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Cancelar")) {
			voltar_ao_inicio();
		}
		if(e.getActionCommand().equals("Salvar")) {
			salvar_carta();
		}
		
	}
	
	private void voltar_ao_inicio() {
		janela.getPainelAdicionar().getAreaFrente().setText("");
		janela.getPainelAdicionar().getAreaVerso().setText("");
		janela.getCard_layout().show(janela.getContentPane(), "painelInicio");
	}
	
	private void salvar_carta() {
		
	}
}
