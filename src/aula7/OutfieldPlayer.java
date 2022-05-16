package aula7;
public class OutfieldPlayer extends Player{
    private int passesMade, passesReceived;

    OutfieldPlayer(String name, int number, int passesMade, int passesReceived){
        super(name, number);
        this.passesMade = passesMade;
        this.passesReceived = passesReceived;
    }

    public int getPassesMade() {
        return passesMade;
    }

    public void setPassesMade(int passesMade) {
        this.passesMade = passesMade;
    }

    public int getPassesReceived() {
        return passesReceived;
    }

    public void setPassesReceived(int passesReceived) {
        this.passesReceived = passesReceived;
    }

    @Override
    public String toString(){
        return "--Position: Outfield Player\nName: " + super.getName() + "\nNumber: " + super.getNumber()
                + "\nPasses Made: " + passesMade  + "\nPasses Received: " + passesReceived + "\n-";
    }
}
