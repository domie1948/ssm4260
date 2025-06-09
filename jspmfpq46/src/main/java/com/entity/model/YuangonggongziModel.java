package com.entity.model;

import com.entity.YuangonggongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 员工工资
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-06 15:26:49
 */
public class YuangonggongziModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
