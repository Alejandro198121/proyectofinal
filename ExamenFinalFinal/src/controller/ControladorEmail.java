/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

/**
 * Clase que controla el envio del email de confirmacion
 * 
 * @author Grupo JAN
 */
public class ControladorEmail {
/**
 * variable errorEmail de tipo booleano con valor falso
 */
	boolean errorEmail = false;

	/**
	 * 
	 */
	public ControladorEmail() {

	}

	/**
	 * Metodo que transfiere el email al metodo que envia el correo
	 * 
	 * @param correo correo que transfiere
	 */
	public void enviarEmail(String correo) {
		String mail = correo;

		transferirimail(mail);
	}

	/**
	 * Metodo que confirma el envio del correo
	 * 
	 * @return mensaje de confirmacion
	 */
	public int mensajeConfirmacion() {
		int z = JOptionPane.showConfirmDialog(null, "Se ha enviado una confirmacion a su correo",
				"Mensaje de confirmacion", JOptionPane.PLAIN_MESSAGE);
		return z;
	}

	/**
	 * Metodo que envia a un correo especifico
	 * 
	 * @param correo correo al cual se envia el correo
	 */
	public void transferirimail(String correo) {
		String correoEnvia = "yanpis2018@gmail.com";
		String contrasena = "eycq hgrl yquc ydxu";
		String mensaje = "sexo";

		Properties objectPEC = new Properties();
		objectPEC.put("mail.smtp.host", "smtp.gamil.com");
		objectPEC.setProperty("mail.smtp.starttls.enable", "true");
		objectPEC.put("mail.smtp.port", "587");
		objectPEC.setProperty("mail.smtp.port", "587");
		objectPEC.put("mail.smtp.user", correoEnvia);
		objectPEC.setProperty("mail.smtp.auth", "true");
		objectPEC.setProperty("mail.smtp.host", "smtp.gmail.com");

		Session sesion = Session.getDefaultInstance(objectPEC);
		MimeMessage mail = new MimeMessage(sesion);

		try {
			mail.setFrom(new InternetAddress(correoEnvia));
			mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
			mail.setSubject("Eso tilin");
			mail.setText(mensaje);

			Transport transporte = sesion.getTransport("smtp");
			transporte.connect(correoEnvia, contrasena);
			transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
			transporte.close();
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "error");
			setErrorEmail(true);
		}
	}
/**
 * metodo que revisa si hay un error en el email
 * @return error de email
 */
	public boolean isErrorEmail() {
		return errorEmail;
	}
/**
 * definir error email
 * @param errorEmail error email a definir
 */
	public void setErrorEmail(boolean errorEmail) {
		this.errorEmail = errorEmail;
	}

}