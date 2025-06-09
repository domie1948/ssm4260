package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongshiwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongshiwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongshiwuView;


/**
 * 员工事务
 *
 * @author 
 * @email 
 * @date 2021-03-06 15:26:49
 */
public interface YuangongshiwuService extends IService<YuangongshiwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongshiwuVO> selectListVO(Wrapper<YuangongshiwuEntity> wrapper);
   	
   	YuangongshiwuVO selectVO(@Param("ew") Wrapper<YuangongshiwuEntity> wrapper);
   	
   	List<YuangongshiwuView> selectListView(Wrapper<YuangongshiwuEntity> wrapper);
   	
   	YuangongshiwuView selectView(@Param("ew") Wrapper<YuangongshiwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongshiwuEntity> wrapper);
   	
}

