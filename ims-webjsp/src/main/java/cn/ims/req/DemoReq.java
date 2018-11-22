package cn.ims.req;

public class DemoReq {

    /**
     * 主键id
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
        return "DemoReq [id=" + id + "]";
    }

}
