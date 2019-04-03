package shop;

import java.util.HashMap;

enum State {
    pending,
    submitted
}

public class Order {
    private int id;
    private Customer applicant;
    private State state;
    private HashMap<Good, Integer> items;

    public Order(int id, Customer applicant) {
        this.id = id;
        this.applicant = applicant;
    }

    public int getId() {
        return id;
    }

    public State getState() {
        return state;
    }

    public HashMap<Good, Integer> getItems() {
        return items;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void addItem(Good good, int amount) {

    }

    public void removeItem(Good good) {

    }

    public int calculatePrice() {
        int totalPrice = 0;
        for (HashMap.Entry<Good, Integer> entry : items.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
        return totalPrice;
    }

    public void addDiscount(Discount discount) {

    }

}

