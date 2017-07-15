/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import jogoniver.base.Keyboard;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Abe
 */
public class frameGame extends JFrame
{
    private panelFrame panel;
    private int FPS = 60;
    private int px;
    private char lastKey;
    private boolean jogando = true;
    
    
    public frameGame()
    {
        this.panel = new panelFrame();
        
        super.addKeyListener(new KeyListener(){
            
            @Override
            public void keyTyped(KeyEvent e)
            {
                System.out.println("SOLTA");
            }

            @Override
            public void keyPressed(KeyEvent e) 
            {
                Keyboard teclado = new Keyboard(e.getKeyCode(), panel, lastKey);
                teclado.moveSprite();
            }

            @Override
            public void keyReleased(KeyEvent e) 
            {    
                Keyboard teclado = new Keyboard(e.getKeyCode(), panel, lastKey);
                teclado.unMoveSprite();
            }
        });

 
        this.setVisible(true);
        this.setSize(800, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
// this.add(panel);
        this.panel.repaint();
    }

    public void start()
    {        
        while(jogando){   
            long prxAtualizacao = 0; 
            if (System.currentTimeMillis() >= prxAtualizacao) {
                
            //    c.desenha();
                this.panel.repaint();
                prxAtualizacao = System.currentTimeMillis() + FPS;   
            }
        }
    }
}
