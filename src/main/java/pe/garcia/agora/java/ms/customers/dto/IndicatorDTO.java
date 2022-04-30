package pe.garcia.agora.java.ms.customers.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class IndicatorDTO<T> {

	private static final long serialVersionUID = 3996275938268665151L;

	private T cantidadNacidoPorMesAño;
	
	private T cantidadMayorNacidos;
	
	private T cantidadMenorNacidos;
	
	private T tazaNatalidad;
		
}
