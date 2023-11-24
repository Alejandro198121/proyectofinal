/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
    public static void main(String[] args) {
        String mail= JOptionPane.showInputDialog("Escriba el correo");
        int x=JOptionPane.showConfirmDialog(null, "Desea enviar un correo","enviando correo", JOptionPane.PLAIN_MESSAGE);
        if(x==0){
            transferirimail(mail);
            JOptionPane.showMessageDialog(null, "si");
        }
    }
    public static void transferirimail(String correo){
        String correoEnvia="yanpis2018@gmail.com";
        String contraseña="eycq hgrl yquc ydxu";
        String mensaje="sexo";
        
        Properties objectPEC= new Properties();
        objectPEC.put("mail.smtp.host", "smtp.gamil.com");
        objectPEC.setProperty("mail.smtp.starttls.enable", "true");
        objectPEC.put("mail.smtp.port", "587");
        objectPEC.setProperty("mail.smtp.port", "587");
        objectPEC.put("mail.smtp.user", correoEnvia);
        objectPEC.setProperty("mail.smtp.auth", "true");
        objectPEC.setProperty("mail.smtp.host", "smtp.gmail.com");
		
        Session sesion= Session.getDefaultInstance(objectPEC);
        MimeMessage mail = new MimeMessage(sesion);
        
        try{
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
            mail.setSubject("Eso tilin");
            mail.setText(mensaje);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia,contraseña);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
			JOptionPane.showMessageDialog(null, "enviado");
        }catch(Exception e){
            e.printStackTrace();
			JOptionPane.showMessageDialog(null, "error");
        }
    }
}