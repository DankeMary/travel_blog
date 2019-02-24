package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.CommentarySO;
import ru.vsu.travelapp.bean.CommentaryBean;

import java.util.List;

@Mapper
public interface CommentaryBeanMapper {
    CommentarySO commentaryToSO(CommentaryBean commBean);

    CommentaryBean commentaryToBean(CommentarySO commSO);

    List<CommentarySO> commentaryListToSOList(List<CommentaryBean> commListBean);

    List<CommentaryBean> commentaryListToBeanList(List<CommentarySO> commListSO);
}
