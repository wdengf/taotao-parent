package com.taotao.wdengf.rpc.api;

import com.wdengf.taotao.common.base.BaseService;
import com.taotao.wdengf.dao.model.TbContentCategory;
import com.taotao.wdengf.dao.model.TbContentCategoryExample;
import com.wdengf.taotao.common.util.pojo.EasyUITreeNode;
import com.wdengf.taotao.common.util.pojo.TaotaoResult;


import java.util.List;

/**
* TbContentCategoryService接口
* Created by wdengf on 2019/6/16.
*/
public interface TbContentCategoryService extends BaseService<TbContentCategory, TbContentCategoryExample> {

    List<EasyUITreeNode> getContentCategoryList(long parentId);

    TaotaoResult addContentCategory(Long parentId, String name);
}