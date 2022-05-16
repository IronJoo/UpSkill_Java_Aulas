package aula8.TA.ex1;
//completo??

import java.util.Arrays;

public class Peao extends PecaXadrez{
    private Posicao posicao = new Posicao(1, 2);
    private Posicao[] movimentosPossiveis;

    public Peao(Posicao posicao, Posicao[] movimentosPossiveis){
        this.posicao = posicao;
        this.movimentosPossiveis = movimentosPossiveis;
    }

    @Override
    public String toString() {
        return "A peca PEAO encontra-se na posicao " + posicao +
                ", e pode movimentar-se para " + Arrays.toString(movimentosPossiveis);
    }

    @Override
    public Posicao[] movimentosPossiveis() {
        return movimentosPossiveis;
    }
}
