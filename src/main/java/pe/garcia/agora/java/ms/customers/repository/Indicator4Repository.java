package pe.garcia.agora.java.ms.customers.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.garcia.agora.java.ms.customers.entity.Indicator4Entity;

@Repository
public interface Indicator4Repository extends JpaRepository<Indicator4Entity, String>{
	
	@Query("select p from Indicator4Entity p") 
	List<Indicator4Entity> getAllCustom();
	

}
