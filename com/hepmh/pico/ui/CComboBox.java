package com.hepmh.pico.ui;

// AWT
import java.awt.Dimension;

// Swing
import javax.swing.JComboBox;


public class CComboBox extends JComboBox {
	int sWidth, sHeight;


	public CComboBox(int width, int height) {
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
