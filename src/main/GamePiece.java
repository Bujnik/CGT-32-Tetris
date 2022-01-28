package main;

public class GamePiece {
    private int x;
    private int y;
    private int[][] matrix;

    public GamePiece(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void left(){}

    public void right(){}

    public void down(){}

    public void up(){}

    public void rotate(){}

    //Drops piece to the bottom
    public void downMaximum(){}

    //Checks if game piece can be placed in current position
    public boolean isCurrentPositionAvailable(){
        return true;
    }

    //Called when game piece reaches bottom or lands on another piece
    public void land(){}
}