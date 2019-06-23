package com.taotao.wdengf.rpc.api;

import com.taotao.wdengf.dao.mapper.TbOrderMapper;
import com.taotao.wdengf.dao.model.TbOrder;
import com.taotao.wdengf.dao.model.TbOrderExample;
import com.wdengf.taotao.common.base.BaseServiceMock;

/**
* 降级实现TbOrderService接口
* Created by wdengf on 2019/6/16.
*/
public class TbOrderServiceMock extends BaseServiceMock<TbOrderMapper, TbOrder, TbOrderExample> implements TbOrderService {

}
