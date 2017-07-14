/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoniver;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import jogoniver.base.Cenario;

/**
 *
 * @author Abe
 */
public class Nivel extends Cenario 
{
    private int[][] fase;
    private BufferedImage frameDir;
    
    /*Falta acabar aqui!*/
    @Override
    public void carregarCenario() 
    {
        fase = new int[800][800];
        int i = 0, j = 0;
        
        for(i = 0; i < 800; i++){
            for(j = 0; j < 800; j++){
                fase[i][j] = -1;
            }
        }
        
        for(i = 0; i < 770; i++){
            fase[i][0] = 1;
            fase[0][i] = 1;
        }
    }
    
    public void carregarSprite()
    {
        try{
        frameDir = ImageIO.read(getClass().getResource("../jogoniver/imagens/pepperoni.png"));
        }catch(Exception e){

        }
    }
    @Override
    public void atualizarCenario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void descarregarCenario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desenharCenario(Graphics2D g) 
    {
      //  this.carregarSprite();
        for(int i = 0; i < 800; i++){
            for(int j = 0; j < 800; j++){
                if(fase[i][j] != -1){
                  g.drawImage(frameDir, i, j,null);  
                }
            }
        }    
    }
    
   
}
