package task1;

public class MotorVehicle extends Vehicle {
    public MotorVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void sevice() {
        super.sevice();
        this.checkEngine();
    }
}
