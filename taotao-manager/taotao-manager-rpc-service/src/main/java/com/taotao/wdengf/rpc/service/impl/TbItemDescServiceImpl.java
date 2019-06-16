package com.taotao.wdengf.rpc.service.impl;

import com.wdengf.taotao.common.annotation.BaseService;
import com.wdengf.taotao.common.base.BaseServiceImpl;
import com.taotao.wdengf.dao.mapper.TbItemDescMapper;
import com.taotao.wdengf.dao.model.TbItemDesc;
import com.taotao.wdengf.dao.model.TbItemDescExample;
import com.taotao.wdengf.rpc.api.TbItemDescService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbItemDescService实现
* Created by wdengf on 2019/6/16.
*/
@Service
@Transactional
@BaseService
public class TbItemDescServiceImpl extends BaseServiceImpl<TbItemDescMapper, TbItemDesc, TbItemDescExample> implements TbItemDescService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TbItemDescServiceImpl.class);

    @Autowired
    TbItemDescMapper tbItemDescMapper;

}