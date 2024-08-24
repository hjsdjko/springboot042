package com.entity.view;

import com.entity.RuzhulaorenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 入住老人
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
@TableName("ruzhulaoren")
public class RuzhulaorenView  extends RuzhulaorenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuzhulaorenView(){
	}
 
 	public RuzhulaorenView(RuzhulaorenEntity ruzhulaorenEntity){
 	try {
			BeanUtils.copyProperties(this, ruzhulaorenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
