package com.dao;

import com.entity.AnquanqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AnquanqingkuangVO;
import com.entity.view.AnquanqingkuangView;


/**
 * 安全情况
 * 
 * @author 
 * @email 
 * @date 2024-04-19 17:25:13
 */
public interface AnquanqingkuangDao extends BaseMapper<AnquanqingkuangEntity> {
	
	List<AnquanqingkuangVO> selectListVO(@Param("ew") Wrapper<AnquanqingkuangEntity> wrapper);
	
	AnquanqingkuangVO selectVO(@Param("ew") Wrapper<AnquanqingkuangEntity> wrapper);
	
	List<AnquanqingkuangView> selectListView(@Param("ew") Wrapper<AnquanqingkuangEntity> wrapper);

	List<AnquanqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<AnquanqingkuangEntity> wrapper);

	
	AnquanqingkuangView selectView(@Param("ew") Wrapper<AnquanqingkuangEntity> wrapper);
	

}
