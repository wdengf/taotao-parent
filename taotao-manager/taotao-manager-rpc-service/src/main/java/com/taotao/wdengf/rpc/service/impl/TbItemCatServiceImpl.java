package com.taotao.wdengf.rpc.service.impl;

import com.wdengf.taotao.common.annotation.BaseService;
import com.wdengf.taotao.common.base.BaseServiceImpl;
import com.taotao.wdengf.dao.mapper.TbItemCatMapper;
import com.taotao.wdengf.dao.model.TbItemCat;
import com.taotao.wdengf.dao.model.TbItemCatExample;
import com.taotao.wdengf.rpc.api.TbItemCatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbItemCatService实现
* Created by wdengf on 2019/6/16.
*/
@Service
@Transactional
@BaseService
public class TbItemCatServiceImpl extends BaseServiceImpl<TbItemCatMapper, TbItemCat, TbItemCatExample> implements TbItemCatService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TbItemCatServiceImpl.class);

    @Autowired
    TbItemCatMapper tbItemCatMapper;

}