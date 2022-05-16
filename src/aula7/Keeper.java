package aula7;
public class Keeper extends Player {
    private int goalsSuffered;

    Keeper(String name, int number, int goalsSuffered){
        super(name, number);
        this.goalsSuffered = goalsSuffered;
    }

    public int getGoalsSuffered() {
        return goalsSuffered;
    }

    public void setGoalsSuffered(int goalsSuffered) {
        this.goalsSuffered = goalsSuffered;
    }

    @Override
    public String toString(){
        return "--Position: Goalkeeper\nName: " + super.getName() + "\nNumber: " + super.getNumber() + "\nGoals Suffered: " + goalsSuffered + "\n-";
    }
}
