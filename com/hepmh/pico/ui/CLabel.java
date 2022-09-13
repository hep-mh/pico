package com.hepmh.pico.ui;

// AWT
import java.awt.Dimension;

// Swing
import javax.swing.JLabel;


public class CLabel extends JLabel {
	int sWidth, sHeight;
   

	public CLabel(String content, int width, int height) {
		super(content);
		
		sWidth = width;
		sHeight = height;
	}


	public CLabel(int width, int height) {
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
