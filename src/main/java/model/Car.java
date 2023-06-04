package model;

public class Car {
    private String colour;
    private String model;
    private String bodyType;

    public Car(String colour, String model, String bodyType) {
        this.colour = colour;
        this.model = model;
        this.bodyType = bodyType;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}
