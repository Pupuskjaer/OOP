package task1;

public class Bicycle extends Vehicle {
    /*
     *Добавил наследования от класса Vehicle данному классу. Удалил поля, принадлежащие абстрактному
     *классу-родителю.
     * */
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


}