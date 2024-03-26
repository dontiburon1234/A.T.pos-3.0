package login;

import javax.swing.JOptionPane;

import database.UsuarioDAO;
import main.Principal;

public class ModLogin {
	
	private Principal principal;
	private ConLogin conLogin;

	public ModLogin() {
		super();
	}

	public void iniciarPrincipal(IntLogin intLogin, Login login, UsuarioDAO usuarioDAO, String concepto) {
		
		if (concepto == "inicio") {
			System.out.println("ModLogin.iniciarPrincipal() concepto 1 ->"+concepto);
		}else {
			System.out.println("ModLogin.iniciarPrincipal() concepto 2 ->"+concepto);
		}
		
		String sPassword = new String(intLogin.getPwdPassword().getPassword());
		if(intLogin.getTxtUsuario().getText().equals("")||sPassword.equals("")){
			JOptionPane.showMessageDialog(null, "Usuario y/o password erroneos.");
		}else{
			boolean ingreso =  usuarioDAO.consultaCajero(intLogin.getTxtUsuario().getText(),intLogin.getPwdPassword().getPassword());
			if(ingreso) {
				
				login.dispose();
				principal = new Principal(intLogin.getTxtUsuario().getText());
				principal.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Usuario y/o password erroneos.");
			}
		}
	}
	
	public boolean administradorAutorizado(IntLogin intLogin, Login login, UsuarioDAO usuarioDAO, String concepto) {
		iniciarPrincipal(intLogin, login, usuarioDAO, "autorizacion");
		return true;
	}

	/**
	 * @return the principal
	 */
	public Principal getPrincipal() {
		return principal;
	}

	/**
	 * @param principal the principal to set
	 */
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	/**
	 * @return the conLogin
	 */
	public ConLogin getConLogin() {
		return conLogin;
	}

	/**
	 * @param conLogin the conLogin to set
	 */
	public void setConLogin(ConLogin conLogin) {
		this.conLogin = conLogin;
	}
	
}
