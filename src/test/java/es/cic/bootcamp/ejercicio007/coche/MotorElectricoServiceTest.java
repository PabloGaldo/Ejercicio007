package es.cic.bootcamp.ejercicio007.coche;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotorElectricoServiceTest {

	private MotorElectricoService cut;

	@BeforeEach
	void setUp() throws Exception {
		this.cut = new MotorElectricoService();
	}

	@Test
	void testDarResultadoMotorElectrico() {
		boolean encenderMotor = false;
		if (MotorElectricoService.POTENCIA_ELECTRICO < 20) {
			encenderMotor = true;
		}

		assertFalse(encenderMotor,
				"El motor no llega a 20, ( " + MotorElectricoService.POTENCIA_ELECTRICO + " ) , Apagando Sistema");

	}

}
