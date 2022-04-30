package pe.garcia.agora.java.ms.customers.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Table(name="INDICATOR3")
@Entity(name="Indicator3Entity")
public class Indicator3Entity {
	
	@Id
	@Column(name = "IND_PERIO_MIN")
	private String indPerioMin;
	
	@Column(name = "IND_CANTI_MIN")
	private String indCantiMin;
	
	
	  
	
	
	
}
