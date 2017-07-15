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
    public int[][] fase;
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
        
        for(i = 650; i <800; i++){
            fase[400][i] = 3;
        }

        for(i = 100; i < 360; i++){
            fase[i][i] = 3;
        }
        
        for(i = 360; i <550; i++){
            fase[i][360] = 3;
        }
        
        for(i = 90; i <180; i++){
            fase[100][i] = 3;
            fase[459][i] = 3;
            fase[540][i] = 3;
        }
        
        for(i = 0; i <100; i++){
            fase[i][90] = 3;  
            fase[i][330] = 3; 
            fase[i][510] = 3; 
            fase[i][630] = 3;
        }    
    }
    
    public void carregarFundo()
    {
        try{
        frameDir = ImageIO.read(getClass().getResource("imagens/fundo.png"));
        }catch(Exception e){

        }
    }
    
    public void carregarLabirinto()
    {
        try{
        frameDir = ImageIO.read(getClass().getResource("imagens/bloco.png"));
     //  ImageResizer a;
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
        this.carregarFundo();
        g.drawImage(frameDir, 0, 0,null);
         this.carregarLabirinto();
        for(int i = 0; i < 800; i++){
            for(int j = 0; j < 800; j++){
                if(fase[i][j] != -1){
               //     this.carregarLabirinto();
                   g.drawImage(frameDir, i, j, null);
                }
            }
        }    
    }
    
   
}
