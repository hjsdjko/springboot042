package com.entity.view;

import com.entity.AnquanqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 安全情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-19 17:25:13
 */
@TableName("anquanqingkuang")
public class AnquanqingkuangView  extends AnquanqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public AnquanqingkuangView(){
	}
 
 	public AnquanqingkuangView(AnquanqingkuangEntity anquanqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, anquanqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
