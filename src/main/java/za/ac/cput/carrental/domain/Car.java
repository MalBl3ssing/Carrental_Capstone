package za.ac.cput.carrental.domain;

/* Car.java
     Car Class
     Author: Malwandla Blessing Mahori (230962963)
     Date: 21 June 2026 */

import jakarta.persistence.*;


@Entity
@Table(name = "cars")
public class Car {

    @Id
    @Column(name = "car_id")
    private String carId;
    private String make;
    private String model;
    private int year;
    private double dailyRate;
    private String status;
    private int mileage;


    protected Car() {
    }

    private Car(String carId, String make, String model, int year,
                double dailyRate, String status, int mileage){
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
        this.status = status;
        this.mileage = mileage;
    }

    // ---------- Getters ----------

    public String getCarId() {
        return carId;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public String getStatus() {
        return status;
    }

    public int getMileage() {
        return mileage;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public void markForMaintenance() {
        this.status = "UNDER_MAINTENANCE";
    }

    public void updateMileage(int mileage) {
        this.mileage = mileage;
    }

    public static class Builder {
        private String carId;
        private String make;
        private String model;
        private int year;
        private double dailyRate;
        private String status;
        private int mileage;

        public Builder carId(String carId) {
            this.carId = carId;
            return this;
        }

        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder dailyRate(double dailyRate) {
            this.dailyRate = dailyRate;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder mileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Car build() {
            return new Car(carId, make, model, year, dailyRate, status, mileage);
        }
    }
}
