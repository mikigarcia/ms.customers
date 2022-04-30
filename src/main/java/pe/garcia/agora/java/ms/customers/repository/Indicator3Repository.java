package pe.garcia.agora.java.ms.customers.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.garcia.agora.java.ms.customers.entity.Indicator3Entity;

@Repository
public interface Indicator3Repository extends JpaRepository<Indicator3Entity, String>{
	
	@Query("select p from Indicator3Entity p") 
	List<Indicator3Entity> getAllCustom();
	


}
