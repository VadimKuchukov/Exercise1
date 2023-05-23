public class Car {
    String model;
    Engine engine = new Engine();

    public void startMove (int distance) {
        int result = 0;
        if (distance >= 1000) {
            result = engine.getDurability() + distance / 100;
        }
        engine.setDurability(result);
    }

}
