package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class PainelAdicionandoCard extends JPanel {

	/**
	 * Create the panel.
	 */
	public PainelAdicionandoCard() {
		setLayout(new MigLayout("", "[grow]", "[][grow][][grow][]"));
		
		JLabel labelFrente = new JLabel("Frente:");
		add(labelFrente, "cell 0 0");
		
		JTextArea textArea = new JTextArea();
		add(textArea, "cell 0 1,grow");
		
		JLabel labelVerso = new JLabel("Verso:");
		add(labelVerso, "cell 0 2");
		
		JTextArea textArea_1 = new JTextArea();
		add(textArea_1, "cell 0 3,grow");
		
		JButton buttonSalvar = new JButton("Salvar");
		add(buttonSalvar, "flowx,cell 0 4");
		
		JButton butrtonCancelar = new JButton("Cancelar");
		add(butrtonCancelar, "cell 0 4");
		
	}

}
