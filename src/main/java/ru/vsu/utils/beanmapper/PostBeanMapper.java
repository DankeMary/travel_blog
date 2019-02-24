package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.PostSO;
import ru.vsu.travelapp.bean.PostBean;

import java.util.List;

@Mapper
public interface PostBeanMapper {
    PostSO postToSO(PostBean postBean);

    PostBean postToBean(PostSO postSO);

    List<PostSO> postListToSOList(List<PostBean> postListBean);

    List<PostBean> postListToBeanList(List<PostSO> postListSO);
}
