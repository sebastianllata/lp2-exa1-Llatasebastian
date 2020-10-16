package pe.edu.upeu.lp2exa1LlataSebastian.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2exa1LlataSebastian.dao.DetallePedidosDao;
import pe.edu.upeu.lp2exa1LlataSebastian.entity.DetallePedido;
import pe.edu.upeu.lp2exa1LlataSebastian.service.DetallePedidoService;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService{

	@Autowired
	private DetallePedidosDao detallePedidoDao;
	@Override
	public DetallePedido read(int id) {
		// TODO Auto-generated method stub
		return detallePedidoDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detallePedidoDao.readAll();
	}

}
