package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChuangweiDao;
import com.entity.ChuangweiEntity;
import com.service.ChuangweiService;
import com.entity.vo.ChuangweiVO;
import com.entity.view.ChuangweiView;

@Service("chuangweiService")
public class ChuangweiServiceImpl extends ServiceImpl<ChuangweiDao, ChuangweiEntity> implements ChuangweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuangweiEntity> page = this.selectPage(
                new Query<ChuangweiEntity>(params).getPage(),
                new EntityWrapper<ChuangweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuangweiEntity> wrapper) {
		  Page<ChuangweiView> page =new Query<ChuangweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChuangweiVO> selectListVO(Wrapper<ChuangweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuangweiVO selectVO(Wrapper<ChuangweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuangweiView> selectListView(Wrapper<ChuangweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuangweiView selectView(Wrapper<ChuangweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
