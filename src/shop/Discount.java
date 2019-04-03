package shop;

public class Discount {
    private int id;
    private int percent;
    private Order goalOrder;

    public Discount(int id, int percent) {
        this.id = id;
        this.percent = percent;
    }

    public void setGoalOrder(Order goalOrder) {
        this.goalOrder = goalOrder;
    }

    public Order getGoalOrder() {
        return goalOrder;
    }

    public int getPercent() {
        return percent;
    }
}
