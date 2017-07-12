/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoniver;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Abe
 */
public class panelFrame extends JPanel
{
    public Personagem p;
    
    public panelFrame()
    {
        this.setVisible(true);
        this.setFocusable(true);
        // this.addKeyListener(new InputHandler());
        this.setSize(600, 400);
        this.p = new Personagem();
	//set a random background color to distinguish the play panel from the rest
	this.setBackground(Color.WHITE);	
	//set no layouts
	this.setLayout(null);
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        this.p.getFrameDir();
        g2.drawImage(this.p.getCurrentFrame(),this.p.getPosiAtualX(), this.p.getPosiAtualY(),null);     
    }
}
