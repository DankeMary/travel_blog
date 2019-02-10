package ru.vsu.service.serviceobject;

import ru.vsu.database.entity.RegionEntity;

import java.util.Objects;

public class CitySO {
    private Integer cityId;
    private RegionEntity region;
    private String namee;
    private String latitude;
    private String longitude;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public RegionEntity getRegion() {
        return region;
    }

    public void setRegion(RegionEntity region) {
        this.region = region;
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CitySO citySO = (CitySO) o;
        return Objects.equals(cityId, citySO.cityId) &&
                Objects.equals(region, citySO.region) &&
                Objects.equals(namee, citySO.namee) &&
                Objects.equals(latitude, citySO.latitude) &&
                Objects.equals(longitude, citySO.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, region, namee, latitude, longitude);
    }
}
