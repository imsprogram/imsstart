package cn.ims.base;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 是否分页
     */
    private int usePage = 0;
    /**
     * 当前多少页
     */
    private long page = 10L;
    /**
     * 每页多少条
     */
    private long pageSize;
    /**
     * 从第几页开始
     */
    private long start;

    /**
     * 开始日期
     */
    private String startDate;
    /**
     * 结束日期
     */
    private String endDate;

    /**
     * 判断是否需要分页
     * 
     * @return
     */
    public boolean usePage() {
        if (0 == usePage) {
            return false;
        }
        return true;
    }

    public int getUsePage() {
        return usePage;
    }

    public void setUsePage(int usePage) {
        this.usePage = usePage;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
