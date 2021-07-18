package es.cic.bootcamp.ejercicio007.coche;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResultadoMotoresServiceTest {

	private ResultadoMotoresService cut;

	@BeforeEach
	void setUp() throws Exception {
		this.cut = new ResultadoMotoresService();
	}

	@Test
	void testDarResultadoTotal() {
		boolean encenderMotor = false;
		if (MotorElectricoService.POTENCIA_ELECTRICO > 20) {

			encenderMotor = true;
		} else if (ResultadoMotoresService.POTENCIA_TOTAL > 20) {

			encenderMotor = true;

		} else if (ResultadoMotoresService.POTENCIA_TOTAL < 20)

			assertTrue(encenderMotor,
					"El motor no llega a 20, ( " + ResultadoMotoresService.POTENCIA_TOTAL + " ) , Apagando Coche");

	}

}
