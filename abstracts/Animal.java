package abstracts;

public abstract class Animal {
    private int weight;
    private int length;
    private int height;

    public void giveAVoice() {
    System.out.println("Голос!");
    }
    public void run() {
        System.out.println("Я побежал!");
        jump();
        }

  protected void jump(){
        System.out.println("Прыгаю!");
    }
    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void  getSomeFood();
}