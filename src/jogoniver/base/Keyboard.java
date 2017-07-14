/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoniver.base;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.TreeSet;
import javax.swing.JPanel;
import gui.panelFrame;

/**
 *Usarei uma treeSet para armazenar os comandos do personagem, de acordo com o que está
 * sendo teclado.
 * @author Abe
 */
public class Keyboard 
{
    private int tecla = 0, limiteSuperior = 10, limiteInferior = 670, limiteEsquerda = 10, limiteDireita = 730;
    private panelFrame panel;
    private char lastKey;
    
    public Keyboard(int tecla, panelFrame panel, char lastKey)
    {
        this.tecla = tecla;
        this.panel = panel;
        this.lastKey = lastKey;
    }
    
    public void moveSprite()
    {
      BufferedImage[] aux = null;
      int atual = 0;
      
                    switch(tecla){
                        case KeyEvent.VK_RIGHT:
                            atual = panel.p.getPosiAtualX();

                            if(atual >= limiteDireita)
                              atual = limiteDireita;  
                            else                                                     
                                panel.p.setPosiAtualX(atual + 20);                                  
                            
                            aux = panel.p.getRun_R();   
                            panel.p.setCurrentFrame(aux[1]);
                            lastKey = 'd';
                            break;

                        case KeyEvent.VK_LEFT:
                            atual = panel.p.getPosiAtualX();
                            
                            if(atual <= limiteEsquerda)
                              atual = limiteEsquerda;  
                            else
                                panel.p.setPosiAtualX(atual - 20);
                            
                            aux = panel.p.getRun_L();
                            panel.p.setCurrentFrame(aux[1]);
                            lastKey = 'e';
                            
                            break;              
                       
                        case KeyEvent.VK_UP:
                            atual = panel.p.getPosiAtualY();
                            
                            if(atual <= limiteSuperior)
                              atual = limiteSuperior;  
                            else
                                panel.p.setPosiAtualY(atual - 20);

                            break;      
                            
                        case KeyEvent.VK_DOWN:
                            atual = panel.p.getPosiAtualY();
                            
                            if(atual >= limiteInferior)
                              atual = limiteInferior;  
                            else
                                panel.p.setPosiAtualY(atual + 20);

                            break;     
                            
                        case KeyEvent.VK_ESCAPE:
                            break;
                }
    }
    
    public void unMoveSprite()
    {
        BufferedImage aux = null;
        int atual = 0;
        
            switch(tecla){
                case KeyEvent.VK_RIGHT:
                    atual = panel.p.getPosiAtualX();
                    
                    if(atual >= limiteDireita)
                        atual = limiteDireita; 
                     else{                     
                        panel.p.setPosiAtualX(atual + 20); 
                    }
                    
                    aux = panel.p.getFrameDir();
                    panel.p.setCurrentFrame(aux);                        
                    break;                   

                case KeyEvent.VK_LEFT:
                    atual = panel.p.getPosiAtualX();
                     
                    if(atual <= limiteEsquerda)
                        atual = limiteEsquerda; 
                     else{
                        panel.p.setPosiAtualX(atual - 20);
                     }
                     
                    aux = panel.p.getFrameEsq();                        
                    panel.p.setCurrentFrame(aux);
                    break;  
                    
                case KeyEvent.VK_UP:   
                    atual = panel.p.getPosiAtualY();
                    
                    if(atual <= limiteSuperior)
                        atual = limiteSuperior;  
                    else
                        panel.p.setPosiAtualY(atual + 20);
                    
                    if(lastKey == 'd'){
                        aux = panel.p.getFrameDir();
                        panel.p.setCurrentFrame(aux);  
                     }else if(lastKey == 'e'){
                                aux = panel.p.getFrameEsq();
                                panel.p.setCurrentFrame(aux);
                            }                    

                            break;                     
 
                case KeyEvent.VK_DOWN:   
                    atual = panel.p.getPosiAtualY();
                    System.out.println(atual);
                    if(atual >= limiteInferior)
                        atual = limiteInferior;  
                    else
                        panel.p.setPosiAtualY(atual - 20);
                        
                    if(lastKey == 'd'){
                        aux = panel.p.getFrameDir();
                        panel.p.setCurrentFrame(aux);  
                     }else if(lastKey == 'e'){
                                aux = panel.p.getFrameEsq();
                                panel.p.setCurrentFrame(aux);
                            }                    

                            break;                              
            }    
    }    
    
}
