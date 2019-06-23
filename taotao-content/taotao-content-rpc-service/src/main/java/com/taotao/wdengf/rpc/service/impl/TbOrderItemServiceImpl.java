package com.taotao.wdengf.rpc.service.impl;

import com.taotao.wdengf.dao.mapper.TbOrderItemMapper;
import com.taotao.wdengf.dao.model.TbOrderItem;
import com.taotao.wdengf.dao.model.TbOrderItemExample;
import com.taotao.wdengf.rpc.api.TbOrderItemService;
import com.wdengf.taotao.common.annotation.BaseService;
import com.wdengf.taotao.common.base.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbOrderItemService实现
* Created by wdengf on 2019/6/16.
*/
@Service
@Transactional
@BaseService
public class TbOrderItemServiceImpl extends BaseServiceImpl<TbOrderItemMapper, TbOrderItem, TbOrderItemExample> implements TbOrderItemService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TbOrderItemServiceImpl.class);

    @Autowired
    TbOrderItemMapper tbOrderItemMapper;

}