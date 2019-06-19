package com.taotao.wdengf.rpc.service.impl;

import com.wdengf.taotao.common.annotation.BaseService;
import com.wdengf.taotao.common.base.BaseServiceImpl;
import com.taotao.wdengf.dao.mapper.TbItemCatMapper;
import com.taotao.wdengf.dao.model.TbItemCat;
import com.taotao.wdengf.dao.model.TbItemCatExample;
import com.taotao.wdengf.rpc.api.TbItemCatService;
import com.wdengf.taotao.manager.common.pojo.EasyUITreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<EasyUITreeNode> getItemCatList(long parentId) {
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> list = tbItemCatMapper.selectByExample(example);
        List<EasyUITreeNode> resultList = new ArrayList<EasyUITreeNode>();
        for (TbItemCat tbItemCat : list) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent() ? "closed":"open");
            //添加到节点列表
            resultList.add(node);
        }
        return resultList;
    }
}