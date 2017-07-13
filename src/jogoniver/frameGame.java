/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoniver;

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
    private final Set<Integer> pressed = new HashSet<Integer>();
    
    public frameGame()
    {
        this.panel = new panelFrame();
        
        super.addKeyListener(new KeyListener(){
            
            @Override
            public void keyTyped(KeyEvent e)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        this.setSize(400, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(panel);
    }

    public void start()
    {        
        while(jogando){   
            long prxAtualizacao = 0; 
            if (System.currentTimeMillis() >= prxAtualizacao) {
                this.panel.repaint();
                prxAtualizacao = System.currentTimeMillis() + FPS;   
            }
        }
    }
}
