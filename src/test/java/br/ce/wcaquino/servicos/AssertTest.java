package br.ce.wcaquino.servicos;
import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {
	
	@Test
	public void test() {
		
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals("Erro comparação",2, 2);
		// No caso de valores double, se não colocar margem de erro que é o terceiro parâmetro, o java dará erro, porque o metodo estará defasado pois tem operações que podem dar resultado infinito como no caso do PI
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
		
		//Se não implementar o equals na classe usuário, a validação será feita via Object e ele compara até mesmo a instância isso daria diferença mesmo o objeto sendo igual com valores iguais.
		Assert.assertEquals(u1, u2);
		
		//Se quero saber se vem da mesma instância usa o Same
		Assert.assertSame(u2, u2);
		Assert.assertNotSame(u1, u2);
		
		//Validar se está nulo, tem duas formas
		Assert.assertTrue(u3 == null);
		Assert.assertNull(u3);
		Assert.assertNotNull(u1);
		
	}
	

}
