package pe.garcia.agora.java.ms.customers.service;

import java.util.List;
import java.util.Optional;

import pe.garcia.agora.java.ms.customers.service.exception.ServiceException;

public interface GenericService<T> {

	List<T> findLike(T t) throws ServiceException;
	
	Optional<T> findById(T t) throws ServiceException;
	
	T save(T t) throws ServiceException; // Insert, Update, Delete
		
}
