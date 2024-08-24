package com.entity.vo;

import com.entity.AnquanqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 安全情况
 * @author 
 * @email 
 * @date 2024-04-19 17:25:13
 */
public class AnquanqingkuangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 外来人员
	 */
	
	private String wailairenyuan;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 进入时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jinrushijian;
		
	/**
	 * 离开时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date likaishijian;
		
	/**
	 * 来访说明
	 */
	
	private String laifangshuoming;
				
	
	/**
	 * 设置：外来人员
	 */
	 
	public void setWailairenyuan(String wailairenyuan) {
		this.wailairenyuan = wailairenyuan;
	}
	
	/**
	 * 获取：外来人员
	 */
	public String getWailairenyuan() {
		return wailairenyuan;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：进入时间
	 */
	 
	public void setJinrushijian(Date jinrushijian) {
		this.jinrushijian = jinrushijian;
	}
	
	/**
	 * 获取：进入时间
	 */
	public Date getJinrushijian() {
		return jinrushijian;
	}
				
	
	/**
	 * 设置：离开时间
	 */
	 
	public void setLikaishijian(Date likaishijian) {
		this.likaishijian = likaishijian;
	}
	
	/**
	 * 获取：离开时间
	 */
	public Date getLikaishijian() {
		return likaishijian;
	}
				
	
	/**
	 * 设置：来访说明
	 */
	 
	public void setLaifangshuoming(String laifangshuoming) {
		this.laifangshuoming = laifangshuoming;
	}
	
	/**
	 * 获取：来访说明
	 */
	public String getLaifangshuoming() {
		return laifangshuoming;
	}
			
}
