package com.ch.stornet.modules.stornet.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ch.stornet.modules.stornet.entity.SnMgmtGenaccRecEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * StorNetCloud总帐流水表
 * 
 * @author hengcao
 * @email "1248246000@qq.com"
 * @date 2019-01-15 15:57:42
 */
@Mapper
public interface SnMgmtGenaccRecDao extends BaseMapper<SnMgmtGenaccRecEntity> {
    int insertSelective(SnMgmtGenaccRecEntity record);
}
