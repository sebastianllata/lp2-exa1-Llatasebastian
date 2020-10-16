package pe.edu.upeu.lp2exa1LlataSebastian;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.lp2exa1LlataSebastian.dao.DetallePedidosDao;


@SpringBootTest
class Lp2Exa1LlataSebastianApplicationTests {

	@Autowired
	private DetallePedidosDao detallePedidoDao;
	//private DetallePedidoService detallepeidoService;
	
	@Test
	void contextLoads() {
	
		//testeo readAll
		//System.out.println(detallePedidoDao.readAll());	
	
		//testeo read
		System.out.println(detallePedidoDao.read(3).getPrecio());
		System.out.println(detallePedidoDao.read(3).getCantidad());
		
		
	}
	 

	
	
}
