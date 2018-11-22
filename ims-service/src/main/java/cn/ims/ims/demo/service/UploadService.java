package cn.ims.ims.demo.service;

public interface UploadService {

    /**
     * 文件上传功能
     * @param username 姓名
     * @param file 文件
     * @param filePath 文件保存路径
     * @param fileName  文件名
     */

    public int  upload(String username,  byte[] file, String filePath, String fileName) ;
}
