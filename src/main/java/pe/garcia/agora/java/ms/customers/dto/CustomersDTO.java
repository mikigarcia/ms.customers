package pe.garcia.agora.java.ms.customers.dto;

import java.util.Date;

import javax.persistence.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CustomersDTO extends GenericDTO {

	private static final long serialVersionUID = 3996275938268665151L;

	private String nombre;
	
	private String apellido;
	
	private String email;
	
	private String dni;
	
	private String fechaCreacion;
	
	private String fechaNacimiento;

	
}
