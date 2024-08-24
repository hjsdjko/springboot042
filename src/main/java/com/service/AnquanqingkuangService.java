package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AnquanqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AnquanqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AnquanqingkuangView;


/**
 * 安全情况
 *
 * @author 
 * @email 
 * @date 2024-04-19 17:25:13
 */
public interface AnquanqingkuangService extends IService<AnquanqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AnquanqingkuangVO> selectListVO(Wrapper<AnquanqingkuangEntity> wrapper);
   	
   	AnquanqingkuangVO selectVO(@Param("ew") Wrapper<AnquanqingkuangEntity> wrapper);
   	
   	List<AnquanqingkuangView> selectListView(Wrapper<AnquanqingkuangEntity> wrapper);
   	
   	AnquanqingkuangView selectView(@Param("ew") Wrapper<AnquanqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AnquanqingkuangEntity> wrapper);

   	

}

