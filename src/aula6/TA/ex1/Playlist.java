package aula6.TA.ex1;
//completo

public class Playlist {
    private Music list[] = new Music[15];

    public Playlist(){
    }

    public Music[] getList() {
        return list;
    }

    public void printList(){
        for (int i = 0; i < list.length; i++){
            if (list[i] != null){
                System.out.println(list[i].getTitle());
            }
        }
    }
    public void addMusic(Music music){
        for (int i = 0; i < list.length; i++){
            if (list[i] == null){
                list[i] = music;
                break;
            }
        }
    }
    public void removeMusic(Music music){
        for (int i = 0; i < list.length; i++){
            if (list[i].getTitle() == music.getTitle()){
                list[i] = null;
                break;
            }
        }
    }
    public double totalDuration(){
        double total = 0;
        for (int i = 0; i < list.length; i++){
            if (list[i] != null){
                total += list[i].getDuration();
            }
        }
        return total;
    }
}


