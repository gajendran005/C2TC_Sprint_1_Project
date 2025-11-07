package com.tnsif.Mall.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mallName;
    private String location;
    private int totalShops;
    private String managerName;
    private String contactNumber;
    private double parkingArea;        // ✅ New attribute
    private String openingHours;       // ✅ New attribute

    // Constructors
    public Mall() {}

    public Mall(String mallName, String location, int totalShops, String managerName,
                String contactNumber, double parkingArea, String openingHours) {
        this.mallName = mallName;
        this.location = location;
        this.totalShops = totalShops;
        this.managerName = managerName;
        this.contactNumber = contactNumber;
        this.parkingArea = parkingArea;
        this.openingHours = openingHours;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMallName() { return mallName; }
    public void setMallName(String mallName) { this.mallName = mallName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getTotalShops() { return totalShops; }
    public void setTotalShops(int totalShops) { this.totalShops = totalShops; }

    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) { this.managerName = managerName; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public double getParkingArea() { return parkingArea; }
    public void setParkingArea(double parkingArea) { this.parkingArea = parkingArea; }

    public String getOpeningHours() { return openingHours; }
    public void setOpeningHours(String openingHours) { this.openingHours = openingHours; }
}
