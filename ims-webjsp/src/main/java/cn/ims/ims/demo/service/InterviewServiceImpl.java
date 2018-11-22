package cn.ims.ims.demo.service;



import cn.ims.ims.demo.dao.InterviewDao;
import cn.ims.ims.demo.entity.po.Interview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InterviewServiceImpl implements InterviewService {

    @Autowired
    private InterviewDao interviewDao;
    @Override
    public List<Interview> selectInterview0(String id) {
        List<Interview> list=interviewDao.selectInterview0(id);
        return list;
    }

    @Override
    public boolean passInterviewByHr(long id) {
        int i=interviewDao.passInterviewByHr(id);
         if(i == 1){
             return  true;
         }
        return false;
    }

    @Override
    public boolean deleteInterviewByHr(long id) {
        int i=interviewDao.deleteInterviewByHr(id);
        if(i == 1){
            return  true;
        }
        return false;
    }

    @Override
    public boolean insertNote(Interview interview) {
        int i=interviewDao.insertNote(interview);
        if (i==1){
            return true;
        }
        return false;
    }

    @Override
    public List<Interview> selectInterviewByTec(String id) {
        List<Interview> list=interviewDao.selectInterviewByTec(id);
        return list;
    }

    @Override
    public boolean passInterviewByTec(long id) {
        int i=interviewDao.passInterviewByTec(id);
        if(i == 1) return true;
        return false;
    }

    @Override
    public boolean deleteInterviewByTec(long id) {
        int i=interviewDao.deleteInterviewByTec(id);
        if(i == 1){
            return  true;
        }
        return false;
    }

}
