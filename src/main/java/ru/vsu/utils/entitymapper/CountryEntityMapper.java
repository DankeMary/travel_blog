package ru.vsu.utils.entitymapper;

import org.mapstruct.Mapper;
import ru.vsu.database.entity.CountryEntity;
import ru.vsu.service.serviceobject.CountrySO;

import java.util.List;

@Mapper
public interface CountryEntityMapper {
    CountrySO countryToSO(CountryEntity countryEntity);

    CountryEntity countryToEntity(CountrySO countrySO);

    List<CountrySO> countryListToSOList(List<CountryEntity> countryListEntity);

    List<CountryEntity> countryListToEntityList(List<CountrySO> countryListSO);
}
