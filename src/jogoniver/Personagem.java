/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoniver;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import jogoniver.base.Elementos;

/**
 *Classe a qual é responsável pela atualização do boneco, é nela onde setamos as
 * posições atuais, além de realizar a troca de sprites
 * @author Abe
 */
public class Personagem extends Elementos
{   
    public Personagem(String[] dir)
    {
        super(dir);
        this.setPosiAtualX(200);
        this.setPosiAtualY(400);
    }
}
