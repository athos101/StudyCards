package controller;

import view.JanelaInicial;

public class App {
	public static void main(String[] args) {
		JanelaInicial janela = new JanelaInicial();
		janela.setVisible(true);
		
		ControleInicio controle_inicio = new ControleInicio(janela);
	}
}
