package cn.ims.ims.demo.service;

import cn.ims.ims.demo.dao.UploadDao;
import cn.ims.ims.demo.entity.po.Interview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;

@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    private UploadDao uploadDao;
    @Override
    public int upload(String username, byte[] file, String filePath, String fileName) {
        //判断上传文件的保存目录是否存在
        File targetFile = new File(filePath);
        if(!targetFile.exists() && !targetFile.isDirectory()){
            System.out.println(filePath+"  目录不存在，需要创建");
            //创建目录
            targetFile.mkdirs();
        }
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(filePath+fileName);
            out.write(file);
            out.flush();
            out.close();
            //将姓名和简历路径存放到数据库中
            String resumePath=filePath+fileName;
            System.out.print(resumePath);
            Interview interview=new Interview();
            interview.setName(username);
            //往数据库中保存文件名
            interview.setResume_path(fileName);
            int i=uploadDao.insertresume(interview);
            System.out.print(i);
            return  i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
