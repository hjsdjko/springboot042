package com.dao;

import com.entity.WaichubaobeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WaichubaobeiVO;
import com.entity.view.WaichubaobeiView;


/**
 * 外出报备
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public interface WaichubaobeiDao extends BaseMapper<WaichubaobeiEntity> {
	
	List<WaichubaobeiVO> selectListVO(@Param("ew") Wrapper<WaichubaobeiEntity> wrapper);
	
	WaichubaobeiVO selectVO(@Param("ew") Wrapper<WaichubaobeiEntity> wrapper);
	
	List<WaichubaobeiView> selectListView(@Param("ew") Wrapper<WaichubaobeiEntity> wrapper);

	List<WaichubaobeiView> selectListView(Pagination page,@Param("ew") Wrapper<WaichubaobeiEntity> wrapper);

	
	WaichubaobeiView selectView(@Param("ew") Wrapper<WaichubaobeiEntity> wrapper);
	

}
