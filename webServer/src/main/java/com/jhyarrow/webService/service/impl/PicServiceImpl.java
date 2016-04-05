package com.jhyarrow.webService.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jhyarrow.webService.dao.PicMapper;
import com.jhyarrow.webService.entity.PicEntity;
import com.jhyarrow.webService.service.PicService;

@Service("picService")
public class PicServiceImpl implements PicService{

	@Resource
	private PicMapper picMapper;
	
	public PicEntity getPicById(String picId) {
		return this.picMapper.getPicById(picId);
	}

}
