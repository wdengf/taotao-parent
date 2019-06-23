package com.taotao.wdengf.rpc.service.impl;

import com.taotao.wdengf.dao.mapper.TbItemParamItemMapper;
import com.taotao.wdengf.dao.model.TbItemParamItem;
import com.taotao.wdengf.dao.model.TbItemParamItemExample;
import com.taotao.wdengf.rpc.api.TbItemParamItemService;
import com.wdengf.taotao.common.annotation.BaseService;
import com.wdengf.taotao.common.base.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbItemParamItemService实现
* Created by wdengf on 2019/6/16.
*/
@Service
@Transactional
@BaseService
public class TbItemParamItemServiceImpl extends BaseServiceImpl<TbItemParamItemMapper, TbItemParamItem, TbItemParamItemExample> implements TbItemParamItemService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TbItemParamItemServiceImpl.class);

    @Autowired
    TbItemParamItemMapper tbItemParamItemMapper;

}