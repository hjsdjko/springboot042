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


import com.dao.AnquanqingkuangDao;
import com.entity.AnquanqingkuangEntity;
import com.service.AnquanqingkuangService;
import com.entity.vo.AnquanqingkuangVO;
import com.entity.view.AnquanqingkuangView;

@Service("anquanqingkuangService")
public class AnquanqingkuangServiceImpl extends ServiceImpl<AnquanqingkuangDao, AnquanqingkuangEntity> implements AnquanqingkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AnquanqingkuangEntity> page = this.selectPage(
                new Query<AnquanqingkuangEntity>(params).getPage(),
                new EntityWrapper<AnquanqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AnquanqingkuangEntity> wrapper) {
		  Page<AnquanqingkuangView> page =new Query<AnquanqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<AnquanqingkuangVO> selectListVO(Wrapper<AnquanqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AnquanqingkuangVO selectVO(Wrapper<AnquanqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AnquanqingkuangView> selectListView(Wrapper<AnquanqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AnquanqingkuangView selectView(Wrapper<AnquanqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
