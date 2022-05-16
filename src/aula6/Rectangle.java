package aula6;
//completo

public class Rectangle {
    private final int height;
    private final int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public Rectangle(int height){
        this.height = height;
        width = height;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }

    public double area(){
        return height * width;
    }
    public int perimeter(){
        return 2 * (height + width);
    }
    public double diagonalSize(){
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }
    public boolean isSquare(){
        return width == height;
    }
}
