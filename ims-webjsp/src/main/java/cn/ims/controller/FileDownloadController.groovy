package cn.ims.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Controller
public class FileDownloadController {
    @RequestMapping("/download")
    public void download(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {

        //得到要下载的文件名
        String fileName = URLDecoder.decode(request.getParameter("resumename"),"utf-8");
        //fileName = new String(fileName.getBytes("iso8859-1"),"UTF-8");

        //上传的文件都是保存在D:\fileupload\目录下的子目录当中
        String fileSaveRootPath="G:\\fileupload\\";
        System.out.println(URLDecoder.decode(request.getParameter("resumename"),"utf-8"));
        //通过文件名找出文件的所在目录
        //String path = findFileSavePathByFileName(fileName,fileSaveRootPath);
        //String path = fileSaveRootPath;
        //得到要下载的文件
        File file = new File(fileSaveRootPath + "\\" + fileName);
        //如果文件不存在
        if(!file.exists()){
            request.setAttribute("message", "您要下载的资源已被删除！！");
        }
        //处理文件名
        String realname = fileName.substring(fileName.indexOf("_")+1);

        //如果文件名有中文的话，进行URL编码，让中文正常显示
        response.addHeader("Content-Disposition",
                "attachment; filename=" + new String(fileName.getBytes("UTF-8"), "iso-8859-1"));

        //读取要下载的文件，保存到文件输入流
        FileInputStream fis = new FileInputStream(fileSaveRootPath + "\\" + fileName);
        //创建输出流
        OutputStream out = response.getOutputStream();
        //创建缓冲区
        byte[] buffer = new byte[1024];
        int len = 0;
        //循环将输入流中的内容读取到缓冲区当中
        while((len=fis.read(buffer))>0){
        //输出缓冲区的内容到浏览器，实现文件下载
            out.write(buffer, 0, len);
        }
        //关闭文件输入流
        fis.close();
        //关闭输出流
        out.close();
    }
}
