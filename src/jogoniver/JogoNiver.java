/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoniver;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * 
 *O que fazer?
 * -Criar mecanismo de controles{
 *      Atualizar o sprite após o movimento
 * }
 * -criar o personagem
 * @author Abe
 */
public class JogoNiver 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frameGame gameFrame = new frameGame();
        gameFrame.start();
    }
}
