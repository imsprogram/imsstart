package cn.ims.controller;

import cn.ims.ims.demo.entity.po.Interview;
import cn.ims.ims.demo.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class InterviewController {
    @Autowired
    private InterviewService interviewService;
    //查询简历
    @RequestMapping("/selectInterView0.do")
    public String selectInterView0(Map map,@RequestParam("id")String id){
        System.out.print("id是："+id);
        String id1=id.substring(0,id.indexOf("?"));
        System.out.print("id1是："+id1);
        List<Interview> list= interviewService.selectInterview0(id1);
        map.put("k",id1);
        map.put("list",list);
        return "resume";
    }
    //hr通过简历
    @RequestMapping("/passInterviewByHr")
    @ResponseBody
    public String passInterviewByHr(Model model,@RequestParam("id")long id){
        boolean result=interviewService.passInterviewByHr(id);
        System.out.print(result);
        if (result){
            return "success";
        }
        return "fail";
    }
    //hr删除简历
    @RequestMapping("/deleteInterviewByHr")
    @ResponseBody
    public String deleteInterviewByHr(Model model,@RequestParam("id")long id){
        boolean result=interviewService.deleteInterviewByHr(id);
        System.out.print(result);
        if (result){
            return "success";
        }
        return "fail";
    }
    /**
     * hr增加备注
     */
    @RequestMapping("/insertNote")
    @ResponseBody
    public String insertNote(@RequestParam("id") long id,@RequestParam("note") String note){
        System.out.print("111111111");
        System.out.print(note+"--"+id);
        Interview interview=new Interview();
        interview.setId(id);
        interview.setNote(note);
        if (interviewService.insertNote(interview)){
            return "success";
        }
        return "fail";
    }
    //Tec查询简历
    @RequestMapping("/selectInterViewByTec.do")
    public String selectInterViewByTec(Map map, @RequestParam("id") String id) {
        System.out.print("id是：" + id);
        String id1 = id.substring(0, id.indexOf("?"));
        System.out.print("id1是：" + id1);

        List<Interview> list1 = interviewService.selectInterviewByTec(id1);
        map.put("k", id1);
        map.put("list", list1);
        return "resume1";
    }
    //Tec通过简历
    @RequestMapping("/passInterviewByTec")
    @ResponseBody
    public String passInterviewByTec(Model model, @RequestParam("id") long id) {
        boolean result = interviewService.passInterviewByTec(id);
        System.out.print(result);
        if (result) {
            return "success";
        }
        return "fail";
    }

    //Tec删除简历
    @RequestMapping("/deleteInterviewByTec")
    @ResponseBody
    public String deleteInterviewByTec(Model model, @RequestParam("id") long id) {
        boolean result = interviewService.deleteInterviewByTec(id);
        System.out.print(result);
        if (result) {
            return "success";
        }
        return "fail";
    }

}
