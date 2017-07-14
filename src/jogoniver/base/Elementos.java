/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoniver.base;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @author Abe
 */
public class Elementos 
{
    private int posiAtualX = 0, posiAtualY = 0; //Posições iniciais(X, Y) do sprite
    private BufferedImage frameDir, frameEsq, currentFrame = null; //Ajuda na troca dos sprites
    private BufferedImage[] run_R = null, run_L = null;//Guardo os vários sprites
    private final int alturaSprite = 60, comprimentoSprite = 40; //Altura e comprimento do sprite
    private Rectangle boxColisao = null; // "Caixa" de colisão  
    private String[] dir;
    
    /*Construtor*/
    public Elementos(String[] dir)
    {    
        run_L = new BufferedImage[6];
        run_R = new BufferedImage[6];  
        
        this.loadImagens(dir);
        currentFrame = frameDir;
        boxColisao= new Rectangle(posiAtualX, posiAtualY, alturaSprite, comprimentoSprite);
    }
    
    /*Carrega todas as imagens em memória*/
       public void loadImagens(String[] dir)
       {
            try {
		frameDir=ImageIO.read(getClass().getResource(dir[0]));
		frameEsq=ImageIO.read(getClass().getResource(dir[1]));
			
		run_R[0]=ImageIO.read(getClass().getResource(dir[2]));
		run_L[0]=ImageIO.read(getClass().getResource(dir[3]));
			
		run_R[1]=ImageIO.read(getClass().getResource(dir[4]));
		run_L[1]=ImageIO.read(getClass().getResource(dir[5]));
            } catch (Exception e) {
		e.printStackTrace();
		}       
       }    
       
    /*Getters and setters*/   

    public String[] getDir() {
        return dir;
    }

    public void setDir(String[] dir) {
        this.dir = dir;
    }
       
       
    public BufferedImage getFrameEsq() {
        return frameEsq;
    }

    public void setFrameEsq(BufferedImage frameEsq) {
        this.frameEsq = frameEsq;
    }

    public BufferedImage getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(BufferedImage currentFrame) {
        this.currentFrame = currentFrame;
    }

    public BufferedImage[] getRun_R() {
        return run_R;
    }

    public void setRun_R(BufferedImage[] run_R) {
        this.run_R = run_R;
    }

    public BufferedImage[] getRun_L() {
        return run_L;
    }

    public void setRun_L(BufferedImage[] run_L) {
        this.run_L = run_L;
    }
    
    public int getPosiAtualX() {
        return posiAtualX;
    }

    public void setPosiAtualX(int posiAtualX) {
        this.posiAtualX = posiAtualX;
    }

    public int getPosiAtualY() {
        return posiAtualY;
    }

    public void setPosiAtualY(int posiAtualY) {
        this.posiAtualY = posiAtualY;
    }
 
    public BufferedImage getFrameDir() {
        return frameDir;
    }

    public void setFrameDir(BufferedImage frameDir) {
        this.frameDir = frameDir;
    }    
}
