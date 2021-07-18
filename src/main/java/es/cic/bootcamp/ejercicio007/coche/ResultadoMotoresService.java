package es.cic.bootcamp.ejercicio007.coche;

import org.springframework.stereotype.Service;

@Service
public class ResultadoMotoresService {

	public static final Double POTENCIA_TOTAL = MotorElectricoService.POTENCIA_ELECTRICO + MotorCombustionService.POTENCIA_COMBUSTION;

	public Double arrancarMotores() {
		return POTENCIA_TOTAL;
	}

}
