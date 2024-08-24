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


import com.dao.JiashuDao;
import com.entity.JiashuEntity;
import com.service.JiashuService;
import com.entity.vo.JiashuVO;
import com.entity.view.JiashuView;

@Service("jiashuService")
public class JiashuServiceImpl extends ServiceImpl<JiashuDao, JiashuEntity> implements JiashuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiashuEntity> page = this.selectPage(
                new Query<JiashuEntity>(params).getPage(),
                new EntityWrapper<JiashuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiashuEntity> wrapper) {
		  Page<JiashuView> page =new Query<JiashuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JiashuVO> selectListVO(Wrapper<JiashuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiashuVO selectVO(Wrapper<JiashuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiashuView> selectListView(Wrapper<JiashuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiashuView selectView(Wrapper<JiashuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
