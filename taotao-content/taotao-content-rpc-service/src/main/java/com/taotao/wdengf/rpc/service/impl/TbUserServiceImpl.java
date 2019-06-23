package com.taotao.wdengf.rpc.service.impl;

import com.taotao.wdengf.dao.mapper.TbUserMapper;
import com.taotao.wdengf.dao.model.TbUser;
import com.taotao.wdengf.dao.model.TbUserExample;
import com.taotao.wdengf.rpc.api.TbUserService;
import com.wdengf.taotao.common.annotation.BaseService;
import com.wdengf.taotao.common.base.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbUserService实现
* Created by wdengf on 2019/6/16.
*/
@Service
@Transactional
@BaseService
public class TbUserServiceImpl extends BaseServiceImpl<TbUserMapper, TbUser, TbUserExample> implements TbUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TbUserServiceImpl.class);

    @Autowired
    TbUserMapper tbUserMapper;

}