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


import com.dao.RuzhulaorenDao;
import com.entity.RuzhulaorenEntity;
import com.service.RuzhulaorenService;
import com.entity.vo.RuzhulaorenVO;
import com.entity.view.RuzhulaorenView;

@Service("ruzhulaorenService")
public class RuzhulaorenServiceImpl extends ServiceImpl<RuzhulaorenDao, RuzhulaorenEntity> implements RuzhulaorenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuzhulaorenEntity> page = this.selectPage(
                new Query<RuzhulaorenEntity>(params).getPage(),
                new EntityWrapper<RuzhulaorenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuzhulaorenEntity> wrapper) {
		  Page<RuzhulaorenView> page =new Query<RuzhulaorenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<RuzhulaorenVO> selectListVO(Wrapper<RuzhulaorenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuzhulaorenVO selectVO(Wrapper<RuzhulaorenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuzhulaorenView> selectListView(Wrapper<RuzhulaorenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuzhulaorenView selectView(Wrapper<RuzhulaorenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
