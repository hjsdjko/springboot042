package com.entity.view;

import com.entity.ShenghuoqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 生活情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-19 17:25:13
 */
@TableName("shenghuoqingkuang")
public class ShenghuoqingkuangView  extends ShenghuoqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenghuoqingkuangView(){
	}
 
 	public ShenghuoqingkuangView(ShenghuoqingkuangEntity shenghuoqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, shenghuoqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
