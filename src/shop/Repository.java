package shop;

import java.util.HashMap;

public class Repository {
    private int id;
    private int capacity;
    private HashMap<Good, Integer> goods;

    public Repository(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFreeCapacity() {
        return capacity - getFilledCapacity();
    }

    public HashMap<Good, Integer> getGoods() {
        return goods;
    }

    private int getFilledCapacity() {
        int filledCapacity = 0;
        for (HashMap.Entry<Good, Integer> entry : goods.entrySet()) {
            filledCapacity += entry.getValue();
        }
        return filledCapacity;
    }

    public void addGood(Good g, int amount) {

    }

    public void removeGood(Good g, int amount) {

    }
}
