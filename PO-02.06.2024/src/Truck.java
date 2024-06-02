public class Truck extends Vehicle{

    double milesDriven, fuelConsumed, cargoWeight;

    public Truck(String make, String model, String brand, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, brand, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }

    public void setFuelConsumed(double fuelConsumed) {
        this.fuelConsumed = fuelConsumed;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateFuelEfficiency(){
        double truck_eff = ((milesDriven)/((fuelConsumed) + (cargoWeight*0.5)));
        return truck_eff;
    }
}
