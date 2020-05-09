package oop.encapsulation;

public class Pizza {

    public String pizzaName="Papa John Pizza";

    private String PizzaPrice ="25";
    private String pizzaType;
    private String topping;
    private int size;
    private boolean isAvaiable;

    public Pizza() {
    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza(String pizzaName, String pizzaPrice) {
        this.pizzaName = pizzaName;
        PizzaPrice = pizzaPrice;

    }

    public Pizza(String pizzaName, String pizzaPrice, String pizzaType) {
        this.pizzaName = pizzaName;
        PizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;

    }

    public Pizza(String pizzaName, String pizzaPrice, String pizzaType, String topping) {
        this.pizzaName = pizzaName;
        PizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;
        this.topping = topping;
    }

    public Pizza(String pizzaName, String pizzaPrice, String pizzaType, String topping, int size) {
        this.pizzaName = pizzaName;
        PizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;
        this.topping = topping;
        this.size = size;
    }

    public Pizza(String pizzaName, String pizzaPrice, String pizzaType, String topping, int size, boolean isAvaiable) {
        this.pizzaName = pizzaName;
        PizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;
        this.topping = topping;
        this.size = size;
        this.isAvaiable = isAvaiable;
    }

    public String getPizzaPrice() {
        return PizzaPrice;
    }

    public void setPizzaPrice(String pizzaPrice) {
        PizzaPrice = pizzaPrice;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAvaiable() {
        return isAvaiable;
    }

    public void setAvaiable(boolean avaiable) {
        isAvaiable = avaiable;
    }
}
