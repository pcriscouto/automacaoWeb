package calculoMediaTest;

import org.junit.Test;
import org.junit.Assert;

import automacaoWeb.CalculoMedia;

public class CalculoMediaTest {

	@Test
	public void validaReprovacao() {
		CalculoMedia calculoMedia = new CalculoMedia(5, 6);
		Assert.assertEquals("Reprovado", calculoMedia.getSituacao());
	}
	
	@Test
	public void validaAprovado() {
		CalculoMedia calculoMedia = new CalculoMedia();
		calculoMedia.setNota1(7);
		calculoMedia.setNota2(6);
		Assert.assertEquals("Aprovado", calculoMedia.getSituacao());
	}
	
	@Test
	public void testeComErro() throws Exception {
		throw new Exception("Erro!");
	}
}
