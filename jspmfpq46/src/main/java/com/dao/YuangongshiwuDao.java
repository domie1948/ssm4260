package com.dao;

import com.entity.YuangongshiwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongshiwuVO;
import com.entity.view.YuangongshiwuView;


/**
 * 员工事务
 * 
 * @author 
 * @email 
 * @date 2021-03-06 15:26:49
 */
public interface YuangongshiwuDao extends BaseMapper<YuangongshiwuEntity> {
	
	List<YuangongshiwuVO> selectListVO(@Param("ew") Wrapper<YuangongshiwuEntity> wrapper);
	
	YuangongshiwuVO selectVO(@Param("ew") Wrapper<YuangongshiwuEntity> wrapper);
	
	List<YuangongshiwuView> selectListView(@Param("ew") Wrapper<YuangongshiwuEntity> wrapper);

	List<YuangongshiwuView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongshiwuEntity> wrapper);
	
	YuangongshiwuView selectView(@Param("ew") Wrapper<YuangongshiwuEntity> wrapper);
	
}
