package ru.vsu.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "place", schema = "blog_db")
public class PlaceEntity {
    private Integer placeId;
    private String placeName;
    private String latitude;
    private String longitude;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    
    @Column(name = "place_name")
    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    
    @Column(name = "latitude")
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    
    @Column(name = "longitude")
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

        PlaceEntity that = (PlaceEntity) o;

        if (placeId != null ? !placeId.equals(that.placeId) : that.placeId != null) return false;
        if (placeName != null ? !placeName.equals(that.placeName) : that.placeName != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = placeId != null ? placeId.hashCode() : 0;
        result = 31 * result + (placeName != null ? placeName.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        return result;
    }
}
