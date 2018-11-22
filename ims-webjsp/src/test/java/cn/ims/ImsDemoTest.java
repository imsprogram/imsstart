package cn.ims;

import cn.ims.base.PageVo;
import cn.ims.ims.demo.entity.vo.ImsDemoVo;
import cn.ims.ims.demo.service.ImsDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ImsDemoTest {
    @Autowired
    private ImsDemoService imsDemoService;

    /**
     * 查询测试
     */
    @Test
    public void get() {
        ImsDemoVo imsDemoVo = new ImsDemoVo();
        imsDemoVo.setId(1L);
        ImsDemoVo result = imsDemoService.get(imsDemoVo);
        System.out.println(result);
    }

    /**
     * 列表查询测试
     */
    @Test
    public void list() {
        ImsDemoVo imsDemoVo = new ImsDemoVo();
        List<ImsDemoVo> list = imsDemoService.list(imsDemoVo);

        if (imsDemoVo.usePage()) {
            int count = imsDemoService.count(imsDemoVo);
            System.out.println(new PageVo(imsDemoVo.getPageSize(), count, list));
        }
        System.out.println(list);
    }

    /**
     * 新增测试
     */
    @Test
    public void add() {
        ImsDemoVo imsDemoVo = new ImsDemoVo();
        imsDemoService.add(imsDemoVo);
        System.out.println(imsDemoVo);
    }

    /**
     * 删除测试
     */
    @Test
    public void delete() {
        ImsDemoVo imsDemoVo = new ImsDemoVo();
        imsDemoVo.setId(1L);
        imsDemoService.delete(imsDemoVo);
    }

    /**
     * 更新测试
     */
    @Test
    public void update() {
        ImsDemoVo imsDemoVo = new ImsDemoVo();
        imsDemoVo.setId(1L);
        imsDemoVo.setUpdateBy(999L);
        imsDemoService.update(imsDemoVo);
    }

}
