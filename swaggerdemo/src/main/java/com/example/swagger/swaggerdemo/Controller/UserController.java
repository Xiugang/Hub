package com.example.swagger.swaggerdemo.Controller;

import com.example.swagger.swaggerdemo.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import static com.example.swagger.swaggerdemo.Repository.impl.UserRepositoryImpl.Namelist;

/**
 * created by DSEF on 2018/5/23.
 **/
@RestController
@RequestMapping("/swagger")
@Api(value = "三层结构的测试")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value ="/AddName", method= RequestMethod.PUT)
    @ApiOperation(value="输入姓名并可以进行添加", notes="一次只能添加一个名字")
    @ApiImplicitParams({
    })

    public String AddName(@RequestParam(value ="AddName") String name) {
        userService.Addname(name);
        if (Namelist.contains((name)))
        {
            return "增加成功";
        }else{
            return "增加失败";
        }
    }

    @RequestMapping(value ="/DeleteName", method= RequestMethod.DELETE)
    @ApiOperation(value="删除姓名", notes="一次只能删除一个名字")
    @ApiImplicitParams({
    })

    public String DeleteName(@RequestParam(value ="DeleteName") String name1) {
        if (Namelist.contains(name1))
        {
            userService.Deletename(name1);
            return "DeleteName Success";
        }else {
            return "DeleteName failed";
        }
    }

    @RequestMapping(value ="/SearchName", method= RequestMethod.GET)
    @ApiOperation(value="查找姓名", notes="看到现在里面所有的名字")
    @ApiImplicitParams({
    })

    public List<String> SearchName() {
        return Namelist;
    }
}