package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.CartaDAO;
import model.Carta;
import view.JanelaInicial;

public class ControleAdicionar implements ActionListener{
	private JanelaInicial janela;
	private CartaDAO carta_dao;
	
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
			salvar_carta(obter_carta());
		}
		
	}
	
	private void voltar_ao_inicio() {
		limpar_campos();
		janela.getCard_layout().show(janela.getContentPane(), "painelInicio");
	}
	
	private void salvar_carta(Carta nova_carta) {
		carta_dao = new CartaDAO(nova_carta);
		if(carta_dao.salvar_carta_no_banco()) {
			JOptionPane.showMessageDialog(janela, "Carta salva!");
			limpar_campos();
		}
	}
	
	private Carta obter_carta() {
		String[] carta_informacoes = new String[3];
		carta_informacoes[0] = janela.getPainelAdicionar().getFieldTitulo().getText();
		carta_informacoes[1] = janela.getPainelAdicionar().getAreaFrente().getText();
		carta_informacoes[2] = janela.getPainelAdicionar().getAreaVerso().getText();
		
		Carta nova_carta = new Carta(carta_informacoes);
		
		return nova_carta;
	}
	
	private void limpar_campos() {
		janela.getPainelAdicionar().getFieldTitulo().setText("");
		janela.getPainelAdicionar().getAreaFrente().setText("");
		janela.getPainelAdicionar().getAreaVerso().setText("");
	}
}
