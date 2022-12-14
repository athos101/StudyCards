package view;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class PainelInicio extends JPanel {

	private JButton button_adicionar;
	
	public PainelInicio() {
		
		setLayout(new MigLayout("", "[grow][][grow]", "[grow][][grow]"));
		
		ImageIcon image_icon_plus = new ImageIcon(
				this.getClass().getResource("/images/plus.png"));
		
		Image image_plus = image_icon_plus.getImage().getScaledInstance(
				100, 100, java.awt.Image.SCALE_SMOOTH);
		
		Icon icone_adicionar = new ImageIcon(image_plus);
		
		button_adicionar = new JButton(icone_adicionar);
		button_adicionar.setFocusPainted(false);
		add(button_adicionar, "cell 1 1");
		
	}

	public JButton getButton_adicionar() {
		return button_adicionar;
	}

	public void setButton_adicionar(JButton button_adicionar) {
		this.button_adicionar = button_adicionar;
	}

}
