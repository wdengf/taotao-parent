package com.taotao.wdengf.rpc.api;

import com.taotao.wdengf.dao.model.TbItem;
import com.taotao.wdengf.dao.model.TbItemExample;
import com.wdengf.taotao.common.base.BaseService;
import com.wdengf.taotao.common.util.pojo.EasyUIDataGridResult;
import com.wdengf.taotao.common.util.pojo.TaotaoResult;

/**
* TbItemService接口
* Created by wdengf on 2019/6/16.
*/
public interface TbItemService extends BaseService<TbItem, TbItemExample> {

    TbItem getItemById(long itemId);
    EasyUIDataGridResult getItemList(int page, int rows);
    TaotaoResult addItem(TbItem item, String desc);
}