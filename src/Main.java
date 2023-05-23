public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.engine.showEngineInfo();
        car.engine.setDurability(20);
        car.engine.showEngineInfo();
        car.startMove(2000);
        car.engine.showEngineInfo();
        Service service = new Service();
        service.repairEngine(car);
        car.engine.showEngineInfo();
    }
}
