package models;

/**
 * Created by Woradee Jongphaet on 23-Jul-19.
 */
public class Costume {
    private String brand,producer,type,color;
    private int price;

    //Constructor method ฟังก์ชันที่จะทำงานเมื่อนำคลาสนี้ไปใข้งาน

    public Costume() {}

    public Costume(String brand, String producer, String type, String color ,int price) {
        this.brand = brand;
        this.producer = producer;
        this.type = type;
        this.color = color;
        this.price = price ;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

