package aula11.ex3;

public class Filme implements Comparable<Filme>{
    private int pontuacao;
    private String nome;
    private int ano;

    public Filme(String nome, int pontuacao, int ano) {
        this.pontuacao = pontuacao;
        this.nome = nome;
        this.ano = ano;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    @Override // ordena descrescente por
    public int compareTo(Filme filme) {
        if (pontuacao == filme.getPontuacao()){
            return 0;
        }else if(pontuacao < filme.getPontuacao()){
            return 1;
        }else{
            return -1;
        }
    }

    //@Override
//    public int compareTo(Filme filme){
//        if (ano == filme.getAno()) {
//            return 0;
//        }
//        else if(ano>filme.getAno()){
//            return 1;
//        }else{
//            return -1;
//        }
//    }


    @Override
    public String toString() {
        return "Filme{ " +
                "pontuacao=" + pontuacao +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                '}';
    }
}
