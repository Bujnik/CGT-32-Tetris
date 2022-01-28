package main;

public class Tetris {
    public static Tetris game;
    private Field field;
    private GamePiece gamePiece;

    public Field getField() {
        return field;
    }

    public GamePiece getGamePiece() {
        return gamePiece;
    }

    public static void main(String[] args) {
        game = new Tetris();
        game.run();

    }

    void run(){}

    void step(){}
}
