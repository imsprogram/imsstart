package cn.ims.ims.demo.entity.po;

import java.util.Date;

public class OrderInfo {
    /**
     * 预约id
     */
    private long id;
    /**
     * 预约状态
     */
    private int order_status;
    /**
     * 预约时间
     */
    private String order_time;

    /**
     * 面试者姓名
     */
    private String order_username;
    /**
     * 面试者邮箱
     */
    private String order_email;
    /**
     * 创建时间
     */
    private Date create_time;
    /**
     * 更新时间
     */
    private Date update_time;
    /**
     * 面试者简历id
     */
    private long interview_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getOrder_username() {
        return order_username;
    }

    public void setOrder_username(String order_username) {
        this.order_username = order_username;
    }

    public String getOrder_email() {
        return order_email;
    }

    public void setOrder_email(String order_email) {
        this.order_email = order_email;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public long getInterview_id() {
        return interview_id;
    }

    public void setInterview_id(long interview_id) {
        this.interview_id = interview_id;
    }
}
