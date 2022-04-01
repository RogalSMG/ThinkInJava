package exercises.chapter11;

public class Tile {
    private char letter;
    private int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    /* Code to test in main

        Tile tile = new Tile('z',10);
        Tile.printTile(tile);
        System.out.println(tile);
        tile.testTile();
     */

    public static void printTile(Tile tile) {
        System.out.println("Character: " + tile.getLetter());
        System.out.println("Value: " + tile.getValue());
    }

    public void testTile() {
        Tile tile = new Tile('x', 10);
        printTile(tile);
    }

    @Override
    public String toString() {
        return "Tile{" +
                "letter=" + letter +
                ", value=" + value +
                '}';
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public char getLetter() {
        return letter;
    }
}
