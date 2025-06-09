package com.entity.vo;

import com.entity.YuangongpeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 员工培训
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-06 15:26:49
 */
public class YuangongpeixunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 培训类型
	 */
	
	private String peixunleixing;
		
	/**
	 * 培训时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date peixunshijian;
		
	/**
	 * 培训地点
	 */
	
	private String peixundidian;
		
	/**
	 * 培训内容
	 */
	
	private String peixunneirong;
		
	/**
	 * 培训讲师
	 */
	
	private String peixunjiangshi;
		
	/**
	 * 培训对象
	 */
	
	private String peixunduixiang;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：培训类型
	 */
	 
	public void setPeixunleixing(String peixunleixing) {
		this.peixunleixing = peixunleixing;
	}
	
	/**
	 * 获取：培训类型
	 */
	public String getPeixunleixing() {
		return peixunleixing;
	}
				
	
	/**
	 * 设置：培训时间
	 */
	 
	public void setPeixunshijian(Date peixunshijian) {
		this.peixunshijian = peixunshijian;
	}
	
	/**
	 * 获取：培训时间
	 */
	public Date getPeixunshijian() {
		return peixunshijian;
	}
				
	
	/**
	 * 设置：培训地点
	 */
	 
	public void setPeixundidian(String peixundidian) {
		this.peixundidian = peixundidian;
	}
	
	/**
	 * 获取：培训地点
	 */
	public String getPeixundidian() {
		return peixundidian;
	}
				
	
	/**
	 * 设置：培训内容
	 */
	 
	public void setPeixunneirong(String peixunneirong) {
		this.peixunneirong = peixunneirong;
	}
	
	/**
	 * 获取：培训内容
	 */
	public String getPeixunneirong() {
		return peixunneirong;
	}
				
	
	/**
	 * 设置：培训讲师
	 */
	 
	public void setPeixunjiangshi(String peixunjiangshi) {
		this.peixunjiangshi = peixunjiangshi;
	}
	
	/**
	 * 获取：培训讲师
	 */
	public String getPeixunjiangshi() {
		return peixunjiangshi;
	}
				
	
	/**
	 * 设置：培训对象
	 */
	 
	public void setPeixunduixiang(String peixunduixiang) {
		this.peixunduixiang = peixunduixiang;
	}
	
	/**
	 * 获取：培训对象
	 */
	public String getPeixunduixiang() {
		return peixunduixiang;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
