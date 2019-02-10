package ru.vsu.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "region", schema = "blog_db")
public class RegionEntity {
    private Integer regionId;
    private CountryEntity country;
    private String namee;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    @ManyToOne
    @JoinColumn(name = "country_id")
    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    
    @Column(name = "name")
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

        RegionEntity that = (RegionEntity) o;

        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (namee != null ? !namee.equals(that.namee) : that.namee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regionId != null ? regionId.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (namee != null ? namee.hashCode() : 0);
        return result;
    }
}
