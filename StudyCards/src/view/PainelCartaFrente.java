package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PainelCartaFrente extends JPanel {


	public PainelCartaFrente() {
		setLayout(new MigLayout("", "[grow]", "[grow][]"));
		
		JLabel labelFrente = new JLabel("New label");
		add(labelFrente, "cell 0 0");
		
		JButton buttonVerso = new JButton("Verso");
		add(buttonVerso, "cell 0 1");

	}

}
