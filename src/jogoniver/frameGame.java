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
 * @author Abe
 */
public class frameGame extends JFrame
{
    public frameGame()
    {
        panelFrame panel = new panelFrame();
        
        this.setVisible(true);
        this.setSize(400, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(panel);
    }
}
