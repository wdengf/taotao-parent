package com.taotao.wdengf.rpc.service.impl;

import com.taotao.wdengf.dao.mapper.TbOrderMapper;
import com.taotao.wdengf.dao.model.TbOrder;
import com.taotao.wdengf.dao.model.TbOrderExample;
import com.taotao.wdengf.rpc.api.TbOrderService;
import com.wdengf.taotao.common.annotation.BaseService;
import com.wdengf.taotao.common.base.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbOrderService实现
* Created by wdengf on 2019/6/16.
*/
@Service
@Transactional
@BaseService
public class TbOrderServiceImpl extends BaseServiceImpl<TbOrderMapper, TbOrder, TbOrderExample> implements TbOrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TbOrderServiceImpl.class);

    @Autowired
    TbOrderMapper tbOrderMapper;

}