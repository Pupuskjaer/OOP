package task1;

public abstract class Vehicle {
    /*Добавил данный класс родителя. Поменял модификаторы доступа public ► private, чтобы код
     * соответствовал правилу инкапсуляции*/
    private String modelName;
    private int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
    };

    public void checkEngine() {
    };

    public void checkTrailer() {
    };


}
