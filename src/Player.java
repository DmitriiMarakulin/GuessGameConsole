public class Player {
    private int number = 0;
      boolean isRight = false;
      static int id = 1;
      int serial = id;
    public void guess() {
        setNumber((int)(Math.random() * 10));

    }

    public Player () {
        id++;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean getIsRight () {
        return isRight;
    }

    public void setIsRight(boolean isRight) {
        this.isRight = isRight;
    }
}