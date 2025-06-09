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
 * 奖惩信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-06 15:26:49
 */
@TableName("jiangchengxinxi")
public class JiangchengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiangchengxinxiEntity() {
		
	}
	
	public JiangchengxinxiEntity(T t) {
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
	 * 奖惩名称
	 */
					
	private String jiangchengmingcheng;
	
	/**
	 * 奖惩类型
	 */
					
	private String jiangchengleixing;
	
	/**
	 * 奖惩内容
	 */
					
	private String jiangchengneirong;
	
	/**
	 * 员工工号
	 */
					
	private String yuangonggonghao;
	
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 职位
	 */
					
	private String zhiwei;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：奖惩名称
	 */
	public void setJiangchengmingcheng(String jiangchengmingcheng) {
		this.jiangchengmingcheng = jiangchengmingcheng;
	}
	/**
	 * 获取：奖惩名称
	 */
	public String getJiangchengmingcheng() {
		return jiangchengmingcheng;
	}
	/**
	 * 设置：奖惩类型
	 */
	public void setJiangchengleixing(String jiangchengleixing) {
		this.jiangchengleixing = jiangchengleixing;
	}
	/**
	 * 获取：奖惩类型
	 */
	public String getJiangchengleixing() {
		return jiangchengleixing;
	}
	/**
	 * 设置：奖惩内容
	 */
	public void setJiangchengneirong(String jiangchengneirong) {
		this.jiangchengneirong = jiangchengneirong;
	}
	/**
	 * 获取：奖惩内容
	 */
	public String getJiangchengneirong() {
		return jiangchengneirong;
	}
	/**
	 * 设置：员工工号
	 */
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
	/**
	 * 设置：员工姓名
	 */
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：部门
	 */
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
	/**
	 * 设置：职位
	 */
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
