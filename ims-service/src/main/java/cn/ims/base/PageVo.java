package cn.ims.base;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("rawtypes")
public class PageVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 总条数
     */
    private long count;
    /**
     * 总页数
     */
    private long totalPage;
    /**
     * 数据
     */
    private List list;

    public PageVo(long pageSize, long count, List list) {
        this.count = count;
        this.totalPage = count / pageSize + (count % pageSize == 0 ? 0 : 1);
        this.list = list;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

}
