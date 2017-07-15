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
        
        for(i = 0; i <400; i++){
            fase[600][i] = 3;
            fase[605][i] = 3;
            fase[610][i] = 3;
            fase[100][i] = 3;
            fase[105][i] = 3;
            fase[110][i] = 3;
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
         this.carregarCenario();
        for(int i = 0; i < 800; i++){
            for(int j = 0; j < 800; j++){
                if(fase[i][j] != -1){
                  g.drawImage(frameDir, i, j, null);
                }
            }
        }    
    }

    public int[][] getFase() {
        return fase;
    }

    public void setFase(int[][] fase) {
        this.fase = fase;
    }

    public BufferedImage getFrameDir() {
        return frameDir;
    }

    public void setFrameDir(BufferedImage frameDir) {
        this.frameDir = frameDir;
    }
    
   
}
