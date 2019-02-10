package ru.vsu.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "country", schema = "blog_db")
public class CountryEntity {
    private Integer countryId;
    private String namee;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
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

        CountryEntity that = (CountryEntity) o;

        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;
        if (namee != null ? !namee.equals(that.namee) : that.namee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryId != null ? countryId.hashCode() : 0;
        result = 31 * result + (namee != null ? namee.hashCode() : 0);
        return result;
    }
}
