package TryingMoreTimes;

public class Car extends Mashine {
    private int vin;
    private int power;
    private String owner;
    private String country;

    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public Car(int vin, int power, String owner, String country) {
        this.vin=vin;
        this.power = power;
        this.owner = owner;
        this.country = country;
    }
    public Car(){

    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", power=" + power +
                ", owner='" + owner + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
