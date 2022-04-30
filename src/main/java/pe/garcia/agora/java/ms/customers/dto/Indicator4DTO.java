package pe.garcia.agora.java.ms.customers.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Indicator4DTO{

	private static final long serialVersionUID = 3996275938268665151L;

	private String indMes;
	private String indAnno;
	private String indCantMes;
	private String indPoblaTotal;
	private String indTazaNata;
	
}
