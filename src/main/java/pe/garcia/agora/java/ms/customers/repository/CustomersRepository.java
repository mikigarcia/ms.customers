package pe.garcia.agora.java.ms.customers.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.garcia.agora.java.ms.customers.dto.Indicator1DTO;
import pe.garcia.agora.java.ms.customers.dto.IndicatorDTO;
import pe.garcia.agora.java.ms.customers.entity.CustomersEntity;
import pe.garcia.agora.java.ms.customers.entity.Indicator1Entity;

@Repository
public interface CustomersRepository extends JpaRepository<CustomersEntity, Integer>{
	
	@Query("select p from CustomersEntity p") 
	List<CustomersEntity> getAllCustom();
	
	
}
