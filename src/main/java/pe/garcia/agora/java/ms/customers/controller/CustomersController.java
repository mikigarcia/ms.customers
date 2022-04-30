package pe.garcia.agora.java.ms.customers.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import pe.garcia.agora.java.ms.customers.dto.CustomersDTO;
import pe.garcia.agora.java.ms.customers.dto.Indicator1DTO;
import pe.garcia.agora.java.ms.customers.dto.IndicatorDTO;
import pe.garcia.agora.java.ms.customers.service.CustomersService;
import pe.garcia.agora.java.ms.customers.service.IndicatorService;

import org.springframework.http.MediaType;

@Slf4j
@RestController
@RequestMapping("/customers")
public class CustomersController {

	@Autowired
	private CustomersService customersService;
	
	@Autowired
	private IndicatorService indicatorService;
	
	
	
	@GetMapping(value="/findLike", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CustomersDTO>> findLike(){
		try {
			return ResponseEntity.ok(customersService.findLike(null));
		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}	
	}
	
	@PostMapping(value="/insert", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomersDTO> insert(@RequestBody CustomersDTO customersDTO){
		try {
			return ResponseEntity.ok(customersService.save(customersDTO));
		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}	
	}
	
	@GetMapping(value="/findLikeIndicator", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<IndicatorDTO> findLikeIndicator(){
		try {
			return ResponseEntity.ok(indicatorService.findIndicator());
		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}	
	}
	
}
