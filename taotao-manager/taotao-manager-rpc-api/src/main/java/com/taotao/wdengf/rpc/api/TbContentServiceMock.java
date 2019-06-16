package com.taotao.wdengf.rpc.api;

import com.wdengf.taotao.common.base.BaseServiceMock;
import com.taotao.wdengf.dao.mapper.TbContentMapper;
import com.taotao.wdengf.dao.model.TbContent;
import com.taotao.wdengf.dao.model.TbContentExample;

/**
* 降级实现TbContentService接口
* Created by wdengf on 2019/6/16.
*/
public class TbContentServiceMock extends BaseServiceMock<TbContentMapper, TbContent, TbContentExample> implements TbContentService {

}
