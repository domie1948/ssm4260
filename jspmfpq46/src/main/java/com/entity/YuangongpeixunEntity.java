package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 员工培训
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-06 15:26:49
 */
@TableName("yuangongpeixun")
public class YuangongpeixunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangongpeixunEntity() {
		
	}
	
	public YuangongpeixunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 培训名称
	 */
					
	private String peixunmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：培训名称
	 */
	public void setPeixunmingcheng(String peixunmingcheng) {
		this.peixunmingcheng = peixunmingcheng;
	}
	/**
	 * 获取：培训名称
	 */
	public String getPeixunmingcheng() {
		return peixunmingcheng;
	}
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
