package com.dao;

import com.entity.FeiyongjiaonaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeiyongjiaonaVO;
import com.entity.view.FeiyongjiaonaView;


/**
 * 费用缴纳
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public interface FeiyongjiaonaDao extends BaseMapper<FeiyongjiaonaEntity> {
	
	List<FeiyongjiaonaVO> selectListVO(@Param("ew") Wrapper<FeiyongjiaonaEntity> wrapper);
	
	FeiyongjiaonaVO selectVO(@Param("ew") Wrapper<FeiyongjiaonaEntity> wrapper);
	
	List<FeiyongjiaonaView> selectListView(@Param("ew") Wrapper<FeiyongjiaonaEntity> wrapper);

	List<FeiyongjiaonaView> selectListView(Pagination page,@Param("ew") Wrapper<FeiyongjiaonaEntity> wrapper);

	
	FeiyongjiaonaView selectView(@Param("ew") Wrapper<FeiyongjiaonaEntity> wrapper);
	

}
