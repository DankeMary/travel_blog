package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.CountrySO;
import ru.vsu.travelapp.bean.CountryBean;

import java.util.List;

@Mapper
public interface CountryBeanMapper {
    CountrySO countryToSO(CountryBean countryBean);

    CountryBean countryToBean(CountrySO countrySO);

    List<CountrySO> countryListToSOList(List<CountryBean> countryListBean);

    List<CountryBean> countryListToBeanList(List<CountrySO> countryListSO);
}
