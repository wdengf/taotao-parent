package com.taotao.wdengf.rpc.api;

import com.taotao.wdengf.dao.model.TbContent;
import com.taotao.wdengf.dao.model.TbContentExample;
import com.wdengf.taotao.common.base.BaseService;
import com.wdengf.taotao.common.util.pojo.TaotaoResult;

import java.util.List;

/**
* TbContentService接口
* Created by wdengf on 2019/6/16.
*/
public interface TbContentService extends BaseService<TbContent, TbContentExample> {

    List<TbContent> getContentByCid(long cid);
    TaotaoResult addContent(TbContent content);
}