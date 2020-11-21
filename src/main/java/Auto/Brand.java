package Auto;

public class Brand {

    private String model;
    private int palletsAmount;

    public Brand(String model, int palletsAmount) {
        this.model = model;
        this.palletsAmount = palletsAmount;

    }

    public String getModel(){
        return model;
    }

    public int getPalletsAmount() {
        return palletsAmount;
    }

    @Override
    public String toString() {
        return String.format(model, palletsAmount);
    }
}
