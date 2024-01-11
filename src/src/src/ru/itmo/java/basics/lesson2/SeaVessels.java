package src.src.ru.itmo.java.basics.lesson2;
public class SeaVessels {
    private String type;
    private String model;
    private Integer displacement;
    private Double engineCapacity;
    private Color color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "SeaVessels{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", displacement=" + displacement +
                ", engineCapacity=" + engineCapacity +
                ", color=" + color +
                '}';
    }

    public SeaVessels(String type, String model) {
        this.type = type;
        this.model = model;
        this.displacement = displacement;
        this.engineCapacity = engineCapacity;
        this.color = color;
    }
}

