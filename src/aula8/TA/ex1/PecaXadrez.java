package aula8.TA.ex1;
//completo??

public abstract class PecaXadrez {
    private Posicao posicao;
    public abstract Posicao[] movimentosPossiveis();

    @Override
    public String toString() {
        return "PecaXadrez{" + "posicao=" + posicao + '}';
    }
}
