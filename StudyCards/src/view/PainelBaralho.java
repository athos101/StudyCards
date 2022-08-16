package view;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;

public class PainelBaralho extends JPanel {

	private JLabel labelCards;

	
	public PainelBaralho() {
		setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		labelCards = new JLabel("Nenhuma carta criada");
		//add(labelCards, "cell 0 0, grow");
		labelCards.setLayout(new BoxLayout(labelCards,BoxLayout.Y_AXIS));
		
		JScrollPane scrollCartas = new JScrollPane();
		scrollCartas.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		add(scrollCartas, "cell 0 0, grow");
		scrollCartas.setViewportView(labelCards);

	}


	public JLabel getLabelCards() {
		return labelCards;
	}


	public void setLabelCards(JLabel labelCards) {
		this.labelCards = labelCards;
	}

}
