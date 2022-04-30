package pe.garcia.agora.java.ms.customers.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Table(name="CUSTOMERS")
@Entity(name="CustomersEntity")
public class CustomersEntity {

	@Id
	@Column(name = "ID_CUSTOMERS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCustomers")
	@SequenceGenerator(name = "seqCustomers", allocationSize = 1, sequenceName = "seq_Customers")
	private Integer id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO")
	private String apellido;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "DNI")
	private String dni;
	
	@Column(name = "FECHA_CREACION")
	private Date fechaCreacion;
	
	@Column(name = "FECHA_NACIMIENTO")
	private Date fechaNacimiento;
	  
	
	
	
}
