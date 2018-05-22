package com.dsef.swagger.Controller;


import com.dsef.swagger.Service.ServiceTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import static com.dsef.swagger.Repository.RepositoryTest.namelist;

/**
 * created by DSEF on 2018/5/22.
 * 注意@ApiImplicitParam的使用会影响程序运行，如果使用不当可能造成控制器收不到消息
 * @author DSEF
 */
@RestController
@RequestMapping("/List")
@Api(value = "Controller|三层结构控制器")
public class ControllerTest {

    @Autowired
    ServiceTest ServiceTest;

    @RequestMapping(value = "/GetUserName", method = RequestMethod.GET)
    @ApiOperation(value = "根据用户编号获取用户姓名", notes = "用户名")
    @ApiImplicitParams({

    })

    public List<String> getUserName(@RequestParam String userNumber)
    {
        ServiceTest.add(userNumber);
        return namelist;
    }
}