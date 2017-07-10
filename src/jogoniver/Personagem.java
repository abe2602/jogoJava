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
    private BufferedImage frameDir;
    private int posiAtualX = 128, posiAtualY = 200;
    private static int PASSO = 4;
       
    public Personagem()
    {    
        try {
            frameDir = ImageIO.read(getClass().getResource("../jogoniver/imagens/y-r.png"));
        } catch (IOException ex) {
            Logger.getLogger(panelFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void movimenta(int dir)
    {
        switch(dir) {
            case KeyEvent.VK_RIGHT:
                posiAtualX += PASSO;
            break;

            case KeyEvent.VK_LEFT:
                posiAtualX -= PASSO;
            break;
            
            default:
            break;
    
        }
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
