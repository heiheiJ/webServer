package com.jhyarrow.webService.dao;

import com.jhyarrow.webService.entity.PicEntity;

public interface PicMapper extends BaseMapper{
	PicEntity getPicById(String picId);
}
