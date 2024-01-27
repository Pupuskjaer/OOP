package task1;

public class ServiceStation {
    /*
     * Чтобы код соответствовал правилу полиморфизма, поменял отдельно передаваемые в метод параметры
     * классов-наследников в на один передаваемый объект класса-родителя. Тогда и нет необходимости проверять
     * каждый параметр отдельно, так как у нас один передаваемый параметр от класса-родителя.
     * */
    public void check(Vehicle vehicle) {

        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            vehicle.checkEngine();
            vehicle.checkTrailer();
        }
    }
}