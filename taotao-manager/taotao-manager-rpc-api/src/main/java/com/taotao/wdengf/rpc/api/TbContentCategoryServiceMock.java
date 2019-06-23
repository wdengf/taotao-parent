package com.taotao.wdengf.rpc.api;

import com.taotao.wdengf.dao.mapper.TbContentCategoryMapper;
import com.taotao.wdengf.dao.model.TbContentCategory;
import com.taotao.wdengf.dao.model.TbContentCategoryExample;
import com.wdengf.taotao.common.base.BaseServiceMock;
import com.wdengf.taotao.common.util.pojo.EasyUITreeNode;
import com.wdengf.taotao.common.util.pojo.TaotaoResult;

import java.util.List;


/**
* 降级实现TbContentCategoryService接口
* Created by wdengf on 2019/6/16.
*/
public class TbContentCategoryServiceMock extends BaseServiceMock<TbContentCategoryMapper, TbContentCategory, TbContentCategoryExample> implements TbContentCategoryService {

    @Override
    public List<EasyUITreeNode> getContentCategoryList(long parentId) {
        return null;
    }

    @Override
    public TaotaoResult addContentCategory(Long parentId, String name) {
        return null;
    }
}
