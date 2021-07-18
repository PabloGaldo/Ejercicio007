package es.cic.bootcamp.ejercicio007.coche;

import org.springframework.stereotype.Service;

@Service
public class MotorCombustionService {
	
public static final Double POTENCIA_COMBUSTION = Math.floor((Math.random()*(40 - 5 + 1)));
	
	
	public Double arrancarCombustion() {
		return POTENCIA_COMBUSTION;	
	}
}
