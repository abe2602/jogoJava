/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoniver;

/**
 *
 * @author Abe
 */
public class Colisoes 
{   
    public void confere(int[][] fase, Personagem p)
    {
        int px = 0, py = 0;
        
        px = p.getPosiAtualX();
        py = p.getPosiAtualY();
        
        
        if(fase[px][py] == -1 ){
            System.out.println("Sucesso");
       }else{
            System.out.println("Bad");
            p.setPosiAtualX(p.getPosiAtualX() + 20);
        }
    }
}
