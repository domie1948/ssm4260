package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuangongshiwuDao;
import com.entity.YuangongshiwuEntity;
import com.service.YuangongshiwuService;
import com.entity.vo.YuangongshiwuVO;
import com.entity.view.YuangongshiwuView;

@Service("yuangongshiwuService")
public class YuangongshiwuServiceImpl extends ServiceImpl<YuangongshiwuDao, YuangongshiwuEntity> implements YuangongshiwuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongshiwuEntity> page = this.selectPage(
                new Query<YuangongshiwuEntity>(params).getPage(),
                new EntityWrapper<YuangongshiwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongshiwuEntity> wrapper) {
		  Page<YuangongshiwuView> page =new Query<YuangongshiwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongshiwuVO> selectListVO(Wrapper<YuangongshiwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongshiwuVO selectVO(Wrapper<YuangongshiwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongshiwuView> selectListView(Wrapper<YuangongshiwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongshiwuView selectView(Wrapper<YuangongshiwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
