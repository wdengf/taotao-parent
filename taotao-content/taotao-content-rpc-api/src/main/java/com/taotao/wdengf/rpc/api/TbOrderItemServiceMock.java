package com.taotao.wdengf.rpc.api;

import com.taotao.wdengf.dao.mapper.TbOrderItemMapper;
import com.taotao.wdengf.dao.model.TbOrderItem;
import com.taotao.wdengf.dao.model.TbOrderItemExample;
import com.wdengf.taotao.common.base.BaseServiceMock;

/**
* 降级实现TbOrderItemService接口
* Created by wdengf on 2019/6/16.
*/
public class TbOrderItemServiceMock extends BaseServiceMock<TbOrderItemMapper, TbOrderItem, TbOrderItemExample> implements TbOrderItemService {

}
