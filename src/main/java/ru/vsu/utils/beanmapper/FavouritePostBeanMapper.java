package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.FavouritePostSO;
import ru.vsu.travelapp.bean.FavouritePostBean;

import java.util.List;

@Mapper
public interface FavouritePostBeanMapper {
    FavouritePostSO favouritePostToSO(FavouritePostBean favPostBean);

    FavouritePostBean favouritePostToBean(FavouritePostSO favPostSO);

    List<FavouritePostSO> favouritePostListToSOList(List<FavouritePostBean> favPostListBean);

    List<FavouritePostBean> favouritePostListToBeanList(List<FavouritePostSO> favPostListSO);
}
