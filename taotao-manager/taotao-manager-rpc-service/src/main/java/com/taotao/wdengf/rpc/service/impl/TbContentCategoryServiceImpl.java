package com.taotao.wdengf.rpc.service.impl;

import com.wdengf.taotao.common.annotation.BaseService;
import com.wdengf.taotao.common.base.BaseServiceImpl;
import com.taotao.wdengf.dao.mapper.TbContentCategoryMapper;
import com.taotao.wdengf.dao.model.TbContentCategory;
import com.taotao.wdengf.dao.model.TbContentCategoryExample;
import com.taotao.wdengf.rpc.api.TbContentCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbContentCategoryService实现
* Created by wdengf on 2019/6/16.
*/
@Service
@Transactional
@BaseService
public class TbContentCategoryServiceImpl extends BaseServiceImpl<TbContentCategoryMapper, TbContentCategory, TbContentCategoryExample> implements TbContentCategoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TbContentCategoryServiceImpl.class);

    @Autowired
    TbContentCategoryMapper tbContentCategoryMapper;

}