package ru.vsu.service.serviceobject;

import java.util.Objects;

public class CountrySO {
    private Integer countryId;
    private String namee;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
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
        CountrySO countrySO = (CountrySO) o;
        return Objects.equals(countryId, countrySO.countryId) &&
                Objects.equals(namee, countrySO.namee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, namee);
    }
}
