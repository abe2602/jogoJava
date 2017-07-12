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
    private boolean[] controleTecla = new boolean[4];
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
                int tecla = e.getKeyCode(), atual = 0;
                BufferedImage[] aux = null;

                    switch(tecla){
                        case KeyEvent.VK_RIGHT:
                            atual = panel.p.getPosiAtualX();
                            panel.p.setPosiAtualX(atual + 10);

                            aux = panel.p.getRun_R();
                            panel.p.setCurrentFrame(aux[1]);   

                            lastKey = 'd';
                            break;

                        case KeyEvent.VK_UP:
                            atual = panel.p.getPosiAtualY();
                            panel.p.setPosiAtualY(atual - 10);

                            if(lastKey == 'd'){
                                aux = panel.p.getRun_R();
                                panel.p.setCurrentFrame(aux[0]);   
                            }else if(lastKey == 'e'){
                                aux = panel.p.getRun_L();
                                panel.p.setCurrentFrame(aux[0]);   
                            }

                            break; 

                        case KeyEvent.VK_LEFT:
                            atual = panel.p.getPosiAtualX();
                            panel.p.setPosiAtualX(atual - 10);
                            aux = panel.p.getRun_L();

                            panel.p.setCurrentFrame(aux[1]);

                            lastKey = 'e';
                            break;              
                 }
            }

            @Override
            public void keyReleased(KeyEvent e) 
            {    
               int tecla = e.getKeyCode(), atual = 0;
               BufferedImage aux = null;

                    switch(tecla){
                        case KeyEvent.VK_RIGHT:
                            atual = panel.p.getPosiAtualX();
                            panel.p.setPosiAtualX(atual + 10);

                            aux = panel.p.getFrameDir();
                            panel.p.setCurrentFrame(aux);                        
                            break;

                        case KeyEvent.VK_UP:                   
                            if(lastKey == 'd'){
                                atual = panel.p.getPosiAtualY();
                                panel.p.setPosiAtualY(200);

                                aux = panel.p.getFrameDir();
                                panel.p.setCurrentFrame(aux);  
                            }else if(lastKey == 'e'){
                                atual = panel.p.getPosiAtualY();
                                panel.p.setPosiAtualY(200);

                                aux = panel.p.getFrameEsq();
                                panel.p.setCurrentFrame(aux);
                            }                    

                            break;                    

                         case KeyEvent.VK_LEFT:
                            atual = panel.p.getPosiAtualX();
                            panel.p.setPosiAtualX(atual - 10);
                            aux = panel.p.getFrameEsq();

                            panel.p.setCurrentFrame(aux);
                            break; 
                 }
            }
        });

 
        this.setVisible(true);
        this.setSize(400, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(panel);
    }

    public void start()
    {        
        while(true){   
            long prxAtualizacao = 0; 
            if (System.currentTimeMillis() >= prxAtualizacao) {
                this.panel.repaint();
                prxAtualizacao = System.currentTimeMillis() + FPS;   
            }
        }
    }
}
