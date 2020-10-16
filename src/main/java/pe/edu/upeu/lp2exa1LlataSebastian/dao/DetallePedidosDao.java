package pe.edu.upeu.lp2exa1LlataSebastian.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.lp2exa1LlataSebastian.entity.DetallePedido;

public interface DetallePedidosDao {
	
	DetallePedido read(int id);
	List<Map<String, Object>> readAll();

}
