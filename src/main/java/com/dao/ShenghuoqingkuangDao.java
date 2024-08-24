package com.dao;

import com.entity.ShenghuoqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenghuoqingkuangVO;
import com.entity.view.ShenghuoqingkuangView;


/**
 * 生活情况
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:25:13
 */
public interface ShenghuoqingkuangDao extends BaseMapper<ShenghuoqingkuangEntity> {
	
	List<ShenghuoqingkuangVO> selectListVO(@Param("ew") Wrapper<ShenghuoqingkuangEntity> wrapper);
	
	ShenghuoqingkuangVO selectVO(@Param("ew") Wrapper<ShenghuoqingkuangEntity> wrapper);
	
	List<ShenghuoqingkuangView> selectListView(@Param("ew") Wrapper<ShenghuoqingkuangEntity> wrapper);

	List<ShenghuoqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<ShenghuoqingkuangEntity> wrapper);

	
	ShenghuoqingkuangView selectView(@Param("ew") Wrapper<ShenghuoqingkuangEntity> wrapper);
	

}
