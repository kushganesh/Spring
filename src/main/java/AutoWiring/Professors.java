package AutoWiring;

public class Professors {
    private String name;

    @Override
    public String toString() {
        return "Professors{" +
                "name='" + name + '\'' +
                ", exp='" + exp + '\'' +
                ", sal='" + sal + '\'' +
                '}';
    }

    private String exp;
    private String sal;

    public void setName(String name) {
        this.name = name;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }
}
