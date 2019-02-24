package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.LikedPostSO;
import ru.vsu.travelapp.bean.LikedPostBean;

import java.util.List;

@Mapper
public interface LikedPostBeanMapper {
    LikedPostSO likedPostToSO(LikedPostBean likedPostBean);

    LikedPostBean likedPostToBean(LikedPostSO likedPostSO);

    List<LikedPostSO> likedPostListToSOList(List<LikedPostBean> likedPostListBean);

    List<LikedPostBean> likedPostListToBeanList(List<LikedPostSO> likedPostListSO);
}
