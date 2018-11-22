package cn.ims.ims.demo.dao;

import cn.ims.ims.demo.entity.po.Interview;

public interface UploadDao {

    /**
     *将面试者姓名和文件路径存放到数据库中
     */
    public int insertresume(Interview interview);
}
