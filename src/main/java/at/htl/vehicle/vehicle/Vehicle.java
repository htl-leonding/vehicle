package at.htl.vehicle.vehicle;

public class Vehicle {

    private Long id;
    private String model;
    private String brand;

    //region constructors
    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public Vehicle() {
    }

    //endregion

    //region getter and setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //endregion


    @Override
    public String toString() {
        return String.format("%s %s", brand, model);
    }

}
