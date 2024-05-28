package AutoWiring_Xml;

public class Engine {
    private String enName;


    public Engine() {
        super();
    }

    public Engine(String enName, String capacity) {
        this.enName = enName;
        this.capacity = capacity;
    }

    private String capacity;

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enName='" + enName + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
