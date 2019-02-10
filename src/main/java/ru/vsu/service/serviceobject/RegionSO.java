package ru.vsu.service.serviceobject;

import ru.vsu.database.entity.CountryEntity;

import java.util.Objects;

public class RegionSO {
    private Integer regionId;
    private CountryEntity country;
    private String namee;

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegionSO regionSO = (RegionSO) o;
        return Objects.equals(regionId, regionSO.regionId) &&
                Objects.equals(country, regionSO.country) &&
                Objects.equals(namee, regionSO.namee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, country, namee);
    }
}
