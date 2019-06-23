package com.taotao.wdengf.rpc.api;

import com.wdengf.taotao.common.base.BaseServiceMock;
import com.taotao.wdengf.dao.mapper.TbContentMapper;
import com.taotao.wdengf.dao.model.TbContent;
import com.taotao.wdengf.dao.model.TbContentExample;
import com.wdengf.taotao.common.util.pojo.TaotaoResult;

import java.util.List;

/**
* 降级实现TbContentService接口
* Created by wdengf on 2019/6/16.
*/
public class TbContentServiceMock extends BaseServiceMock<TbContentMapper, TbContent, TbContentExample> implements TbContentService {

    @Override
    public List<TbContent> getContentByCid(long cid) {
        return null;
    }

    @Override
    public TaotaoResult addContent(TbContent content) {
        return null;
    }
}
