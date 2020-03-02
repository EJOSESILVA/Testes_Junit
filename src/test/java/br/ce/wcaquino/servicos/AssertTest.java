package br.ce.wcaquino.servicos;
import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {
	
	@Test
	public void test() {
		
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals("Erro compara��o",2, 2);
		// No caso de valores double, se n�o colocar margem de erro que � o terceiro par�metro, o java dar� erro, porque o metodo estar� defasado pois tem opera��es que podem dar resultado infinito como no caso do PI
		Assert.assertEquals(0.51234, 0.512, 0.001);
		Assert.assertEquals(Math.PI, 3.14, 0.01);
		
		int i = 5;
		Integer i2 = 5;
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());
		
		Assert.assertEquals("bola", "bola");
		Assert.assertNotEquals("bola", "casa");
		//Assert.assertEquals("bola", "Bola");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("Usu 1");
		Usuario u2 = new Usuario("Usu 1");
		Usuario u3 = null;
		
		//Se n�o implementar o equals na classe usu�rio, a valida��o ser� feita via Object e ele compara at� mesmo a inst�ncia isso daria diferen�a mesmo o objeto sendo igual com valores iguais.
		Assert.assertEquals(u1, u2);
		
		//Se quero saber se vem da mesma inst�ncia usa o Same
		Assert.assertSame(u2, u2);
		Assert.assertNotSame(u1, u2);
		
		//Validar se est� nulo, tem duas formas
		Assert.assertTrue(u3 == null);
		Assert.assertNull(u3);
		Assert.assertNotNull(u1);
		
	}
	

}
