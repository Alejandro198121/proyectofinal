package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelDatos extends JPanel {

    private Image imagenFondo;
    private JPanel panelContenedor; 
    private JComboBox<String> opcionesMenu;
    private JLabel textoMenu;
    private JButton botonSalir;
    private JButton botonOk;
    private JLabel eblank;
    
    public PanelDatos() {
        setLayout(null);

        try {
            URL urlImagen = new URL("https://cdn.discordapp.com/attachments/1081007826161373195/1173328858494279781/OIG.jpg?ex=65638ea7&is=655119a7&hm=1d474f7bf26ba9e1e347b5e18268691ccb3c8f680957b6eb0efad226734420f0&");
            imagenFondo = ImageIO.read(urlImagen);
        } catch (IOException e) {
            e.printStackTrace();
        }

        inicializarComponentes();

        setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagenFondo != null) {
            g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public void inicializarComponentes() {
        panelContenedor = new JPanel();
        panelContenedor.setBounds(175, 150, 350, 250);
        panelContenedor.setLayout(new FlowLayout());
        add(panelContenedor);

        textoMenu = new JLabel("escoja maricon");
        textoMenu.setHorizontalAlignment(SwingConstants.CENTER);
        panelContenedor.add(textoMenu);
        
        opcionesMenu = new JComboBox<String>();
        opcionesMenu.addItem("REGISTRO DE TIENDAS DE MERCADO (ALMACENES)");
        opcionesMenu.addItem("REGISTRO DE CLIENTES");
        opcionesMenu.addItem("REGISTRO DE PAREJAS");
        opcionesMenu.addItem("ASIGNACIÓN DE HORARIOS (DIA-HORA POR LUGAR)");
        opcionesMenu.addItem("ASIGNACIÓN DE CUPO DE TARJETA DE CRÉDITO");
        opcionesMenu.addItem("PAGOS CON TARJETA DE CRÉDITO");
        opcionesMenu.addItem("ABONO A TARJETA DE CRÉDITO (LIBERACIÓN DE CUPO)");
        opcionesMenu.addItem("REPORTES ANALÍTICOS");
        panelContenedor.add(opcionesMenu);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(40, 390, 100, 40);
        botonSalir.setActionCommand("BOTON_SALIR");
        add(botonSalir);
        
        eblank = new JLabel("");
        eblank.setPreferredSize(new Dimension(350,140));
        panelContenedor.add(eblank);
        
        botonOk = new JButton("OK");
        botonOk.setActionCommand("BOTON_OK");
        panelContenedor.add(botonOk);
    }

	public JButton getBotonOk() {
		return botonOk;
	}

	public void setBotonOk(JButton botonOk) {
		this.botonOk = botonOk;
	}

	public JLabel getEblank() {
		return eblank;
	}

	public void setEblank(JLabel eblank) {
		this.eblank = eblank;
	}

	public Image getImagenFondo() {
		return imagenFondo;
	}

	public void setImagenFondo(Image imagenFondo) {
		this.imagenFondo = imagenFondo;
	}

	public JPanel getPanelContenedor() {
		return panelContenedor;
	}

	public void setPanelContenedor(JPanel panelContenedor) {
		this.panelContenedor = panelContenedor;
	}

	public JComboBox<String> getOpcionesMenu() {
		return opcionesMenu;
	}

	public void setOpcionesMenu(JComboBox<String> opcionesMenu) {
		this.opcionesMenu = opcionesMenu;
	}

	public JLabel getTextoMenu() {
		return textoMenu;
	}

	public void setTextoMenu(JLabel textoMenu) {
		this.textoMenu = textoMenu;
	}

	public JButton getBotonSalir() {
		return botonSalir;
	}

	public void setBotonSalir(JButton botonSalir) {
		this.botonSalir = botonSalir;
	}
    
    
}
