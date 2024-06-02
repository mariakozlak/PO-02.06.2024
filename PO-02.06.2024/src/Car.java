public class Car extends Vehicle {
    double milesDriven;
    double fluelConsumed;

    public Car(String make, String model, String brand, int year, double milesDriven, double fluelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fluelConsumed = fluelConsumed;
    }
    public double getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    public double getFluelConsumed() {
        return fluelConsumed;
    }

    public void setFluelConsumed(double fluelConsumed) {
        this.fluelConsumed = fluelConsumed;
    }

    @Override
    public double calculateFuelEfficiency() {
       double car_eff= (milesDriven / fluelConsumed);
       return car_eff;
    }


}
