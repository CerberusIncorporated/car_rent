package by.yukhnevich.carsharing.entity.car;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "cars")
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    private String color;
    private int seats;
    @Column(name = "gearbox")
    @Enumerated(EnumType.STRING)
    private GearboxType gearbox;
    @Column(name = "manufactured_year")
    private String manufacturedYear;
    @Column(name = "engine_type")
    @Enumerated(EnumType.STRING)
    private EngineType engineType;
    @Column(name = "price")
    private BigDecimal pricePerDay;
    private String vin;
    private String plate;
    @Column(name = "class")
    @Enumerated(EnumType.STRING)
    private CarClass carClass;
    public Car(Long id, String brand, String model, String color, int seats, GearboxType gearbox, String manufacturedYear, EngineType engineType, BigDecimal pricePerDay, String vin, String plate, CarClass carClass) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.seats = seats;
        this.gearbox = gearbox;
        this.manufacturedYear = manufacturedYear;
        this.engineType = engineType;
        this.pricePerDay = pricePerDay;
        this.vin = vin;
        this.plate = plate;
        this.carClass = carClass;
    }

    public Car(Long id) {
        this.id = id;
    }

    public Car(String brand, String model, String color, int seats, GearboxType gearbox, String manufacturedYear, EngineType engineType, BigDecimal pricePerDay, String vin, String plate, CarClass carClass) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.seats = seats;
        this.gearbox = gearbox;
        this.manufacturedYear = manufacturedYear;
        this.engineType = engineType;
        this.pricePerDay = pricePerDay;
        this.vin = vin;
        this.plate = plate;
        this.carClass = carClass;
    }

    public Car() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public GearboxType getGearbox() {
        return gearbox;
    }

    public void setGearbox(GearboxType gearbox) {
        this.gearbox = gearbox;
    }

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && seats == car.seats && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && gearbox == car.gearbox && Objects.equals(manufacturedYear, car.manufacturedYear) && engineType == car.engineType && Objects.equals(vin, car.vin) && Objects.equals(plate, car.plate) && carClass == car.carClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, seats, gearbox, manufacturedYear, engineType, vin, plate, carClass);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id=").append(id);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", color=").append(color);
        sb.append(", seats=").append(seats);
        sb.append(", gearbox=").append(gearbox);
        sb.append(", manufacturedYear='").append(manufacturedYear).append('\'');
        sb.append(", engineType=").append(engineType);
        sb.append(", pricePerDay=").append(pricePerDay);
        sb.append(", vin='").append(vin).append('\'');
        sb.append(", plate='").append(plate).append('\'');
        sb.append(", carClass=").append(carClass);
        sb.append('}');
        return sb.toString();
    }
}
