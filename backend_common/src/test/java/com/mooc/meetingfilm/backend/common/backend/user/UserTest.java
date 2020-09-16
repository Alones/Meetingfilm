package com.mooc.meetingfilm.backend.common.backend.user;

import com.mooc.meetingfilm.backend.common.dao.entity.MoocBackendUserT;
import com.mooc.meetingfilm.backend.common.dao.mapper.MoocBackendUserTMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UserTest {

    @Resource
    private MoocBackendUserTMapper userTMapper;

    @Test
    public void add(){
        MoocBackendUserT user= new MoocBackendUserT();
        user.setUserName("admin1");
        user.setUserPwd("admin1");
        user.setUserPhone("13100000001");
        userTMapper.insert(user);

    }

    @Test
    public void all(){
        MoocBackendUserT user= new MoocBackendUserT();
        List<MoocBackendUserT> selectList = userTMapper.selectList(null);
        selectList.forEach(System.out::println);
    }

    @Test
    public void update(){
        MoocBackendUserT user= new MoocBackendUserT();
        user.setUuid(2);
        user.setUserName("admin");
        user.setUserPwd("cc");
        user.setUserPhone("12300000000");
        userTMapper.updateById(user);
    }

    @Test
    public void del(){
        userTMapper.deleteById(2);
    }

    @Test
    public void userName(){
        MoocBackendUserT user = userTMapper.userName("admin");
        System.out.println(user.toString());
    }
}
