package tema_factory_pattern;

public class Main {
    public static void main(String args[]){
        FactoryMethod factory = new FactoryMethod();
        Car car = factory.createCar("Diesel");
        car.printTypeCar();
    }
}
