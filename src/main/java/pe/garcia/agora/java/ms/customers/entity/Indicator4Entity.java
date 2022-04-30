package pe.garcia.agora.java.ms.customers.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Table(name="INDICATOR4")
@Entity(name="Indicator4Entity")
public class Indicator4Entity {
	
	@Id
	@Column(name = "IND_MES")
	private String indMes;
	
	@Column(name = "IND_ANNO")
	private String indAnno;
	
	@Column(name = "IND_CANT_MES")
	private String indCantMes;
	
	@Column(name = "IND_POBLA_TOTAL")
	private String indPoblaTotal;
	
	@Column(name = "IND_TAZA_NATA")
	private String indTazaNata;
	

	  
	
	
	
}
