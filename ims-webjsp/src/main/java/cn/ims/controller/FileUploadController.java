package cn.ims.controller;

import cn.ims.ims.demo.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class FileUploadController {

    @Autowired
    private UploadService uploadService;
    /**
     * 文件上传
     * @param model
     * @param request
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public String upload(Model model, HttpServletRequest request, @RequestParam("file") MultipartFile file) {

        String name = request.getParameter("name");
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        //设置允许上传文件类型
        String suffixList = "doc,docx,pdf";
        // 获取文件后缀
        String suffix = fileName.substring(fileName.lastIndexOf(".")
                + 1, fileName.length());
        if (suffixList.contains(suffix.trim().toLowerCase())) {
            //String filePath = request.getSession().getServletContext().getRealPath("upload-dir/");
            String filePath = "F:\\fileupload\\";//固定保存路径
            File fileP = new File(filePath);
            try {
                uploadService.upload(name, file.getBytes(), filePath, fileName);
                model.addAttribute("message", "0");
            } catch (Exception e) {
                e.printStackTrace();
                model.addAttribute("message", "1");
            }
        } else {
            model.addAttribute("message", "2");
        }
        return "uploadresume";
    }
}
