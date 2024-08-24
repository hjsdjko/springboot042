package com.dao;

import com.entity.RuzhulaorenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuzhulaorenVO;
import com.entity.view.RuzhulaorenView;


/**
 * 入住老人
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public interface RuzhulaorenDao extends BaseMapper<RuzhulaorenEntity> {
	
	List<RuzhulaorenVO> selectListVO(@Param("ew") Wrapper<RuzhulaorenEntity> wrapper);
	
	RuzhulaorenVO selectVO(@Param("ew") Wrapper<RuzhulaorenEntity> wrapper);
	
	List<RuzhulaorenView> selectListView(@Param("ew") Wrapper<RuzhulaorenEntity> wrapper);

	List<RuzhulaorenView> selectListView(Pagination page,@Param("ew") Wrapper<RuzhulaorenEntity> wrapper);

	
	RuzhulaorenView selectView(@Param("ew") Wrapper<RuzhulaorenEntity> wrapper);
	

}
