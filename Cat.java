public class Cat extends Animal {
    public Cat() {
        this.setHeight(10);
        this.setLength(10);
        this.setWeight(10);
    }
    @Override
    public void  getSomeFood() {
        System.out.println("Пойду охотится");
    }
    @Override
    public void giveAVoice() {
        System.out.println("Мяу!");
    }
}
