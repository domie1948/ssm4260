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
 * 员工工资
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-06 15:26:49
 */
@TableName("yuangonggongzi")
public class YuangonggongziEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangonggongziEntity() {
		
	}
	
	public YuangonggongziEntity(T t) {
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
	 * 工资月份
	 */
					
	private String gongziyuefen;
	
	/**
	 * 员工工号
	 */
					
	private String yuangonggonghao;
	
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 职位
	 */
					
	private String zhiwei;
	
	/**
	 * 底薪
	 */
					
	private Integer dixin;
	
	/**
	 * 绩效
	 */
					
	private Integer jixiao;
	
	/**
	 * 岗位补贴
	 */
					
	private Integer gangweibutie;
	
	/**
	 * 全勤奖
	 */
					
	private Integer quanqinjiang;
	
	/**
	 * 加班费
	 */
					
	private Integer jiabanfei;
	
	/**
	 * 扣绩效
	 */
					
	private Integer koujixiao;
	
	/**
	 * 其它扣款
	 */
					
	private Integer qitakoukuan;
	
	/**
	 * 扣五险一金
	 */
					
	private Integer kouwuxianyijin;
	
	/**
	 * 实发工资
	 */
					
	private String shifagongzi;
	
	/**
	 * 工资备注
	 */
					
	private String gongzibeizhu;
	
	
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
	 * 设置：工资月份
	 */
	public void setGongziyuefen(String gongziyuefen) {
		this.gongziyuefen = gongziyuefen;
	}
	/**
	 * 获取：工资月份
	 */
	public String getGongziyuefen() {
		return gongziyuefen;
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
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
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
	 * 设置：底薪
	 */
	public void setDixin(Integer dixin) {
		this.dixin = dixin;
	}
	/**
	 * 获取：底薪
	 */
	public Integer getDixin() {
		return dixin;
	}
	/**
	 * 设置：绩效
	 */
	public void setJixiao(Integer jixiao) {
		this.jixiao = jixiao;
	}
	/**
	 * 获取：绩效
	 */
	public Integer getJixiao() {
		return jixiao;
	}
	/**
	 * 设置：岗位补贴
	 */
	public void setGangweibutie(Integer gangweibutie) {
		this.gangweibutie = gangweibutie;
	}
	/**
	 * 获取：岗位补贴
	 */
	public Integer getGangweibutie() {
		return gangweibutie;
	}
	/**
	 * 设置：全勤奖
	 */
	public void setQuanqinjiang(Integer quanqinjiang) {
		this.quanqinjiang = quanqinjiang;
	}
	/**
	 * 获取：全勤奖
	 */
	public Integer getQuanqinjiang() {
		return quanqinjiang;
	}
	/**
	 * 设置：加班费
	 */
	public void setJiabanfei(Integer jiabanfei) {
		this.jiabanfei = jiabanfei;
	}
	/**
	 * 获取：加班费
	 */
	public Integer getJiabanfei() {
		return jiabanfei;
	}
	/**
	 * 设置：扣绩效
	 */
	public void setKoujixiao(Integer koujixiao) {
		this.koujixiao = koujixiao;
	}
	/**
	 * 获取：扣绩效
	 */
	public Integer getKoujixiao() {
		return koujixiao;
	}
	/**
	 * 设置：其它扣款
	 */
	public void setQitakoukuan(Integer qitakoukuan) {
		this.qitakoukuan = qitakoukuan;
	}
	/**
	 * 获取：其它扣款
	 */
	public Integer getQitakoukuan() {
		return qitakoukuan;
	}
	/**
	 * 设置：扣五险一金
	 */
	public void setKouwuxianyijin(Integer kouwuxianyijin) {
		this.kouwuxianyijin = kouwuxianyijin;
	}
	/**
	 * 获取：扣五险一金
	 */
	public Integer getKouwuxianyijin() {
		return kouwuxianyijin;
	}
	/**
	 * 设置：实发工资
	 */
	public void setShifagongzi(String shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	/**
	 * 获取：实发工资
	 */
	public String getShifagongzi() {
		return shifagongzi;
	}
	/**
	 * 设置：工资备注
	 */
	public void setGongzibeizhu(String gongzibeizhu) {
		this.gongzibeizhu = gongzibeizhu;
	}
	/**
	 * 获取：工资备注
	 */
	public String getGongzibeizhu() {
		return gongzibeizhu;
	}

}
