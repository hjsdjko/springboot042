package com.dao;

import com.entity.ChuangweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuangweiVO;
import com.entity.view.ChuangweiView;


/**
 * 床位
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public interface ChuangweiDao extends BaseMapper<ChuangweiEntity> {
	
	List<ChuangweiVO> selectListVO(@Param("ew") Wrapper<ChuangweiEntity> wrapper);
	
	ChuangweiVO selectVO(@Param("ew") Wrapper<ChuangweiEntity> wrapper);
	
	List<ChuangweiView> selectListView(@Param("ew") Wrapper<ChuangweiEntity> wrapper);

	List<ChuangweiView> selectListView(Pagination page,@Param("ew") Wrapper<ChuangweiEntity> wrapper);

	
	ChuangweiView selectView(@Param("ew") Wrapper<ChuangweiEntity> wrapper);
	

}
