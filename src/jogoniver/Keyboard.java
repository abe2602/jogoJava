/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoniver;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TreeSet;

/**
 *Usarei uma treeSet para armazenar os comandos do personagem, de acordo com o que está
 * sendo teclado.
 * @author Abe
 */
public class Keyboard implements KeyListener{
    
    TreeSet<Integer> keys= new TreeSet<>();  
    
    @Override
    public void keyTyped(KeyEvent e) {
     keys.add(e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
       keys.remove(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public TreeSet<Integer> getKeys() {
        return keys;
    }

    public void setKeys(TreeSet<Integer> keys) {
        this.keys = keys;
    }
    
}
