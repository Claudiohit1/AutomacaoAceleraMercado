package actexecuter;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elms;
import metodos.Metodos;

public class RunnerGetAction {

	Metodos metd = new Metodos();
	Elms el = new Elms();

	@Before
	public void setUp() throws Exception {
		metd.abrirBrowser("https://www.shoestock.com.br");
	}

	@After
	public void tearDown() throws Exception {
		metd.fecharBrower();
	}

	@Test
	public void test() throws InterruptedException, IOException {
		metd.clicarSpan(el.clicarSpan);
		metd.clicarNews(el.clicarNews);
		metd.clicarSapato(el.clicarSapato);
		metd.clicarColor(el.clicarColor);
		metd.clicarTam(el.clicarTam);
		metd.scroll(0, 500);
		metd.clicarBuy(el.clicarBuy);
		metd.validarMsg(el.validarMsg, "Valor total");
		metd.clicarDelete(el.clicarDelete);
		metd.screenshot("CT01 - el");
		metd.clicarVoltar(el.clicarVoltarInicio);
	}

}
