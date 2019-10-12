package models;

/**
 * Created by Woradee Jongphaet on 21-Aug-19.
 */
public class Csu extends Suit {
        private String id,brand,producer,typesuit,color,pattern,texture,treatment;
        private double price;

    public Csu(String id, String brand, String producer, String typesuit, String color, String pattern, String texture, double price, String treatment) {
    }

    public Csu() {
        this.id = id;
        this.brand = brand;
        this.producer = producer;
        this.typesuit = typesuit;
        this.color = color;
        this.pattern = pattern;
        this.texture = texture;
        this.treatment = treatment;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getProducer() {
        return producer;
    }

    @Override
    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getTypesuit() {
        return typesuit;
    }

    public void setTypesuit(String typesuit) {
        this.typesuit = typesuit;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getPattern() {
        return pattern;
    }

    @Override
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String getTexture() {
        return texture;
    }

    @Override
    public void setTexture(String texture) {
        this.texture = texture;
    }

    @Override
    public String getTreatment() {
        return treatment;
    }

    @Override
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
