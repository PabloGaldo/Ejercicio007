package es.cic.bootcamp.ejercicio007.coche;

import org.springframework.stereotype.Service;

@Service
public class MotorElectricoService {

	public static final Double POTENCIA_ELECTRICO = Math.floor((Math.random() * (40 - 5 + 1)));
	

	public Double arrancarElectrico() {
		return POTENCIA_ELECTRICO;
	}

}
