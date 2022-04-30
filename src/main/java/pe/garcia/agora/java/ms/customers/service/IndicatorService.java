package pe.garcia.agora.java.ms.customers.service;

import pe.garcia.agora.java.ms.customers.dto.IndicatorDTO;
import pe.garcia.agora.java.ms.customers.service.exception.ServiceException;

public interface IndicatorService extends GenericService<IndicatorDTO>{

	public IndicatorDTO findIndicator() throws ServiceException;
	
}
