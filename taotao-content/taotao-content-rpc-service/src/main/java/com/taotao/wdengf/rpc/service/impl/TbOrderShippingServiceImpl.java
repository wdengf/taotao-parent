package com.taotao.wdengf.rpc.service.impl;

import com.taotao.wdengf.dao.mapper.TbOrderShippingMapper;
import com.taotao.wdengf.dao.model.TbOrderShipping;
import com.taotao.wdengf.dao.model.TbOrderShippingExample;
import com.taotao.wdengf.rpc.api.TbOrderShippingService;
import com.wdengf.taotao.common.annotation.BaseService;
import com.wdengf.taotao.common.base.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbOrderShippingService实现
* Created by wdengf on 2019/6/16.
*/
@Service
@Transactional
@BaseService
public class TbOrderShippingServiceImpl extends BaseServiceImpl<TbOrderShippingMapper, TbOrderShipping, TbOrderShippingExample> implements TbOrderShippingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TbOrderShippingServiceImpl.class);

    @Autowired
    TbOrderShippingMapper tbOrderShippingMapper;

}