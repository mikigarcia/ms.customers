package pe.garcia.agora.java.ms.customers.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import pe.garcia.agora.java.ms.customers.dto.Indicator1DTO;
import pe.garcia.agora.java.ms.customers.dto.Indicator2DTO;
import pe.garcia.agora.java.ms.customers.dto.Indicator3DTO;
import pe.garcia.agora.java.ms.customers.dto.Indicator4DTO;
import pe.garcia.agora.java.ms.customers.dto.IndicatorDTO;
import pe.garcia.agora.java.ms.customers.entity.Indicator1Entity;
import pe.garcia.agora.java.ms.customers.entity.Indicator2Entity;
import pe.garcia.agora.java.ms.customers.entity.Indicator3Entity;
import pe.garcia.agora.java.ms.customers.entity.Indicator4Entity;
import pe.garcia.agora.java.ms.customers.repository.Indicator1Repository;
import pe.garcia.agora.java.ms.customers.repository.Indicator2Repository;
import pe.garcia.agora.java.ms.customers.repository.Indicator3Repository;
import pe.garcia.agora.java.ms.customers.repository.Indicator4Repository;
import pe.garcia.agora.java.ms.customers.service.IndicatorService;
import pe.garcia.agora.java.ms.customers.service.exception.ServiceException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Slf4j
@Service
public class IndicatorServiceImpl implements IndicatorService {

	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private Indicator1Repository indicator1Repository;
	
	@Autowired
	private Indicator2Repository indicator2Repository;
	
	@Autowired
	private Indicator3Repository indicator3Repository;
	
	@Autowired
	private Indicator4Repository indicator4Repository;
		
	@Override
	public List<IndicatorDTO> findLike(IndicatorDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Optional<IndicatorDTO> findById(IndicatorDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndicatorDTO save(IndicatorDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public IndicatorDTO findIndicator() throws ServiceException {
		// TODO Auto-generated method stub
		try {
			
			IndicatorDTO indicatorDTO = new IndicatorDTO();
			
			List<Indicator1DTO> listaIndicator1DTO = indicator1Repository.getAllCustom().stream().map(e -> this.getIndicator1DTO(e)).collect(Collectors.toList());
			List<Indicator2DTO> listaIndicator2DTO = indicator2Repository.getAllCustom().stream().map(e -> this.getIndicator2DTO(e)).collect(Collectors.toList());
			List<Indicator3DTO> listaIndicator3DTO = indicator3Repository.getAllCustom().stream().map(e -> this.getIndicator3DTO(e)).collect(Collectors.toList());
			List<Indicator4DTO> listaIndicator4DTO = indicator4Repository.getAllCustom().stream().map(e -> this.getIndicator4DTO(e)).collect(Collectors.toList());
			
			
			indicatorDTO.setCantidadNacidoPorMesAño(listaIndicator1DTO);
			indicatorDTO.setCantidadMayorNacidos(listaIndicator2DTO);
			indicatorDTO.setCantidadMenorNacidos(listaIndicator3DTO);
			indicatorDTO.setTazaNatalidad(listaIndicator4DTO);
			
			return indicatorDTO;
			
		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			throw new ServiceException(e2);
		}
	}

//	private Indicator1DTO getIndicator1DTO(Indicator1Entity indicatorEntity) {
//		
//		Indicator1DTO indicator1DTO = new Indicator1DTO();
//
//		indicator1DTO.setPeriodo(indicatorEntity.getIndPeriodo1());
//		indicator1DTO.setCantidad(indicatorEntity.getIndCantidad1());
//	
//		return indicator1DTO;
//	}


	private Indicator1Entity getIndicator1Entity(Indicator1DTO indicator1DTO) {
		return objectMapper.convertValue(indicator1DTO, Indicator1Entity.class);
	}

	private Indicator1DTO getIndicator1DTO(Indicator1Entity indicator1Entity) {
		return objectMapper.convertValue(indicator1Entity, Indicator1DTO.class);
	}
	
	private Indicator2Entity getIndicator2Entity(Indicator2DTO indicator2DTO) {
		return objectMapper.convertValue(indicator2DTO, Indicator2Entity.class);
	}

	private Indicator2DTO getIndicator2DTO(Indicator2Entity indicator2Entity) {
		return objectMapper.convertValue(indicator2Entity, Indicator2DTO.class);
	}

	
	
	private Indicator3Entity getIndicator3Entity(Indicator3DTO indicator3DTO) {
		return objectMapper.convertValue(indicator3DTO, Indicator3Entity.class);
	}

	private Indicator3DTO getIndicator3DTO(Indicator3Entity indicator3Entity) {
		return objectMapper.convertValue(indicator3Entity, Indicator3DTO.class);
	}
	
	private Indicator4Entity getIndicator4Entity(Indicator4DTO indicator4DTO) {
		return objectMapper.convertValue(indicator4DTO, Indicator4Entity.class);
	}

	private Indicator4DTO getIndicator4DTO(Indicator4Entity indicator4Entity) {
		return objectMapper.convertValue(indicator4Entity, Indicator4DTO.class);
	}

	

}
