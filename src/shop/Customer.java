package shop;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int id;
    private int balance;
    private ArrayList<Order> orders;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;

        orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order[] getTotalOrders() {
        return orders.toArray(new Order[0]);
    }

    private Order[] getOrdersByState(State state) {
        ArrayList<Order> temp = new ArrayList<>();
        for (Order order : orders)
            if (order.getState() == state)
                temp.add(order);
        return temp.toArray(new Order[0]);
    }

    public Order[] getPendingOrders() {
        return getOrdersByState(State.pending);
    }

    public Order[] getSubmittedOrders() {
        return getOrdersByState(State.submitted);
    }

    public void addDiscount(Discount d, Order o){

    }
}
