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


import com.dao.MeiricanyinDao;
import com.entity.MeiricanyinEntity;
import com.service.MeiricanyinService;
import com.entity.vo.MeiricanyinVO;
import com.entity.view.MeiricanyinView;

@Service("meiricanyinService")
public class MeiricanyinServiceImpl extends ServiceImpl<MeiricanyinDao, MeiricanyinEntity> implements MeiricanyinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeiricanyinEntity> page = this.selectPage(
                new Query<MeiricanyinEntity>(params).getPage(),
                new EntityWrapper<MeiricanyinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeiricanyinEntity> wrapper) {
		  Page<MeiricanyinView> page =new Query<MeiricanyinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<MeiricanyinVO> selectListVO(Wrapper<MeiricanyinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeiricanyinVO selectVO(Wrapper<MeiricanyinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeiricanyinView> selectListView(Wrapper<MeiricanyinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeiricanyinView selectView(Wrapper<MeiricanyinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
