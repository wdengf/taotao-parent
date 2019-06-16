package com.taotao.wdengf.rpc.service.impl;

import com.wdengf.taotao.common.annotation.BaseService;
import com.wdengf.taotao.common.base.BaseServiceImpl;
import com.taotao.wdengf.dao.mapper.TbItemParamMapper;
import com.taotao.wdengf.dao.model.TbItemParam;
import com.taotao.wdengf.dao.model.TbItemParamExample;
import com.taotao.wdengf.rpc.api.TbItemParamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbItemParamService实现
* Created by wdengf on 2019/6/16.
*/
@Service
@Transactional
@BaseService
public class TbItemParamServiceImpl extends BaseServiceImpl<TbItemParamMapper, TbItemParam, TbItemParamExample> implements TbItemParamService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TbItemParamServiceImpl.class);

    @Autowired
    TbItemParamMapper tbItemParamMapper;

}