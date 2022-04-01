package tema_factory_pattern;

public class FactoryMethod {
    public Car createCar(String carType){
        if(carType == null || carType.isEmpty())
            return null;
        switch (carType){
            case "Diesel":
                return new DieselCar();
            case "Electric":
                return new ElectricCar();
            case "Benzine":
                return new BenzineCar();
            default:
                throw new IllegalArgumentException("Unknown car " + carType);
        }
    }

}
