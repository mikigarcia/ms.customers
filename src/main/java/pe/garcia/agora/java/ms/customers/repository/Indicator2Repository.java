package pe.garcia.agora.java.ms.customers.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.garcia.agora.java.ms.customers.entity.Indicator2Entity;

@Repository
public interface Indicator2Repository extends JpaRepository<Indicator2Entity, String>{
	
	@Query("select p from Indicator2Entity p") 
	List<Indicator2Entity> getAllCustom();
	


}
