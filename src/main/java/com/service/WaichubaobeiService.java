package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WaichubaobeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WaichubaobeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WaichubaobeiView;


/**
 * 外出报备
 *
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public interface WaichubaobeiService extends IService<WaichubaobeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WaichubaobeiVO> selectListVO(Wrapper<WaichubaobeiEntity> wrapper);
   	
   	WaichubaobeiVO selectVO(@Param("ew") Wrapper<WaichubaobeiEntity> wrapper);
   	
   	List<WaichubaobeiView> selectListView(Wrapper<WaichubaobeiEntity> wrapper);
   	
   	WaichubaobeiView selectView(@Param("ew") Wrapper<WaichubaobeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WaichubaobeiEntity> wrapper);

   	

}

