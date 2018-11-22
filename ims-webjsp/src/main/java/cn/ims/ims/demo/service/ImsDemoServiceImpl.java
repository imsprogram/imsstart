package cn.ims.ims.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ims.ims.demo.dao.ImsDemoDao;
import cn.ims.ims.demo.entity.vo.ImsDemoVo;

/**
 * ImsDemoServiceImpl
 * 
 * @author Mr.LiuNeng
 * @date 2018
 */
@Service("imsDemoService")
public class ImsDemoServiceImpl implements ImsDemoService {

    @Autowired
    private ImsDemoDao imsDemoDao;

    @Override
    public int count(ImsDemoVo imsDemoVo) {
        return imsDemoDao.count(imsDemoVo);
    }

    @Override
    public List<ImsDemoVo> list(ImsDemoVo imsDemoVo) {
        return imsDemoDao.list(imsDemoVo);
    }

    @Override
    public ImsDemoVo get(ImsDemoVo imsDemoVo) {
        return imsDemoDao.get(imsDemoVo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int add(ImsDemoVo imsDemoVo) {
        return imsDemoDao.add(imsDemoVo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(ImsDemoVo imsDemoVo) {
        return imsDemoDao.update(imsDemoVo);
    }

    @Override
    public int delete(ImsDemoVo imsDemoVo) {
        imsDemoVo.setIsDel(1);
        return update(imsDemoVo);
    }
}