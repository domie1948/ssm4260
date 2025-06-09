package com.entity.view;

import com.entity.ZhiweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 职位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 15:26:49
 */
@TableName("zhiwei")
public class ZhiweiView  extends ZhiweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiweiView(){
	}
 
 	public ZhiweiView(ZhiweiEntity zhiweiEntity){
 	try {
			BeanUtils.copyProperties(this, zhiweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
