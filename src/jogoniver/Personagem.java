/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoniver;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;

/**
 *
 * @author Abe
 */
public class Personagem extends Thread
{
    private int posiAtualX = 128, posiAtualY = 200;
    private BufferedImage frameDir, frameEsq, currentFrame = null;
    private BufferedImage[] run_R = null, run_L = null;     
    
    public Personagem()
    {    
        run_L = new BufferedImage[6];
        run_R = new BufferedImage[6];  
        
        this.loadImagens();
        currentFrame = frameDir;
    }
    
 
       public void loadImagens()
       {
            try {
		frameDir=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-r.png"));
		frameEsq=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-l.png"));
			
		run_R[0]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-r0.png"));
		run_L[0]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-l0.png"));
			
		run_R[1]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-r1.png"));
		run_L[1]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-l1.png"));
			
		run_R[2]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-r2.png"));
		run_L[2]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-l2.png"));
			
		run_R[3]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-r3.png"));
		run_L[3]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-l3.png"));
			
		run_R[4]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-r4.png"));
		run_L[4]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-l4.png"));
			
		run_R[5]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-r5.png"));
		run_L[5]=ImageIO.read(getClass().getResource("../jogoniver/imagens/y-l5.png"));
            } catch (Exception e) {
		e.printStackTrace();
		}       
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
