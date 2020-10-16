package pe.edu.upeu.lp2exa1LlataSebastian.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.lp2exa1LlataSebastian.entity.DetallePedido;

public interface DetallePedidoService {
	
	DetallePedido read(int id);
	List<Map<String, Object>> readAll();

}
