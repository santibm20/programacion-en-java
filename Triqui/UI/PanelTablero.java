
package com.usc.UI;

import javax.swing.*;

public class PanelTablero extends JPanel
{
    JLabel etiquetaPrueba;
    
    public PanelTablero()
    {
        etiquetaPrueba = new JLabel("Aqui va  el tablero");
        this.add(etiquetaPrueba);
        this.setBackground(Color.yellow);
    }
}
