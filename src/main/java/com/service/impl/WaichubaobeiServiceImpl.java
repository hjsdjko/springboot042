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


import com.dao.WaichubaobeiDao;
import com.entity.WaichubaobeiEntity;
import com.service.WaichubaobeiService;
import com.entity.vo.WaichubaobeiVO;
import com.entity.view.WaichubaobeiView;

@Service("waichubaobeiService")
public class WaichubaobeiServiceImpl extends ServiceImpl<WaichubaobeiDao, WaichubaobeiEntity> implements WaichubaobeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WaichubaobeiEntity> page = this.selectPage(
                new Query<WaichubaobeiEntity>(params).getPage(),
                new EntityWrapper<WaichubaobeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WaichubaobeiEntity> wrapper) {
		  Page<WaichubaobeiView> page =new Query<WaichubaobeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<WaichubaobeiVO> selectListVO(Wrapper<WaichubaobeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WaichubaobeiVO selectVO(Wrapper<WaichubaobeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WaichubaobeiView> selectListView(Wrapper<WaichubaobeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WaichubaobeiView selectView(Wrapper<WaichubaobeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
