package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuzhulaorenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuzhulaorenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuzhulaorenView;


/**
 * 入住老人
 *
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public interface RuzhulaorenService extends IService<RuzhulaorenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuzhulaorenVO> selectListVO(Wrapper<RuzhulaorenEntity> wrapper);
   	
   	RuzhulaorenVO selectVO(@Param("ew") Wrapper<RuzhulaorenEntity> wrapper);
   	
   	List<RuzhulaorenView> selectListView(Wrapper<RuzhulaorenEntity> wrapper);
   	
   	RuzhulaorenView selectView(@Param("ew") Wrapper<RuzhulaorenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuzhulaorenEntity> wrapper);

   	

}

