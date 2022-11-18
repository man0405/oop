package Week6Lab;

public class Currency {
    private String name;
    private double currentDollarRate;

    public Currency(String name, double currentDollarRate) {
        this.name = name;
        this.currentDollarRate = currentDollarRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentDollarRate() {
        return currentDollarRate;
    }

    public void setCurrentDollarRate(double currentDollarRate) {
        this.currentDollarRate = currentDollarRate;
    }

    @Override
    public String toString() {
        return "Currency [name=" + name + ", currentDollarRate=" + currentDollarRate + "]";
    }

}
