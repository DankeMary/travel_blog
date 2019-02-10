package ru.vsu.service.serviceobject;

import java.util.Objects;

public class PlaceSO {
    private Integer placeId;
    private String placeName;
    private String latitude;
    private String longitude;

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
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
        PlaceSO placeSO = (PlaceSO) o;
        return Objects.equals(placeId, placeSO.placeId) &&
                Objects.equals(placeName, placeSO.placeName) &&
                Objects.equals(latitude, placeSO.latitude) &&
                Objects.equals(longitude, placeSO.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeId, placeName, latitude, longitude);
    }
}
