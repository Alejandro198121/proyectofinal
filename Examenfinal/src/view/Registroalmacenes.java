/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistroAlmacenes extends JFrame {
    private JPanel panel1, panel2;
    private Image imagenfondo;
    private JLabel texto;
    private JTextField cajatexto;
    public RegistroAlmacenes() {
        inicializarComponentes();
        setSize(700, 500);
        setVisible(true);
        try {
            URL urlImagen = new URL("https://png.pngtree.com/png-clipart/20190118/ourlarge/pngtree-cartoon-map-green-map-map-illustration-location-map-png-image_447719.jpg");
            imagenfondo = ImageIO.read(urlImagen);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void inicializarComponentes(){
        panel1= new JPanel();
        texto= new JLabel("Escriba la direccion del almacen");
        texto.setSize(100,100);
        cajatexto= new JTextField(25);
        cajatexto.setSize(100,100);
        panel1.add(texto);
        panel1.add(cajatexto);
        add(panel1);
    }
}
