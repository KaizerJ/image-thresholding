package com.mycompany.image.thresholding;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Lienzo extends JPanel{

    private BufferedImage image;


    public Lienzo() {
        this.image = null;//new BufferedImage(1024, 768, BufferedImage.TYPE_INT_RGB);
        //this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(image != null){
            g.drawImage(image, 0, 0, null);
        } else {
            g.setColor(Color.GRAY);
            g.setFont(new Font( "SansSerif", Font.PLAIN, 20 ));
            g.drawString("Abre una imagen en Fichero > Abrir", 
                    this.getWidth()/2 - 150, this.getHeight()/2);
        }
    }
    
    public void setImage(BufferedImage image){
        this.image = image;
        this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
        repaint();
    }
    
}
