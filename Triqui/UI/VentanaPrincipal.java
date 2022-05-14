
package com.usc.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class VentanaPrincipal extends JFrame 
{
    
    PanelLogo logoTriqui;
    PanelTablero tableroTriqui;
    PanelPuntaje puntajeTriqui;
    
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal(); 
        miVentana.setVisible(true);
    }
    
    public VentanaPrincipal()
    {
        this.setTitle("Mi primer aplicacion con Ui");
        this.setBackground(Color.BLACK);
        this.setSize(800,600);
        this.setResizable(false);
        
        this.setLayout(new BorderLayout());
        
        logoTriqui = new PanelLogo();
        this.add(logoTriqui, BorderLayout.NORTH);
        
        tableroTriqui = new PanelTablero();
        this.add(tableroTriqui, BorderLayout.CENTER);
        
        puntajeTriqui = new PanelPuntaje();
        this.add(puntajeTriqui, BorderLayout.EAST);
        
        
        
    }
}
