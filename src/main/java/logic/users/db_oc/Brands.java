package logic.users.db_oc;

import lombok.Data;

@Data
public class Brands {
    private int BrandsID;
    private String Brand;
    private int CountryKey;

    public Brands() {
    }

    public Brands(int brandsID, String brand, int countryKey) {
        BrandsID = brandsID;
        Brand = brand;
        CountryKey = countryKey;
    }

    public int getBrandsID() {
        return BrandsID;
    }

    public void setBrandsID(int brandsID) {
        BrandsID = brandsID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getCountryKey() {
        return CountryKey;
    }

    public void setCountryKey(int countryKey) {
        CountryKey = countryKey;
    }
}
