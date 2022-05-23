package aula13.ex1;

public class Pessoa {
    private String nome;
    private String age;
    private String morada;

    public Pessoa(String nome, String age, String morada) {
        this.nome = nome;
        this.age = age;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", age='" + age + '\'' +
                ", morada='" + morada + '\'' +
                '}';
    }
}
