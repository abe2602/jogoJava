/**
 * Feito por Bruno Bacelar Abe.
 * Todos os direitos reservados.
 */
package jogoniver.base;

import java.awt.Graphics2D;

/**
 *Classe base dos cenários, sendo essa a responsável por
 * obrigar todo cenário do jogo a ter suas classes abstratas.
 * 
 * Todo cenário tem uma altura e uma largura
 * @author Abe
 */
public abstract class Cenario {
    private int altura;
    private int largura;
    
    public Cenario(){}
    
    public Cenario(int altura, int largura)
    {
        this.altura = altura;
        this.largura = largura;
    }
    
    public abstract void carregarCenario();
    
    public abstract void atualizarCenario();
    
    public abstract void descarregarCenario();
    
    public abstract void desenharCenario(Graphics2D g);
}
