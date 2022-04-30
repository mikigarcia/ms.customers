package pe.garcia.agora.java.ms.customers.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Table(name="INDICATOR1")
@Entity(name="Indicator1Entity")
public class Indicator1Entity {
	
	@Id
	@Column(name = "IND_PERIODO")
	private String indPeriodo;
	
	@Column(name = "IND_CANTIDAD")
	private String indCantidad;
	
	
	  
	
	
	
}
