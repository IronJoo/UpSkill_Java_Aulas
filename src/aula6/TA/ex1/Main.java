package aula6.TA.ex1;
//completo

public class Main {
    public static void main(String[] args) {
        Music music1 = new Music("Wuthering Heights",4.3);
        Music music2 = new Music("Gimme Shelter",5.4);
        Music music3 = new Music("Put Your Head On My Shoulder",2.3);
        Music music4 = new Music("As",7.1);

        Playlist playlist1 = new Playlist();

        playlist1.addMusic(music1);
        playlist1.addMusic(music2);
        playlist1.addMusic(music3);
        playlist1.addMusic(music4);

        System.out.println("-Printing playlist-");
        playlist1.printList();
        System.out.println("-Printing playlist-");
        playlist1.removeMusic(music2);
        playlist1.printList();
        System.out.println("-Total duration of playlist: " + playlist1.totalDuration() + " mins.");

//        for (int i = 0; i < playlist1.getList().length; i++){
//            System.out.println(playlist1.getList()[i]);
//        }
    }
}
