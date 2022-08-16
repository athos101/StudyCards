package JUnitTests;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.ResultSet;

import org.junit.jupiter.api.Test;

import controller.ControleBaralho;
import dao.CartaDAO;
import model.Carta;
import view.PainelBaralho;

class StudyCardsTest {
	
	@Test
	void deveria_salvar_carta_no_banco() {
		String[] carta_dados = new String[3];
		carta_dados[0] = "teste";
		carta_dados[1] = "teste";
		carta_dados[2] = "teste";
		
		CartaDAO cartadao = new CartaDAO(new Carta(carta_dados));
		
		assertTrue(cartadao.salvar_carta_no_banco());
	}
	
	@Test
	void deveria_resgatar_uma_array_de_cartas() {
		String[] carta_dados = new String[3];
		carta_dados[0] = "teste";
		carta_dados[1] = "teste";
		carta_dados[2] = "teste";
		
		CartaDAO cartadao = new CartaDAO(new Carta(carta_dados));
		
		assertNotNull(cartadao.resgatar_cartas_do_banco());
	}

}
