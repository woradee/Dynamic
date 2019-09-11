package models;

/**
 * Created by Woradee Jongphaet on 24-Jul-19.
 */
public class Suit extends Costume{
    private String pattern,texture,treatment;
    private String productId;

    public Suit(){

    }

    public Suit(String productId,String brand, String producer, String type, String color, String pattern, String texture, int price, String treatment) {
        super(brand, producer, type, color, price);
        this.pattern = pattern;
        this.texture = texture;
        this.treatment = treatment;
        this.productId = productId;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }





}
