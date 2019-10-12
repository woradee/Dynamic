package models;


public class Product {
    private String id;
    private String name;
    private double price,amount,total;

    private double discount,totalprice;

    public Product() {
    }

    public Product(String id, String name, double price, double amount, double total, double discount, double totalprice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.total = total;
        this.discount = discount;
        this.totalprice = totalprice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotal() {
        total=price*amount;
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDiscount() {
        if (total<5000)
            discount=total*0.05;
        else if (total>5001 && total<20000)
            discount=total*0.1;
        else
            discount=total*0.25;
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalprice() {
        totalprice=total-discount;
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }
}
