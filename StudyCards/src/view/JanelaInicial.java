package view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JanelaInicial extends JFrame {

	private JPanel contentPane;
	private JMenuBar menubar_principal;
	private JMenuItem menu_inicio;
	private JMenuItem menu_baralho;
	private CardLayout card_layout;
	
	private PainelInicio painelInicio;
	private PainelAdicionandoCard painelAdicionar;
	private PainelBaralho painelBaralho;
	
	public JanelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 432);
		setTitle("Study Cards");
		
		// ---| MENU |-----------------------
		
		menubar_principal = new JMenuBar();
		setJMenuBar(menubar_principal);
		
		menu_inicio = new JMenuItem("inicio");
		menubar_principal.add(menu_inicio);
		
		menu_baralho = new JMenuItem("baralho");
		menubar_principal.add(menu_baralho);
		
		// ---| CONTENTPANE |-----------------------
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		card_layout = new CardLayout();
		contentPane.setLayout(card_layout);
		
		// ---| PANELS |-----------------------
		
		painelInicio = new PainelInicio();
		painelAdicionar = new PainelAdicionandoCard();
		painelBaralho = new PainelBaralho();
		
		contentPane.add(painelInicio,"painelInicio");
		contentPane.add(painelAdicionar, "painelAdicionar");
		contentPane.add(painelBaralho, "painelBaralho");
	}

	public JMenuBar getMenubar_principal() {
		return menubar_principal;
	}

	public void setMenubar_principal(JMenuBar menubar_principal) {
		this.menubar_principal = menubar_principal;
	}

	public JMenuItem getMenu_inicio() {
		return menu_inicio;
	}

	public void setMenu_inicio(JMenu menu_inicio) {
		this.menu_inicio = menu_inicio;
	}

	public JMenuItem getMenu_baralho() {
		return menu_baralho;
	}

	public void setMenu_baralho(JMenu menu_baralho) {
		this.menu_baralho = menu_baralho;
	}

	public CardLayout getCard_layout() {
		return card_layout;
	}

	public void setCard_layout(CardLayout card_layout) {
		this.card_layout = card_layout;
	}

	public PainelInicio getPainelInicio() {
		return painelInicio;
	}

	public void setPainelInicio(PainelInicio painelInicio) {
		this.painelInicio = painelInicio;
	}

}
