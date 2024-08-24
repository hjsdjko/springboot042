package com.entity.view;

import com.entity.MeiricanyinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 每日餐饮
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
@TableName("meiricanyin")
public class MeiricanyinView  extends MeiricanyinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeiricanyinView(){
	}
 
 	public MeiricanyinView(MeiricanyinEntity meiricanyinEntity){
 	try {
			BeanUtils.copyProperties(this, meiricanyinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
