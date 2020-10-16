package pe.edu.upeu.lp2exa1LlataSebastian.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1LlataSebastian.dao.UsuarioDao;
import pe.edu.upeu.lp2exa1LlataSebastian.entity.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao{

@Autowired
private JdbcTemplate jdbcTemplate;

	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		String SQL = "select * from usuario where nomuser=?";
		return jdbcTemplate.queryForObject(SQL, new Object[]{nomuser},new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
