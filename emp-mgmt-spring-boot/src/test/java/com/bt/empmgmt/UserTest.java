package com.bt.empmgmt;

import com.bt.empmgmt.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UserTest {


    @Test
    public void testUserConstructor(){
        User user = new User();
        Assert.assertNull(user.getPassword());
        Assert.assertNull(user.getRoles());
        Assert.assertNull(user.getUserId());
        Assert.assertNull(user.getUserName());

    }

    @Test
    public void testUserConstructorWithValidValues(){
        User user = new User();
        user.setUserName("Kiran");
        user.setPassword("welcome");
        Assert.assertNotNull(user.getPassword());
        Assert.assertNotNull(user.getUserName());
        Assert.assertEquals(user.getUserName(), "Kiran");
        Assert.assertEquals(user.getPassword(), "welcome");

    }
}