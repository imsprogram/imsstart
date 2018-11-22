package cn.ims.ims.demo.service;

import java.util.List;

import cn.ims.ims.demo.entity.vo.ImsDemoVo;

/**
 * ImsDemoService
 *
 * @author Mr.LiuNeng
 * @date 2018
 */
public interface ImsDemoService {

    /**
     * 统计总数
     * 
     * @param imsDemoVo
     * @return
     */
    public int count(ImsDemoVo imsDemoVo);

    /**
     * 查询列表
     * 
     * @param imsDemoVo
     * @return
     */
    public List<ImsDemoVo> list(ImsDemoVo imsDemoVo);

    /**
     * 查询单条
     * 
     * @param imsDemoVo
     * @return
     */
    public ImsDemoVo get(ImsDemoVo imsDemoVo);

    /**
     * 新增
     * 
     * @param imsDemoVo
     * @return
     */
    public int add(ImsDemoVo imsDemoVo);

    /**
     * 修改
     * 
     * @param imsDemoVo
     * @return
     */
    public int update(ImsDemoVo imsDemoVo);

    /**
     * 逻辑删除
     * 
     * @param imsDemoVo
     * @return
     */
    public int delete(ImsDemoVo imsDemoVo);
}