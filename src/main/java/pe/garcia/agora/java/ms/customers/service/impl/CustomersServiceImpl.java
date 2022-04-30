package pe.garcia.agora.java.ms.customers.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import pe.garcia.agora.java.ms.customers.dto.Indicator1DTO;
import pe.garcia.agora.java.ms.customers.dto.CustomersDTO;
import pe.garcia.agora.java.ms.customers.dto.IndicatorDTO;
import pe.garcia.agora.java.ms.customers.entity.CustomersEntity;
import pe.garcia.agora.java.ms.customers.entity.Indicator1Entity;
import pe.garcia.agora.java.ms.customers.repository.CustomersRepository;
import pe.garcia.agora.java.ms.customers.service.CustomersService;
import pe.garcia.agora.java.ms.customers.service.exception.ServiceException;

@Slf4j
@Service
public class CustomersServiceImpl implements CustomersService {

	@Autowired
	private CustomersRepository customersRepository;

	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public List<CustomersDTO> findLike(CustomersDTO customersDTO) throws ServiceException {
		try {
			return this.customersRepository.getAllCustom().stream().map(e -> this.getCustomersDTO(e))
					.collect(Collectors.toList());
		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			throw new ServiceException(e2);
		}
	}

	@Override
	public Optional<CustomersDTO> findById(CustomersDTO customersDTO) throws ServiceException {
		try {
			return Optional.of(this.getCustomersDTO(this.customersRepository.findById(customersDTO.getId()).get()));
		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			throw new ServiceException(e2);
		}
	}

	@Override
	public CustomersDTO save(CustomersDTO customersDTO) throws ServiceException {
		try {
			
			return this.getCustomersDTO(this.customersRepository.save(this.getCustomersEntity(customersDTO)));
		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			throw new ServiceException(e2);
		}
	}

	private CustomersEntity getCustomersEntity(CustomersDTO customersDTO) throws ParseException {
		
		CustomersEntity customersEntity = new CustomersEntity();
		customersEntity.setId(customersDTO.getId());
		customersEntity.setNombre(customersDTO.getNombre());
		customersEntity.setApellido(customersDTO.getApellido());
		customersEntity.setEmail(customersDTO.getEmail());
		customersEntity.setDni(customersDTO.getDni());
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		customersEntity.setFechaCreacion(formato.parse(customersDTO.getFechaCreacion()));
		customersEntity.setFechaNacimiento(formato.parse(customersDTO.getFechaNacimiento()));
		
		return customersEntity;
	}

	private CustomersDTO getCustomersDTO(CustomersEntity customersEntity) {
		
		CustomersDTO customersDTO = new CustomersDTO();

		customersDTO.setId(customersEntity.getId());
		customersDTO.setNombre(customersEntity.getNombre());
		customersDTO.setApellido(customersEntity.getApellido());
		customersDTO.setEmail(customersEntity.getEmail());
		customersDTO.setDni(customersEntity.getDni());
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		customersDTO.setFechaCreacion(formato.format(customersEntity.getFechaCreacion()));
		customersDTO.setFechaNacimiento(formato.format(customersEntity.getFechaNacimiento()));
				
		return customersDTO;
	}

}
