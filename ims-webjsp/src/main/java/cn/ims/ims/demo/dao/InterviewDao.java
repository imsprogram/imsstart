package cn.ims.ims.demo.dao;

import cn.ims.ims.demo.entity.po.Interview;

import java.util.List;

public interface InterviewDao {
    /**
     * 查询简历
     */
    public List<Interview> selectInterview0(String id);

    /**
     * hr通过简历
     * @param id 简历id
     * @return
     */
    public int passInterviewByHr(long id);

    /**
     * hr删除简历
     * @param id 简历id
     * @return
     */
    public int deleteInterviewByHr(long id);
    /**
     * hr增加备注
     */
    public int insertNote(Interview interview);




    /**
     * Tec查询简历
     */
    public List<Interview> selectInterviewByTec(String id);

    /**
     * Tec通过简历
     * @param id  简历id
     * @return
     */
    public int passInterviewByTec(long id);

    /**
     * Tec删除简历
     * @param id 简历id
     * @return
     */
    public int deleteInterviewByTec(long id);
}
