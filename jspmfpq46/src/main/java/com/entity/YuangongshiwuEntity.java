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
 * 员工事务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-06 15:26:49
 */
@TableName("yuangongshiwu")
public class YuangongshiwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangongshiwuEntity() {
		
	}
	
	public YuangongshiwuEntity(T t) {
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
	 * 事务标题
	 */
					
	private String shiwubiaoti;
	
	/**
	 * 事务类型
	 */
					
	private String shiwuleixing;
	
	/**
	 * 事务备注
	 */
					
	private String shiwubeizhu;
	
	/**
	 * 事务时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shiwushijian;
	
	/**
	 * 事务附件
	 */
					
	private String shiwufujian;
	
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
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：事务标题
	 */
	public void setShiwubiaoti(String shiwubiaoti) {
		this.shiwubiaoti = shiwubiaoti;
	}
	/**
	 * 获取：事务标题
	 */
	public String getShiwubiaoti() {
		return shiwubiaoti;
	}
	/**
	 * 设置：事务类型
	 */
	public void setShiwuleixing(String shiwuleixing) {
		this.shiwuleixing = shiwuleixing;
	}
	/**
	 * 获取：事务类型
	 */
	public String getShiwuleixing() {
		return shiwuleixing;
	}
	/**
	 * 设置：事务备注
	 */
	public void setShiwubeizhu(String shiwubeizhu) {
		this.shiwubeizhu = shiwubeizhu;
	}
	/**
	 * 获取：事务备注
	 */
	public String getShiwubeizhu() {
		return shiwubeizhu;
	}
	/**
	 * 设置：事务时间
	 */
	public void setShiwushijian(Date shiwushijian) {
		this.shiwushijian = shiwushijian;
	}
	/**
	 * 获取：事务时间
	 */
	public Date getShiwushijian() {
		return shiwushijian;
	}
	/**
	 * 设置：事务附件
	 */
	public void setShiwufujian(String shiwufujian) {
		this.shiwufujian = shiwufujian;
	}
	/**
	 * 获取：事务附件
	 */
	public String getShiwufujian() {
		return shiwufujian;
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
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
