package com.dao;

import com.entity.MeiricanyinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeiricanyinVO;
import com.entity.view.MeiricanyinView;


/**
 * 每日餐饮
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public interface MeiricanyinDao extends BaseMapper<MeiricanyinEntity> {
	
	List<MeiricanyinVO> selectListVO(@Param("ew") Wrapper<MeiricanyinEntity> wrapper);
	
	MeiricanyinVO selectVO(@Param("ew") Wrapper<MeiricanyinEntity> wrapper);
	
	List<MeiricanyinView> selectListView(@Param("ew") Wrapper<MeiricanyinEntity> wrapper);

	List<MeiricanyinView> selectListView(Pagination page,@Param("ew") Wrapper<MeiricanyinEntity> wrapper);

	
	MeiricanyinView selectView(@Param("ew") Wrapper<MeiricanyinEntity> wrapper);
	

}
