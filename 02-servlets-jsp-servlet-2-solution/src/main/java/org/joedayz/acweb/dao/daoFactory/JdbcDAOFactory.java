package org.joedayz.acweb.dao.daoFactory;

import org.joedayz.acweb.dao.UsuarioDAO;
import org.joedayz.acweb.dao.impl.JdbcUsuarioDaoImpl;



public class JdbcDAOFactory extends DAOFactory{
	
	public UsuarioDAO getUsuarioDAO() {
		return new JdbcUsuarioDaoImpl();
	}

}
