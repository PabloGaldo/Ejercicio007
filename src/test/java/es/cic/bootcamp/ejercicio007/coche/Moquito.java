package es.cic.bootcamp.ejercicio007.coche;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Moquito {
	
	private CocheController cut;
	private  ResultadoMotoresService dependencia;

	@BeforeEach
	void setUp() throws Exception {
		cut = new CocheController();
		dependencia = mock(ResultadoMotoresService.class);
		
		cut.setSumaMotores(dependencia);
	}

	@Test
	public void testDarResultadoTotal() {
		boolean encenderMotores = false;
		
		when(dependencia.arrancarMotores() > 20).thenReturn(encenderMotores = true);
	
		
		assertFalse(encenderMotores,
				"Los Motores no llegan a 20, ( " + ResultadoMotoresService.POTENCIA_TOTAL + " ) , Apagando Sistema");
		verify(dependencia, times(1));

	}

}
