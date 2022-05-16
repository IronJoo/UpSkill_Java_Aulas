package aula8.TA.ex1;
//completo??

public class Main {
    public static void main(String[] args) {
        //PEAO
        //definir posicao inicial do peao
        Posicao peao_posicao = new Posicao(1,2);

        //definir movimentos possiveis do peao
        Posicao peao_lista_movimentos[] = new Posicao[1]; //criar lista que guarda movimentos
        Posicao peao_movimento1 = new Posicao(peao_posicao.getX(), peao_posicao.getY() + 1); //definir movimento possivel
        peao_lista_movimentos[0] = peao_movimento1; //adicionar movimento à lista

        //atribuir dados a peao
        Peao peao1 = new Peao(peao_posicao, peao_lista_movimentos);

        //testar
        System.out.println("ToString = " + peao1.toString());

        //CAVALO
        //definir posicao inicial do cavalo
        Posicao cavalo_posicao = new Posicao(2,1);

        //definir movimentos possiveis do cavalo
        Posicao cavalo_lista_movimentos[] = new Posicao[8]; //criar lista que guarda movimentos
        Posicao cavalo_movimento1 = new Posicao(cavalo_posicao.getX() + 1, cavalo_posicao.getY() + 2); //definir movimento possivel
        Posicao cavalo_movimento2 = new Posicao(cavalo_posicao.getX() + 1, cavalo_posicao.getY() - 2);
        Posicao cavalo_movimento3 = new Posicao(cavalo_posicao.getX() - 1, cavalo_posicao.getY() + 2);
        Posicao cavalo_movimento4 = new Posicao(cavalo_posicao.getX() - 1, cavalo_posicao.getY() - 2);
        Posicao cavalo_movimento5 = new Posicao(cavalo_posicao.getX() + 2, cavalo_posicao.getY() + 1);
        Posicao cavalo_movimento6 = new Posicao(cavalo_posicao.getX() + 2, cavalo_posicao.getY() - 1);
        Posicao cavalo_movimento7 = new Posicao(cavalo_posicao.getX() - 2, cavalo_posicao.getY() + 1);
        Posicao cavalo_movimento8 = new Posicao(cavalo_posicao.getX() - 2, cavalo_posicao.getY() - 1);
        cavalo_lista_movimentos[0] = cavalo_movimento1; //adicionar movimento à lista
        cavalo_lista_movimentos[1] = cavalo_movimento2;
        cavalo_lista_movimentos[2] = cavalo_movimento3;
        cavalo_lista_movimentos[3] = cavalo_movimento4;
        cavalo_lista_movimentos[4] = cavalo_movimento5;
        cavalo_lista_movimentos[5] = cavalo_movimento6;
        cavalo_lista_movimentos[6] = cavalo_movimento7;
        cavalo_lista_movimentos[7] = cavalo_movimento8;

        //atribuir dados a cavalo
        Cavalo cavalo1 = new Cavalo(cavalo_posicao, cavalo_lista_movimentos);

        //testar
        //System.out.println("ToString = " + cavalo1.toString());
        cavalo1.toString2();

    }
}
