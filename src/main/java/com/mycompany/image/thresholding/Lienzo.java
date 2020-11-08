package com.mycompany.image.thresholding;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Lienzo extends JPanel{

    private BufferedImage image;


    public Lienzo() {
        this.image = new BufferedImage(1024, 768, BufferedImage.TYPE_INT_RGB);
        this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }
    
    public void setImage(BufferedImage image){
        this.image = image;
        this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
        repaint();
    }
    
}
