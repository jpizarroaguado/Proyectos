package org.joedayz.acweb.domain;

import java.io.Serializable;

import java.util.Date;

public class BNUsuario implements Serializable{

	private static final long serialVersionUID = -1L;
	
    public int id;
    
    public int USUASIS_CODTRAB_I;
    
     // @Required
     public String USUASIS_LOGIN_V;

   
    //@Constraints.Required
     //@Required
    public String USUASIS_PASSWORD_V;
    
 

    public int USUASIS_TIPOUSU_I;

    
    public int AUDI_CODUSUARIO_I;
   
    
    public Date AUDI_FECHAREG_D;
    

    public Date AUDI_FECHAMOD_D;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUSUASIS_CODTRAB_I() {
		return USUASIS_CODTRAB_I;
	}


	public void setUSUASIS_CODTRAB_I(int uSUASIS_CODTRAB_I) {
		USUASIS_CODTRAB_I = uSUASIS_CODTRAB_I;
	}


	public String getUSUASIS_LOGIN_V() {
		return USUASIS_LOGIN_V;
	}


	public void setUSUASIS_LOGIN_V(String uSUASIS_LOGIN_V) {
		USUASIS_LOGIN_V = uSUASIS_LOGIN_V;
	}


	public String getUSUASIS_PASSWORD_V() {
		return USUASIS_PASSWORD_V;
	}


	public void setUSUASIS_PASSWORD_V(String uSUASIS_PASSWORD_V) {
		USUASIS_PASSWORD_V = uSUASIS_PASSWORD_V;
	}


	public int getUSUASIS_TIPOUSU_I() {
		return USUASIS_TIPOUSU_I;
	}


	public void setUSUASIS_TIPOUSU_I(int uSUASIS_TIPOUSU_I) {
		USUASIS_TIPOUSU_I = uSUASIS_TIPOUSU_I;
	}


	public int getAUDI_CODUSUARIO_I() {
		return AUDI_CODUSUARIO_I;
	}


	public void setAUDI_CODUSUARIO_I(int aUDI_CODUSUARIO_I) {
		AUDI_CODUSUARIO_I = aUDI_CODUSUARIO_I;
	}


	public Date getAUDI_FECHAREG_D() {
		return AUDI_FECHAREG_D;
	}


	public void setAUDI_FECHAREG_D(Date aUDI_FECHAREG_D) {
		AUDI_FECHAREG_D = aUDI_FECHAREG_D;
	}


	public Date getAUDI_FECHAMOD_D() {
		return AUDI_FECHAMOD_D;
	}


	public void setAUDI_FECHAMOD_D(Date aUDI_FECHAMOD_D) {
		AUDI_FECHAMOD_D = aUDI_FECHAMOD_D;
	}


    
}
