package AutoWiring_Xml;

public class Car {
    private String carName;
    private String carPrice;

    private Engine engine;


    public Car() {
        super();
    }

    public Car(String carName, String carPrice, Engine engine) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carPrice='" + carPrice + '\'' +
                ", engine=" + engine +
                '}';
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }
}
