package aula9.TA.ex1;

public class Main {
    public static void main(String[] args) {
        Autocarro autocarro1 = new Autocarro();
        Automovel automovel1 = new Automovel();
        Aviao aviao1 = new Aviao();
        Barco barco1 = new Barco();
        F16 f16_1 = new F16();
        Ferry ferry1 = new Ferry();
        Mota mota1 = new Mota();

        Pessoa joana = new Pessoa("Joana");
        Pessoa ananas = new Pessoa("Ananas");
        Pessoa spencer = new Pessoa("Spencer");
        autocarro1.adicionarPassageiro(joana);
        autocarro1.adicionarPassageiro(ananas);
        autocarro1.adicionarPassageiro(spencer);
        System.out.println("Consumo do autocarro = " + autocarro1.getConsumo());
        autocarro1.listarPassageiros();
        //testar consumo do autocarro com lotacao +50%
        Pessoa[] lista = new Pessoa[26];
        for (int i = 0; i < 26; i++){
            lista[i] = joana;
        }
        //erros detetados a partir daqui
        System.out.println("Consumo autocarro com lotacao <50%: " + autocarro1.getConsumo());
        autocarro1.setLugares(lista);
        System.out.println("26 passageiros adicionados.\nConsumo autocarro com lotacao >50%: " + autocarro1.getConsumo());
    }
}
