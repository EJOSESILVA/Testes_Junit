package br.ce.wcaquino.servicos;

import java.util.Date;

import org.hamcrest.CoreMatchers;
//import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {

	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Test
	public void Teste() {
		
		//Cen�rio
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Emerson");
		Filme filme = new Filme("Emerson Film", 2, 5.0);
		 
		//A��o
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		//Verifica��o dessa forma o teste apenas ir� trazer a primeira assertiva que estourar o erro, impedindo de voc� pegar todos de uma vez
		//Assert.assertEquals(5.0,locacao.getValor(), 0.01);
		//Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		//Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
			
		//Verifica��o por Rules, traz todos os testes com erro de uma �nica vez.
		error.checkThat(locacao.getValor(), CoreMatchers.is(6.0));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)), CoreMatchers.is(false));
	}
	
	
}
