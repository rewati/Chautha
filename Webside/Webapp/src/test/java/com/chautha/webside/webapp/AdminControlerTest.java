package com.chautha.webside.webapp;

import com.chautha.services.UserServices;
import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.createStrictMock;
import static org.easymock.EasyMock.expectLastCall;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.*;

public class AdminControlerTest {

    AdminControler adminControler;
    UserServices userServices;

    @Before
    public void setup(){
        adminControler = new AdminControler();
        userServices = createStrictMock(UserServices.class);
        adminControler.setUserServices(userServices);
    }

    @Test
    public void testTestMethod() throws Exception {
        userServices.saveUser(null);
        expectLastCall().once();
        replay(userServices);
        adminControler.testMethod();

    }
}