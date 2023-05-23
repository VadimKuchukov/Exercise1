public class Engine {
    private int durability;

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public void showEngineInfo() {
        System.out.println("Состояние износа двигателя: " + durability);
    }

}
