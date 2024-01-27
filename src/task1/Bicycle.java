package task1;

public class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    /*
     *Добавил наследования от класса Vehicle данному классу. Удалил поля, принадлежащие абстрактному
     *классу-родителю.
     * */
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}