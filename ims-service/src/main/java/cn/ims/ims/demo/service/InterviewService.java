package cn.ims.ims.demo.service;

import cn.ims.ims.demo.entity.po.Interview;

import javax.print.DocFlavor;
import java.util.List;

public interface InterviewService {

    /**
     * 查询简历
     */
    public List<Interview> selectInterview0(String id);

    /**
     *hr通过简历
     * @param id 简历id
     * @return
     */
    public boolean passInterviewByHr(long id);

    /**
     *hr删除简历
     * @param id 简历id
     * @return
     */
    public boolean deleteInterviewByHr(long id);
    /**
     * hr增加备注
     *
     */
    public boolean insertNote(Interview interview);


    /**
     * Tec查询简历
     */
    public List<Interview> selectInterviewByTec(String id);

    /**
     *Tec通过简历
     * @param id 简历id
     * @return
     */
    public boolean passInterviewByTec(long id);

    /**
     *Tec删除简历
     * @param id 简历id
     * @return
     */
    public boolean deleteInterviewByTec(long id);

}
