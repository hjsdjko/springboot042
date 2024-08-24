package com.dao;

import com.entity.JiankangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangVO;
import com.entity.view.JiankangView;


/**
 * 健康
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public interface JiankangDao extends BaseMapper<JiankangEntity> {
	
	List<JiankangVO> selectListVO(@Param("ew") Wrapper<JiankangEntity> wrapper);
	
	JiankangVO selectVO(@Param("ew") Wrapper<JiankangEntity> wrapper);
	
	List<JiankangView> selectListView(@Param("ew") Wrapper<JiankangEntity> wrapper);

	List<JiankangView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangEntity> wrapper);

	
	JiankangView selectView(@Param("ew") Wrapper<JiankangEntity> wrapper);
	

}
