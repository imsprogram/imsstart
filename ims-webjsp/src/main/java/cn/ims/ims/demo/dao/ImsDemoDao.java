package cn.ims.ims.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.ims.base.BaseDao;
import cn.ims.ims.demo.entity.vo.ImsDemoVo;

/**
 * ImsDemoDao
 * 
 * @author Mr.LiuNeng
 * @date 2018
 */
@Repository
public interface ImsDemoDao extends BaseDao<ImsDemoVo, ImsDemoVo> {
    List<ImsDemoVo> list(ImsDemoVo imsDemoVo);
}