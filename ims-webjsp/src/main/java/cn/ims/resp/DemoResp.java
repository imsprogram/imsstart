package cn.ims.resp;

public class DemoResp {

    /**
     * 返回数据
     */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DemoResp [id=" + id + "]";
    }

}
