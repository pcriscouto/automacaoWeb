package cursoTest;

import org.junit.After;
import org.junit.Before;


import core.Driver;

public class BaseTest {

	
	@Before
	public void abreNavegador() {
		Driver.abreNavegador("http://www.lojaexemplodelivros.com.br/");
	}
	
	@After
	public void fechaNavegador() {
		Driver.fechaNavegador();
	}
}
