package es.cic.bootcamp.ejercicio007.coche;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.cic.bootcamp.ejercicio007.coche.MotorCombustionService;

class MotorCombustionServiceTest {

	private MotorCombustionService cut;

	@BeforeEach
	void setUp() throws Exception {
		this.cut = new MotorCombustionService();
	}

	@Test
	void testDarResultadoMotorCombustion() {

		boolean encenderMotor = false;
		if (MotorCombustionService.POTENCIA_COMBUSTION < 20) {
			encenderMotor = true;
		}

		assertFalse(encenderMotor, "El motor no llega a 20, ( " +MotorCombustionService.POTENCIA_COMBUSTION + " ) , Apagando Sistema");

	}

}
