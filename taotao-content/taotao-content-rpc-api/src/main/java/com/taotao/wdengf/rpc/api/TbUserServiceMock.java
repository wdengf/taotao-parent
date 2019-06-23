package com.taotao.wdengf.rpc.api;

import com.taotao.wdengf.dao.mapper.TbUserMapper;
import com.taotao.wdengf.dao.model.TbUser;
import com.taotao.wdengf.dao.model.TbUserExample;
import com.wdengf.taotao.common.base.BaseServiceMock;

/**
* 降级实现TbUserService接口
* Created by wdengf on 2019/6/16.
*/
public class TbUserServiceMock extends BaseServiceMock<TbUserMapper, TbUser, TbUserExample> implements TbUserService {

}
