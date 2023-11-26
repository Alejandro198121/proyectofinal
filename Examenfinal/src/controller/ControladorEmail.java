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
 *
 * @author ASUS
 */
public class ControladorEmail {

    /**
     * @param args the command line arguments
     */
    
    boolean errorEmail = false;
    public ControladorEmail() {
        
    }

    public void enviarEmail(String correo) {
        String mail = correo;

        transferirimail(mail);
    }
    
    public int mensajeConfirmacion(){
        int z = JOptionPane.showConfirmDialog(null, "Se ha enviado una confirmacion a su correo", "Mensaje de confirmacion", JOptionPane.PLAIN_MESSAGE);
        return z;
    }
    
    public void transferirimail(String correo) {
        String correoEnvia = "yanpis2018@gmail.com";
        String contraseña = "eycq hgrl yquc ydxu";
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
            transporte.connect(correoEnvia, contraseña);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "error");
            setErrorEmail(true);
        }
    }

    public boolean isErrorEmail() {
        return errorEmail;
    }

    public void setErrorEmail(boolean errorEmail) {
        this.errorEmail = errorEmail;
    }

}
