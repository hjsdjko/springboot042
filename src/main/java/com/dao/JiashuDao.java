package com.dao;

import com.entity.JiashuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiashuVO;
import com.entity.view.JiashuView;


/**
 * 家属
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public interface JiashuDao extends BaseMapper<JiashuEntity> {
	
	List<JiashuVO> selectListVO(@Param("ew") Wrapper<JiashuEntity> wrapper);
	
	JiashuVO selectVO(@Param("ew") Wrapper<JiashuEntity> wrapper);
	
	List<JiashuView> selectListView(@Param("ew") Wrapper<JiashuEntity> wrapper);

	List<JiashuView> selectListView(Pagination page,@Param("ew") Wrapper<JiashuEntity> wrapper);

	
	JiashuView selectView(@Param("ew") Wrapper<JiashuEntity> wrapper);
	

}
