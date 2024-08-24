package com.entity.model;

import com.entity.FeiyongjiaonaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 费用缴纳
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
public class FeiyongjiaonaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 老人姓名
	 */
	
	private String laorenxingming;
		
	/**
	 * 家属账号
	 */
	
	private String jiashuzhanghao;
		
	/**
	 * 家属姓名
	 */
	
	private String jiashuxingming;
		
	/**
	 * 老人照片
	 */
	
	private String laorenzhaopian;
		
	/**
	 * 入住费用
	 */
	
	private Double ruzhufeiyong;
		
	/**
	 * 护理费用
	 */
	
	private Double hulifeiyong;
		
	/**
	 * 医疗费用
	 */
	
	private Double yiliaofeiyong;
		
	/**
	 * 其他费用
	 */
	
	private Double qitafeiyong;
		
	/**
	 * 合计费用
	 */
	
	private Double hejifeiyong;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 说明
	 */
	
	private String shuoming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：老人姓名
	 */
	 
	public void setLaorenxingming(String laorenxingming) {
		this.laorenxingming = laorenxingming;
	}
	
	/**
	 * 获取：老人姓名
	 */
	public String getLaorenxingming() {
		return laorenxingming;
	}
				
	
	/**
	 * 设置：家属账号
	 */
	 
	public void setJiashuzhanghao(String jiashuzhanghao) {
		this.jiashuzhanghao = jiashuzhanghao;
	}
	
	/**
	 * 获取：家属账号
	 */
	public String getJiashuzhanghao() {
		return jiashuzhanghao;
	}
				
	
	/**
	 * 设置：家属姓名
	 */
	 
	public void setJiashuxingming(String jiashuxingming) {
		this.jiashuxingming = jiashuxingming;
	}
	
	/**
	 * 获取：家属姓名
	 */
	public String getJiashuxingming() {
		return jiashuxingming;
	}
				
	
	/**
	 * 设置：老人照片
	 */
	 
	public void setLaorenzhaopian(String laorenzhaopian) {
		this.laorenzhaopian = laorenzhaopian;
	}
	
	/**
	 * 获取：老人照片
	 */
	public String getLaorenzhaopian() {
		return laorenzhaopian;
	}
				
	
	/**
	 * 设置：入住费用
	 */
	 
	public void setRuzhufeiyong(Double ruzhufeiyong) {
		this.ruzhufeiyong = ruzhufeiyong;
	}
	
	/**
	 * 获取：入住费用
	 */
	public Double getRuzhufeiyong() {
		return ruzhufeiyong;
	}
				
	
	/**
	 * 设置：护理费用
	 */
	 
	public void setHulifeiyong(Double hulifeiyong) {
		this.hulifeiyong = hulifeiyong;
	}
	
	/**
	 * 获取：护理费用
	 */
	public Double getHulifeiyong() {
		return hulifeiyong;
	}
				
	
	/**
	 * 设置：医疗费用
	 */
	 
	public void setYiliaofeiyong(Double yiliaofeiyong) {
		this.yiliaofeiyong = yiliaofeiyong;
	}
	
	/**
	 * 获取：医疗费用
	 */
	public Double getYiliaofeiyong() {
		return yiliaofeiyong;
	}
				
	
	/**
	 * 设置：其他费用
	 */
	 
	public void setQitafeiyong(Double qitafeiyong) {
		this.qitafeiyong = qitafeiyong;
	}
	
	/**
	 * 获取：其他费用
	 */
	public Double getQitafeiyong() {
		return qitafeiyong;
	}
				
	
	/**
	 * 设置：合计费用
	 */
	 
	public void setHejifeiyong(Double hejifeiyong) {
		this.hejifeiyong = hejifeiyong;
	}
	
	/**
	 * 获取：合计费用
	 */
	public Double getHejifeiyong() {
		return hejifeiyong;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：说明
	 */
	 
	public void setShuoming(String shuoming) {
		this.shuoming = shuoming;
	}
	
	/**
	 * 获取：说明
	 */
	public String getShuoming() {
		return shuoming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
