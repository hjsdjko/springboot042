package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangView;


/**
 * 健康
 *
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public interface JiankangService extends IService<JiankangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangVO> selectListVO(Wrapper<JiankangEntity> wrapper);
   	
   	JiankangVO selectVO(@Param("ew") Wrapper<JiankangEntity> wrapper);
   	
   	List<JiankangView> selectListView(Wrapper<JiankangEntity> wrapper);
   	
   	JiankangView selectView(@Param("ew") Wrapper<JiankangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangEntity> wrapper);

   	

}

