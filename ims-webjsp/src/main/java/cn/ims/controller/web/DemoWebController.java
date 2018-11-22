package cn.ims.controller.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.ims.base.APIResponse;
import cn.ims.base.ApiResultCode;
import cn.ims.constants.UriConstants;
import cn.ims.ims.demo.entity.vo.ImsDemoVo;
import cn.ims.ims.demo.service.ImsDemoService;
import cn.ims.req.DemoReq;

@RestController
public class DemoWebController {
    private static Logger logger = LoggerFactory.getLogger(DemoWebController.class);

    @Autowired
    private ImsDemoService imsDemoService;

    /**
     * 
     * @param demoReq
     * @return
     */
    @PostMapping(UriConstants.WEB_DEMO_URI)
    public APIResponse demo(@RequestBody DemoReq demoReq) {
        try {

            ImsDemoVo imsDemoVo = new ImsDemoVo();
            imsDemoVo.setId(demoReq.getId());
            List<ImsDemoVo> list = imsDemoService.list(imsDemoVo);

            return new APIResponse(list);
        } catch (Exception e) {
            logger.error("system error: ", e);
            return new APIResponse(ApiResultCode.SYSTEM_ERROR);
        }
    }
}
