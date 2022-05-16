package aula8.TA.ex1;
//completo??

import java.util.Arrays;

public class Cavalo extends PecaXadrez{
    private Posicao posicao = new Posicao(1, 2);
    private Posicao[] movimentosPossiveis;

    public Cavalo(Posicao posicao, Posicao[] movimentosPossiveis){
        this.posicao = posicao;
        this.movimentosPossiveis = movimentosPossiveis;
    }

    @Override
    public String toString() {
        return "A peca CAVALO encontra-se na posicao " + posicao +
                ", e pode movimentar-se para " + Arrays.toString(movimentosPossiveis);
    }
    public void toString2() {
        System.out.println("A peca CAVALO encontra-se na posicao " + posicao +
                ", e pode movimentar-se para ");
        for (int i = 0; i < movimentosPossiveis.length; i++){
            System.out.println(movimentosPossiveis[i]);
        }
    }

    @Override
    public Posicao[] movimentosPossiveis() {
        return movimentosPossiveis;
    }
}
