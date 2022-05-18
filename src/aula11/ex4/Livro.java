package aula11.ex4;

import java.util.Comparator;

public class Livro {
    private String nome;
    private int ano;
    private String editora;
    private String autor;

    public Livro(String nome, int ano, String editora, String autor) {
        this.nome = nome;
        this.ano = ano;
        this.editora = editora;
        this.autor = autor;
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{ " +
                "   nome= '" + nome + '\'' +
                "   ano=" + ano +
                "   editora='" + editora + '\'' +
                "   autor='" + autor + '\'' +
                '}';
    }
}
