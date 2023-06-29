package Lession6_Seminar;
import java.time.LocalDate;

public class Laptop {
    private String brand, name, model, color, diskType, cpuBrand, gpuBrand, condition;
    private int id, year, ram, capacity;
    private double screenSize, price;
    private static double basePrice;
    private boolean status;

    public Laptop(String brand, String name, String model, String color,
                  String diskType, String cpuBrand, String gpuBrand,
                  int id, int year, int ram, int capacity, double screenSize) {
        this.brand = brand;
        this.name = name;
        this.model = model;
        this.color = color;
        this.diskType = diskType;
        this.cpuBrand = cpuBrand;
        this.gpuBrand = gpuBrand;
        this.id = id;
        this.year = year;
        this.ram = ram;
        this.capacity = capacity;
        this.screenSize = screenSize;
        this.status = false;
        setPrice();
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getDiskType() {
        return diskType;
    }

    public String getCpuBrand() {
        return cpuBrand;
    }

    public String getGpuBrand() {
        return gpuBrand;
    }

    public String getCondition() {
        return condition;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getRam() {
        return ram;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double getPrice() {
        return price;
    }

    public boolean getStatus() {
        return status;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }

    public void setGpuBrand(String gpuBrand) {
        this.gpuBrand = gpuBrand;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public static void setBasePrice(double basePrice) {
        Laptop.basePrice = basePrice;
    }

    private void setPrice() {
        int current_year = LocalDate.now().getYear();

        price = year == current_year ? price
                : year == current_year - 1 ? price * 0.85
                : year == current_year - 2 ? price * 0.75
                : price * 0.7;
    }



    public void about() {
        System.out.printf("""
                        _____________________________
                        id: %d
                        Бренд: %s
                        Наименование: %s
                        Модель: %s
                        Цвет: %s
                        Тип Носителя: %s
                        Бренд CPU: %s
                        gpu brand: %s
                        Год изготовления: %d
                        RAM: %dGB
                        Объём памяти: %dGB
                        Размер экрана: %.1f"
                        Стоимость: $%.2f
                        
                        _____________________________
                        """, id, brand, name, model, color,
                diskType, cpuBrand, gpuBrand, year,
                ram, capacity, screenSize, price, status ? "Включён" : "Выключен");
    }
}
