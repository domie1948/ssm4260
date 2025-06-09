package com.entity.view;

import com.entity.YuangongshiwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工事务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 15:26:49
 */
@TableName("yuangongshiwu")
public class YuangongshiwuView  extends YuangongshiwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongshiwuView(){
	}
 
 	public YuangongshiwuView(YuangongshiwuEntity yuangongshiwuEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongshiwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
