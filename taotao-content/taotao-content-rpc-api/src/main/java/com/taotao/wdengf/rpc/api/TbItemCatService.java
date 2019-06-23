package com.taotao.wdengf.rpc.api;

import com.taotao.wdengf.dao.model.TbItemCat;
import com.taotao.wdengf.dao.model.TbItemCatExample;
import com.wdengf.taotao.common.base.BaseService;
import com.wdengf.taotao.common.util.pojo.EasyUITreeNode;

import java.util.List;

/**
* TbItemCatService接口
* Created by wdengf on 2019/6/16.
*/
public interface TbItemCatService extends BaseService<TbItemCat, TbItemCatExample> {

    public List<EasyUITreeNode> getItemCatList(long parentId);
}