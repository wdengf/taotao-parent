package com.taotao.wdengf.rpc.service.impl;

import com.wdengf.taotao.common.annotation.BaseService;
import com.wdengf.taotao.common.base.BaseServiceImpl;
import com.taotao.wdengf.dao.mapper.TbContentMapper;
import com.taotao.wdengf.dao.model.TbContent;
import com.taotao.wdengf.dao.model.TbContentExample;
import com.taotao.wdengf.rpc.api.TbContentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbContentService实现
* Created by wdengf on 2019/6/16.
*/
@Service
@Transactional
@BaseService
public class TbContentServiceImpl extends BaseServiceImpl<TbContentMapper, TbContent, TbContentExample> implements TbContentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TbContentServiceImpl.class);

    @Autowired
    TbContentMapper tbContentMapper;

}