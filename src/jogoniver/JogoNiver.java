/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoniver;

import gui.frameGame;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * 
 *O que fazer?
 * Cenário{
 *  Matrix , onde temos as posições válidas e inválidas
 *  com essa matrix, colocaremos os sprites do cenário
 * }
 * 
 * colisões{
 *  colisões com moedas, aranhas e paredes
 * }
 * @author Abe
 */
public class JogoNiver 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        frameGame gameFrame = new frameGame();
        gameFrame.start();    

    }
}
