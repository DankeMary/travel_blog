package ru.vsu.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vsu.database.dao.PostDao;
import ru.vsu.database.entity.PostEntity;
import ru.vsu.travelapp.bean.PostBean;
import ru.vsu.travelapp.bean.PostPieceBean;
import ru.vsu.utils.beanmapper.PostBeanMapper;
import ru.vsu.utils.beanmapper.PostBeanMapperImpl;
import ru.vsu.utils.entitymapper.PostEntityMapper;
import ru.vsu.utils.entitymapper.PostEntityMapperImpl;

import java.util.ArrayList;
import java.util.List;

@Service("postService")
@Transactional
public class PostService {
    private PostDao postDao;
    private PostEntityMapper entityMapper = new PostEntityMapperImpl();
    private PostBeanMapper beanMapper = new PostBeanMapperImpl();

    private PostPieceService postPieceService;

    public List<PostBean> getPostsForPage(int page, int maxResult) {
        List<PostBean> posts = postEntityListToBeanList(postDao.getAllNewest(page, maxResult));
        for (PostBean post : posts) {
            post.setPostPieces((ArrayList<PostPieceBean>) postPieceService.findPiecesByPostId(post.getPostId()));
        }
        return posts;
    }

    public int countPagesPosts(int maxResult) {
        return postDao.countAllNewestPages(maxResult);
    }

    public PostBean postEntityToBean(PostEntity post) {
        return beanMapper.postToBean(entityMapper.postToSO(post));
    }

    public PostEntity postBeanToEntity(PostBean post) {
        return entityMapper.postToEntity(beanMapper.postToSO(post));
    }

    public List<PostBean> postEntityListToBeanList(List<PostEntity> posts) {
        return beanMapper.postListToBeanList(entityMapper.postListToSOList(posts));
    }
    
    @Autowired
    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }
    @Autowired
    public void setPostPieceService(PostPieceService postPieceService) {
        this.postPieceService = postPieceService;
    }
}
