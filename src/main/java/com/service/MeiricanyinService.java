package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeiricanyinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeiricanyinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeiricanyinView;


/**
 * 每日餐饮
 *
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public interface MeiricanyinService extends IService<MeiricanyinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeiricanyinVO> selectListVO(Wrapper<MeiricanyinEntity> wrapper);
   	
   	MeiricanyinVO selectVO(@Param("ew") Wrapper<MeiricanyinEntity> wrapper);
   	
   	List<MeiricanyinView> selectListView(Wrapper<MeiricanyinEntity> wrapper);
   	
   	MeiricanyinView selectView(@Param("ew") Wrapper<MeiricanyinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeiricanyinEntity> wrapper);

   	

}

