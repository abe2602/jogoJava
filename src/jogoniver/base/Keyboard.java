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
import jogoniver.Nivel;

/**
 *Usarei uma treeSet para armazenar os comandos do personagem, de acordo com o que está
 * sendo teclado.
 * @author Abe
 */
public class Keyboard 
{
    private int tecla = 0, limiteSuperior = 20, limiteInferior = 670, limiteEsquerda = 10, limiteDireita = 720, passo = 10;
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
                                                   
                            if(panel.nivel.fase[panel.p.getPosiAtualX() + panel.p.getComprimentoSprite()][panel.p.getPosiAtualY()] == -1){
                            atual = panel.p.getPosiAtualX();

                            if(atual >= limiteDireita)
                              atual = limiteDireita;  
                            else                                                     
                                panel.p.setPosiAtualX(atual + passo);                                  
                            
                            aux = panel.p.getRun_R();   
                            panel.p.setCurrentFrame(aux[1]);
                            lastKey = 'd';}
                            break;

                        case KeyEvent.VK_LEFT:
                            if(panel.nivel.fase[panel.p.getPosiAtualX()][panel.p.getPosiAtualY()] == -1){
                            atual = panel.p.getPosiAtualX();
                            
                            if(atual <= limiteEsquerda)
                              atual = limiteEsquerda;  
                            else
                                panel.p.setPosiAtualX(atual - passo);
                            
                            aux = panel.p.getRun_L();
                            panel.p.setCurrentFrame(aux[1]);
                            lastKey = 'e';
                            }
                            break;              
                       
                        case KeyEvent.VK_UP:
                            if(panel.nivel.fase[panel.p.getPosiAtualX() ][panel.p.getPosiAtualY() + panel.p.getAlturaSprite()] == -1){
                            atual = panel.p.getPosiAtualY();
                            
                            if(atual <= limiteSuperior)
                              atual = limiteSuperior;  
                            else
                                panel.p.setPosiAtualY(atual - passo);
                            }
                            break;      
                            
                        case KeyEvent.VK_DOWN:
                            atual = panel.p.getPosiAtualY();
                            
                            if(atual >= limiteInferior)
                              atual = limiteInferior;  
                            else
                                panel.p.setPosiAtualY(atual + passo);

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
                    if(panel.nivel.fase[panel.p.getPosiAtualX() + panel.p.getComprimentoSprite()][panel.p.getPosiAtualY()] == -1){
                        atual = panel.p.getPosiAtualX();                    

                        if(atual >= limiteDireita)
                            atual = limiteDireita; 
                         else{                     
                            panel.p.setPosiAtualX(atual + passo); 
                        }

                        aux = panel.p.getFrameDir();
                        panel.p.setCurrentFrame(aux);                       
                     }
                    break;                   

                case KeyEvent.VK_LEFT:
                    if(panel.nivel.fase[panel.p.getPosiAtualX()][panel.p.getPosiAtualY()] == -1){
                        atual = panel.p.getPosiAtualX();

                        if(atual <= limiteEsquerda)
                            atual = limiteEsquerda; 
                         else{
                            panel.p.setPosiAtualX(atual - passo);
                         }

                        aux = panel.p.getFrameEsq();                        
                        panel.p.setCurrentFrame(aux);
                    }
                    break;  
                    
                case KeyEvent.VK_UP:   
                    if(panel.nivel.fase[panel.p.getPosiAtualX()][panel.p.getPosiAtualY() +  panel.p.getAlturaSprite()] == -1){
                        atual = panel.p.getPosiAtualY();

                        if(atual <= limiteSuperior)
                            atual = limiteSuperior;  
                        else
                            panel.p.setPosiAtualY(atual + passo);

                        if(lastKey == 'd'){
                            aux = panel.p.getFrameDir();
                            panel.p.setCurrentFrame(aux);  
                         }else if(lastKey == 'e'){
                                    aux = panel.p.getFrameEsq();
                                    panel.p.setCurrentFrame(aux);
                                }                    
                    }
                            break;                     
 
                case KeyEvent.VK_DOWN:   
                    atual = panel.p.getPosiAtualY();
                    if(atual >= limiteInferior)
                        atual = limiteInferior;  
                    else
                        panel.p.setPosiAtualY(atual - passo);
                        
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
