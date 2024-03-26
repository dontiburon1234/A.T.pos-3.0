package login;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import database.UsuarioDAO;
import util.IntKeyLetras;
import util.IntKeyNumeros;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;

	public Login(String motivo) {

		Toolkit tamano = Toolkit.getDefaultToolkit();
		int ancho = (int) ((tamano.getScreenSize().getWidth() - 718) / 2);
		int alto = (int) ((tamano.getScreenSize().getHeight() - 570) / 2);
		
        ImageIcon icono = new ImageIcon(getClass().getResource("/resources/Logo-ATpos-200px.png"));
        setIconImage(icono.getImage());
		setTitle("Login - A.T.pos");
		setBounds(ancho, alto, 718, 570);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Declaramos las clases y las instanciamos
		
		IntLogin intLogin = new IntLogin();
		IntKeyLetras intKeyLetras = new IntKeyLetras();
		IntKeyNumeros intKeyNumeros = new IntKeyNumeros();
		
		ModLogin modLogin = new ModLogin();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		ConLogin conLogin;
		if(motivo=="inicio") {
			System.out.println("Login.Login() motivo 1-> "+motivo);
			conLogin = new ConLogin(intLogin, intKeyLetras, intKeyNumeros, modLogin, usuarioDAO, motivo, this);
		}else {
			System.out.println("Login.Login() motivo 2-> "+motivo);
			conLogin = new ConLogin(intLogin, intKeyLetras, intKeyNumeros, modLogin, usuarioDAO, motivo, this);
		}

		// Enviarle una instancia de cada clases al controlafor
		conLogin.setIntKeyLetras(intKeyLetras);
		conLogin.setIntKeyNumeros(intKeyNumeros);
		conLogin.setModLogin(modLogin);
		
		modLogin.setConLogin(conLogin);
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(intLogin, BorderLayout.CENTER);
		getContentPane().add(intKeyNumeros, BorderLayout.LINE_END);
		getContentPane().add(intKeyLetras, BorderLayout.PAGE_END);
		
//		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = new Login("inicio");
		login.setVisible(true);
	}
}
