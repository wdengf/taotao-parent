package com.taotao.wdengf.rpc.api;

import com.taotao.wdengf.dao.mapper.TbItemCatMapper;
import com.taotao.wdengf.dao.model.TbItemCat;
import com.taotao.wdengf.dao.model.TbItemCatExample;
import com.wdengf.taotao.common.base.BaseServiceMock;
import com.wdengf.taotao.common.util.pojo.EasyUITreeNode;

import java.util.List;

/**
* 降级实现TbItemCatService接口
* Created by wdengf on 2019/6/16.
*/
public class TbItemCatServiceMock extends BaseServiceMock<TbItemCatMapper, TbItemCat, TbItemCatExample> implements TbItemCatService {

    @Override
    public List<EasyUITreeNode> getItemCatList(long parentId) {
        return null;
    }
}
