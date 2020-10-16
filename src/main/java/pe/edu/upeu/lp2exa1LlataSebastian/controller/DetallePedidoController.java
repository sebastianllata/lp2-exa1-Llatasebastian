package pe.edu.upeu.lp2exa1LlataSebastian.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.lp2exa1LlataSebastian.entity.DetallePedido;
import pe.edu.upeu.lp2exa1LlataSebastian.service.DetallePedidoService;

@RestController
@RequestMapping("/detallepedido")
public class DetallePedidoController {
	
	@Autowired
	private DetallePedidoService detallepedidoservice;
	
	@GetMapping("/listar")
	public List<Map<String, Object>>listar(){
		return detallepedidoservice.readAll();
	}
	
	@GetMapping("/{id}")
	public DetallePedido read(@PathVariable int id) {
		return detallepedidoservice.read(id);
	}

	
	
}
