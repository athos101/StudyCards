package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class PainelAdicionandoCard extends JPanel {

	private JTextArea areaFrente;
	private JTextArea areaVerso;
	private JButton buttonSalvar;
	private JButton buttonCancelar;

	public PainelAdicionandoCard() {
		setLayout(new MigLayout("", "[grow]", "[][grow][][grow][]"));
		
		JLabel labelFrente = new JLabel("Frente:");
		add(labelFrente, "cell 0 0");
		
		areaFrente = new JTextArea();
		add(areaFrente, "cell 0 1,grow");
		
		JLabel labelVerso = new JLabel("Verso:");
		add(labelVerso, "cell 0 2");
		
		areaVerso = new JTextArea();
		add(areaVerso, "cell 0 3,grow");
		
		buttonSalvar = new JButton("Salvar");
		add(buttonSalvar, "flowx,cell 0 4");
		
		buttonCancelar = new JButton("Cancelar");
		add(buttonCancelar, "cell 0 4");
		
	}

	public JTextArea getAreaFrente() {
		return areaFrente;
	}

	public void setAreaFrente(JTextArea areaFrente) {
		this.areaFrente = areaFrente;
	}

	public JTextArea getAreaVerso() {
		return areaVerso;
	}

	public void setAreaVerso(JTextArea areaVerso) {
		this.areaVerso = areaVerso;
	}

	public JButton getButtonSalvar() {
		return buttonSalvar;
	}

	public void setButtonSalvar(JButton buttonSalvar) {
		this.buttonSalvar = buttonSalvar;
	}

	public JButton getButtonCancelar() {
		return buttonCancelar;
	}

	public void setButrtonCancelar(JButton butrtonCancelar) {
		this.buttonCancelar = butrtonCancelar;
	}

}
