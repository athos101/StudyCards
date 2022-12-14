package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;

public class PainelBaralho extends JPanel {

	private JLabel labelCards;

	
	public PainelBaralho() {
		setLayout(new MigLayout("", "[]", "[grow]"));
		
		labelCards = new JLabel("Nenhuma carta criada");
		add(labelCards, "flowx,cell 0 0");
		
		JScrollPane scrollCartas = new JScrollPane();
		add(scrollCartas, "cell 0 0, grow");
		scrollCartas.setViewportView(labelCards);
	}

}
