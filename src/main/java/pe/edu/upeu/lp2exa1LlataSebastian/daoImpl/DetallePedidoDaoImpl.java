package pe.edu.upeu.lp2exa1LlataSebastian.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1LlataSebastian.dao.DetallePedidosDao;
import pe.edu.upeu.lp2exa1LlataSebastian.entity.DetallePedido;

@Repository
public class DetallePedidoDaoImpl implements DetallePedidosDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public DetallePedido read(int id) {
		// TODO Auto-generated method stub
		//
		String SQL ="select * from detalle_pedido where iddetalle_pedido=?";
		return jdbcTemplate.queryForObject(SQL, new Object[]{id} , new BeanPropertyRowMapper<DetallePedido>(DetallePedido.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		//
		String SQL ="select * from detalle_pedido";
		return jdbcTemplate.queryForList(SQL);
		
	}

}
