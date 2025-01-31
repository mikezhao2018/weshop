package tech.wetech.weshop.marketing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.wetech.weshop.common.service.BaseService;
import tech.wetech.weshop.marketing.mapper.CommentMapper;
import tech.wetech.weshop.marketing.po.Comment;
import tech.wetech.weshop.marketing.query.CommentQuery;
import tech.wetech.weshop.marketing.service.CommentService;

import java.util.List;

/**
 * @author cjbi@outlook.com
 */
@Service
public class CommentServiceImpl extends BaseService<Comment> implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> queryIfRequirePictureList(CommentQuery commentQuery) {
        int limit = commentQuery.getPageSize();
        int offset = (commentQuery.getPageNum() - 1) * limit;
        return commentMapper.selectIfRequirePictureList(commentQuery, offset, limit);
    }

    @Override
    public Integer countIfRequirePictureList(CommentQuery commentQuery) {
        return commentMapper.countIfRequirePictureList(commentQuery);
    }
}
