package pe.garcia.agora.java.ms.customers.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Table(name="INDICATOR2")
@Entity(name="Indicator2Entity")
public class Indicator2Entity {
	
	@Id
	@Column(name = "IND_PERIO_MAX")
	private String indPerioMax;
	
	@Column(name = "IND_CANTI_MAX")
	private String indCantiMax;
	
	
	  
	
	
	
}
