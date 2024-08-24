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


import com.dao.ShenghuoqingkuangDao;
import com.entity.ShenghuoqingkuangEntity;
import com.service.ShenghuoqingkuangService;
import com.entity.vo.ShenghuoqingkuangVO;
import com.entity.view.ShenghuoqingkuangView;

@Service("shenghuoqingkuangService")
public class ShenghuoqingkuangServiceImpl extends ServiceImpl<ShenghuoqingkuangDao, ShenghuoqingkuangEntity> implements ShenghuoqingkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenghuoqingkuangEntity> page = this.selectPage(
                new Query<ShenghuoqingkuangEntity>(params).getPage(),
                new EntityWrapper<ShenghuoqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenghuoqingkuangEntity> wrapper) {
		  Page<ShenghuoqingkuangView> page =new Query<ShenghuoqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShenghuoqingkuangVO> selectListVO(Wrapper<ShenghuoqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenghuoqingkuangVO selectVO(Wrapper<ShenghuoqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenghuoqingkuangView> selectListView(Wrapper<ShenghuoqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenghuoqingkuangView selectView(Wrapper<ShenghuoqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
