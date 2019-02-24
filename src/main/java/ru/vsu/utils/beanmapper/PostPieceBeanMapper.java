package ru.vsu.utils.beanmapper;

import org.mapstruct.Mapper;
import ru.vsu.service.serviceobject.PostPieceSO;
import ru.vsu.travelapp.bean.PostPieceBean;

import java.util.List;

@Mapper
public interface PostPieceBeanMapper {
    PostPieceSO postPieceToSO(PostPieceBean pPieceBean);

    PostPieceBean postPieceToBean(PostPieceSO pPieceSO);

    List<PostPieceSO> postPieceListToSOList(List<PostPieceBean> pPieceListBean);

    List<PostPieceBean> postPieceListToBeanList(List<PostPieceSO> pPieceListSO);
}
