package aula7;

public class ex3 {
    public static void main(String[] args) {
        OutfieldPlayer joana = new OutfieldPlayer("Joana Ferro", 7, 25, 28);
        Keeper jose = new Keeper("Jose Leitao", 1, 8);

        joana.setGoals(2);
        jose.setGoals(2);
        jose.setGoalsSuffered(3);
        joana.setPassesMade(4);
        joana.setPassesReceived(5);

        System.out.println(joana.toString());
        System.out.println(jose.toString());
    }
}
