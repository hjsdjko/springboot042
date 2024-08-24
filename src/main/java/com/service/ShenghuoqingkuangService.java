package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenghuoqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenghuoqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenghuoqingkuangView;


/**
 * 生活情况
 *
 * @author 
 * @email 
 * @date 2024-04-19 17:25:13
 */
public interface ShenghuoqingkuangService extends IService<ShenghuoqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenghuoqingkuangVO> selectListVO(Wrapper<ShenghuoqingkuangEntity> wrapper);
   	
   	ShenghuoqingkuangVO selectVO(@Param("ew") Wrapper<ShenghuoqingkuangEntity> wrapper);
   	
   	List<ShenghuoqingkuangView> selectListView(Wrapper<ShenghuoqingkuangEntity> wrapper);
   	
   	ShenghuoqingkuangView selectView(@Param("ew") Wrapper<ShenghuoqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenghuoqingkuangEntity> wrapper);

   	

}

