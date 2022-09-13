package com.hepmh.pico.ui;

// AWT
import java.awt.Dimension;

// Swing
import javax.swing.JButton;


public class CButton extends JButton {
    int sWidth, sHeight;


    public CButton(String title, int width, int height) {
        super(title);

        sWidth = width;
        sHeight = height;
    }


    public CButton(int width, int height) {
        super();

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
