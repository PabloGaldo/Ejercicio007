package es.cic.bootcamp.ejercicio007.coche;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocheController {
	@Autowired
	
	private MotorElectricoService motorele;
	private MotorCombustionService motorcomb;
	private ResultadoMotoresService sumaMotores;
	
	
	

	
	@GetMapping("/electrico")
	public double arrancarElectrico() {
		return motorele.POTENCIA_ELECTRICO;	
	}
	
	@GetMapping("/combustion")
	public double arrancarCombustion() {
		return motorcomb.POTENCIA_COMBUSTION;	
	}
	
	@GetMapping("/potenciafinal")
	public double arrancarMotores() {
		return sumaMotores.POTENCIA_TOTAL;	
	}

	public void setSumaMotores(ResultadoMotoresService sumaMotores) {
		this.sumaMotores = sumaMotores;
	}
	
	

	
	
	
	
	

	
}
