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


import com.dao.JiankangDao;
import com.entity.JiankangEntity;
import com.service.JiankangService;
import com.entity.vo.JiankangVO;
import com.entity.view.JiankangView;

@Service("jiankangService")
public class JiankangServiceImpl extends ServiceImpl<JiankangDao, JiankangEntity> implements JiankangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangEntity> page = this.selectPage(
                new Query<JiankangEntity>(params).getPage(),
                new EntityWrapper<JiankangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangEntity> wrapper) {
		  Page<JiankangView> page =new Query<JiankangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JiankangVO> selectListVO(Wrapper<JiankangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangVO selectVO(Wrapper<JiankangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangView> selectListView(Wrapper<JiankangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangView selectView(Wrapper<JiankangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
