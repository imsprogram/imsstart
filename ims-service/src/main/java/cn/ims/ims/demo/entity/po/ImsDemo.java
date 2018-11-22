package cn.ims.ims.demo.entity.po;

import cn.ims.base.BaseEntity;

/**
 * ImsDemo
 *
 * @author Mr.LiuNeng
 * @date 2018
 */
public class ImsDemo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private java.lang.Long id;

    /**
     * 创建人
     */
    private java.lang.Long createBy;

    /**
     * 创建时间
     */
    private java.util.Date createOn;

    /**
     * updateBy
     */
    private java.lang.Long updateBy;

    /**
     * 修改时间
     */
    private java.util.Date updateOn;

    /**
     * isDel
     */
    private Integer isDel;

    public java.lang.Long getId() {
        return id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(java.lang.Long createBy) {
        this.createBy = createBy;
    }

    public java.util.Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(java.util.Date createOn) {
        this.createOn = createOn;
    }

    public java.lang.Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(java.lang.Long updateBy) {
        this.updateBy = updateBy;
    }

    public java.util.Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(java.util.Date updateOn) {
        this.updateOn = updateOn;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "ImsDemo [id=" + id + ", createBy=" + createBy + ", createOn=" + createOn + ", updateBy=" + updateBy
            + ", updateOn=" + updateOn + ", isDel=" + isDel + "]";
    }

}