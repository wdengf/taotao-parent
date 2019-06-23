package com.taotao.wdengf.rpc.api;

import com.taotao.wdengf.dao.mapper.TbItemMapper;
import com.taotao.wdengf.dao.model.TbItem;
import com.taotao.wdengf.dao.model.TbItemExample;
import com.wdengf.taotao.common.base.BaseServiceMock;
import com.wdengf.taotao.common.util.pojo.EasyUIDataGridResult;
import com.wdengf.taotao.common.util.pojo.TaotaoResult;

/**
* 降级实现TbItemService接口
* Created by wdengf on 2019/6/16.
*/
public class TbItemServiceMock extends BaseServiceMock<TbItemMapper, TbItem, TbItemExample> implements TbItemService {

    @Override
    public int countByExample(TbItemExample tbItemExample) {
        return super.countByExample(tbItemExample);
    }

    @Override
    public TbItem getItemById(long itemId) {
        return null;
    }

    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        return null;
    }

    @Override
    public TaotaoResult addItem(TbItem item, String desc) {
        return null;
    }
}
