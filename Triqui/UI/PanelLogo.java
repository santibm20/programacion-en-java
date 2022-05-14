package com.usc.UI;

import javax.swing.*;


public class PanelLogo extends JPanel
{
    JLabel textoLogo;
    
    public PanelLogo()
    {
        textoLogo = new JLabel();
        textoLogo.setText("aqui va el logo");
        add(textoLogo);
        this.setBackground(Color.yellow);
    }
}
