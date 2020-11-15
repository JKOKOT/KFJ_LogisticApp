package Auto;

import org.springframework.boot.autoconfigure.amqp.AbstractRabbitListenerContainerFactoryConfigurer;

public class Auto {

    private String brand;
    private String model;
    private int palletsAmount;
    private int tonnage;
    private double priceForKm;
    private int dimensionM3;

    public Auto (String brand, String model, int palletsAmount, int tonnage, double priceForKm, int dimensionM3 ) {

        this.brand = brand;
        this.model = model;
        this.palletsAmount = palletsAmount;
        this.tonnage = tonnage;
        this.priceForKm = priceForKm;
        this.dimensionM3 = dimensionM3;

    }

    public Auto (String model, int palletsAmount, int tonnage) {
        this (null);


    }

    public Auto(String brand) {

    }

    public String getBrand (){
        return brand;
    }

    public String getModel () {
        return model;
    }

    public int getPalletsAmount() {
        return palletsAmount;
    }

    public int getTonnage (){
        return tonnage;
    }
    public double getPriceForKm (){
        return getPriceForKm();
    }
    public int getDimensionM3 () {
        return dimensionM3;
    }

    @Override
    public String toString() {
        String brandString = brand != null ? brand + " , " : "";
        String modelString = model != null ? " [ " + model + "]" : "";
        return String.format(brandString, palletsAmount, tonnage, modelString );
    }

}






    /*INSERT INTO Autos (Brand, Model, PalletsAmount, Tonnage, PriceForKM, DimensionsM3) VALUES('Saab', 'Bluewhite', '35', '15', '6,72', '98')*/