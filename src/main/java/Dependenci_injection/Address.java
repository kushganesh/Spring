package Dependenci_injection;

public class Address {
    private String state;
    private String district;
    private String block;
    private String village;

    public Address(){
        
    }
    public Address(String state, String district, String block, String village) {
        this.state = state;
        this.district = district;
        this.block = block;
        this.village = village;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", block='" + block + '\'' +
                ", village='" + village + '\'' +
                '}';
    }
}
