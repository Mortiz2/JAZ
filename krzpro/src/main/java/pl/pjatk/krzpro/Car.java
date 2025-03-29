package pl.pjatk.krzpro;

public class Car {
    private String model;
    private int vin;

    public Car(String model, int vin) {
        this.model = model;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
}
