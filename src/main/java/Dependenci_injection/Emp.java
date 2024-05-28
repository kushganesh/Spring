package Dependenci_injection;

public class Emp {
    private String name;
    private String empId;
    private String salary;
    private Address address;

    public Emp() {

    }

    public Emp(String name, String empId, String salary, Address address) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", empId='" + empId + '\'' +
                ", salary='" + salary + '\'' +
                ", address=" + address.toString() +
                '}';
    }
}
