/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

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
import jogoniver.Colisoes;
import jogoniver.Nivel;
import jogoniver.Personagem;

/**
 *
 * @author Abe
 */
public class panelFrame extends JPanel
{
    public Personagem p;
    private String[] dir = {"imagens/y-r.png","imagens/y-l.png",
        "imagens/y-r0.png","imagens/y-l0.png",
        "imagens/y-r1.png","imagens/y-l1.png"};
    private Nivel n;
    private Colisoes c;
    
    public panelFrame()
    {
        this.setVisible(true);
        this.setFocusable(true);
        this.setSize(800, 800);
        this.p = new Personagem(dir);
      
        this.n = new Nivel();
	this.setBackground(Color.BLACK);	
	this.setLayout(null);
        

    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        n.carregarCenario();
        n.carregarFundo();
        n.desenharCenario(g2);
        this.c = new Colisoes();
        c.confere(n.fase, p);
        g2.drawImage(this.p.getCurrentFrame(),this.p.getPosiAtualX(), this.p.getPosiAtualY(),null);     
    }
}
