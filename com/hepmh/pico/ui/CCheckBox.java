package com.hepmh.pico.ui;

// AWT
import java.awt.Dimension;

// Swing
import javax.swing.JCheckBox;


public class CCheckBox extends JCheckBox {
    int sWidth, sHeight;
   

    public CCheckBox(String title, int width, int height) {
        super(title);

        sWidth = width;
        sHeight = height;
    }


    public Dimension getMinimumSize() {
        return new Dimension(sWidth, sHeight);
    }


    public Dimension getPreferredSize() {
        return this.getMinimumSize();
    }
}
