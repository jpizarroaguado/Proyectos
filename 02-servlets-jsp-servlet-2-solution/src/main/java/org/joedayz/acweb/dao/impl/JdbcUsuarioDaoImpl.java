package org.joedayz.acweb.dao.impl;



import org.joedayz.acweb.dao.UsuarioDAO;
import org.joedayz.acweb.dao.daoFactory.BaseDaoSupport;
import org.joedayz.acweb.domain.BNUsuario;
import org.joedayz.acweb.domain.BNTrabajador;


import java.sql.*;
import java.util.ArrayList;


public class JdbcUsuarioDaoImpl implements UsuarioDAO {
	

	public BaseDaoSupport daoSupport= new BaseDaoSupport();
	public int contador=3;

	public BNUsuario validarUsuario(String usuario,String password)throws Exception{
		
		PreparedStatement pstm= null;
		Connection 		   con= null;
		ResultSet 			rs= null;
		BNUsuario validado	  = null;
		BNTrabajador validado1 = null;
		
		System.out.println(" variables1 "+usuario+"  "+password );
		try {
			con = daoSupport.getConnexion();
			
			String sql ="select  usu.id , usu.USUASIS_LOGIN_V username ,trab.USUA_NOMBRES_V  as nombres , CONCAT(trab.USUA_APELLIDOPARTERNO_V ,' ',trab.USUA_APELLIDOMATERNO_V) as apellidos" +
					" from  af_m_usuario usu " +	
					"	LEFT JOIN af_m_trabajador  trab on trab.id = usu.USUASIS_CODTRAB_I " +
						"	where usu.USUASIS_LOGIN_V = ? and usu.USUASIS_PASSWORD_V = MD5(?) ";
			
			//System.out.println(" variables2 "+usuario+"  "+password );	
			
			pstm = con.prepareStatement(sql);
			//System.out.println(" variables3 "+pstm);	
			pstm.setString(1, usuario);
			pstm.setString(2, password);
			//System.out.println(" variables4 "+pstm.executeQuery());	
			rs = pstm.executeQuery();
			//System.out.println(" variables5 "+rs );	
			while (rs.next()) 
			{
				validado = new BNUsuario();
				validado1 = new BNTrabajador();
				validado.setId(rs.getInt("id"));
				validado1.setId(rs.getInt("id"));
	            validado.setUSUASIS_LOGIN_V(rs.getString("username"));			
				validado1.setNombre(rs.getString("nombres"));
				validado1.setApellidom(rs.getString("apellidos"));
			}
		
		} catch (Exception e) {
			//rs.close();
			//pstm.close();
			System.out.println("Error al Validar "+e);
		}
	
		rs.close();
		pstm.close();
		return validado;
	}
	
	public ArrayList<BNUsuario> listadoUsuarios() throws Exception{

		Statement 			st= null;
		Connection 		   con= null;
		ResultSet 			rs= null;
		BNUsuario usuario	  = null;
		ArrayList<BNUsuario> usuarios=new ArrayList<BNUsuario>();
		
		try {
			con = BaseDaoSupport.getConnexion();
			
			String sql="select id ,USUASIS_CODTRAB_I ,USUASIS_LOGIN_V ,AUDI_FECHAREG_D from af_m_usuario";
			
			
			 st = con.createStatement();
			 rs = st.executeQuery(sql);
			
			while (rs.next()) {

				usuario = new BNUsuario();
				usuario.setId(rs.getInt("id"));
				usuario.setUSUASIS_CODTRAB_I(rs.getInt("USUASIS_CODTRAB_I"));
				usuario.setUSUASIS_LOGIN_V(rs.getString("USUASIS_LOGIN_V"));
				usuario.setAUDI_FECHAREG_D(rs.getDate("AUDI_FECHAREG_D"));
				
				/*usuario.setApellidos(rs.getString(4));
				usuario.setEmail(rs.getString(5));*/
				usuarios.add(usuario);
				}
			
			rs.close();
			st.close();
		} catch (Exception e) {
			System.out.println("Error en el select de usuario "+e);
			rs.close();
			st.close();
		}
		
		return usuarios;
		}
	
	
	public int registrarUsuario(BNUsuario usuario) throws Exception{
		
		int resultado 	= 0;
		Connection 	con	= null;
		String sql 		= null;
		PreparedStatement pstm = null;
		
		try {
		con = BaseDaoSupport.getConnexion();
		
		sql = "insert into USUARIO(CO_USER ,USERNAME  ,NOMBRES ,APELLIDOS ,ST_USUARIO," +
				"	SEXO ,DIRECCION ,TELEFONO ,TIPO_DOCUMENTO , DOCUMENTO ,PASSWORD ,EMAIL) values(?,?,?,?,?,?,?,?,?,?,?,?)";

		pstm = con.prepareStatement(sql);
		
		pstm.setLong(1, (contador++));
	/*	pstm.setString(2, usuario.getUserName());	
		pstm.setString(3, usuario.getNombres());
		pstm.setString(4, usuario.getApellidos());
		pstm.setBoolean(5, true);
		pstm.setString(6, usuario.getSexo()+"");
		pstm.setString(7, usuario.getDireccion());
		pstm.setString(8, usuario.getTelefono());
		pstm.setString(9, usuario.getTipoDocumento()+"");
		pstm.setLong(10, usuario.getDocumento());
		pstm.setString(11, usuario.getPassword());
		pstm.setString(12, usuario.getEmail());
	
*/
		resultado = pstm.executeUpdate();
		pstm.close();
		con.close();
		
		} catch (Exception e) {
			System.out.println("Error en el select de usuario "+e);
			pstm.close();
			con.close();
		}
	
		return resultado;
		
	}

}

