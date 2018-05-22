package com.dsef.swagger.swaggertest;

/**
 * created by DSEF on 2018/5/17.
 **/

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

/**
 * 一个用来测试swagger注解的控制器
 * 注意@ApiImplicitParam的使用会影响程序运行，如果使用不当可能造成控制器收不到消息
 *
 * @author SUNF
 */
@RestController
@RequestMapping("/say")
@Api(value = "SayController|一个用来测试swagger注解的控制器")
public class SayController {


    private  List<String> idList = new LinkedList<>();

    @ResponseBody
    @RequestMapping(value ="/GetUserName", method= RequestMethod.GET)
    @ApiOperation(value="根据用户编号获取用户姓名", notes="用户名")
    //@ApiImplicitParam(paramType="query", name = "userNumber", value = "用户编号", required = true, dataType = "Integer")
    public String getUserName(@RequestParam Integer userNumber) {
        idList.add("灭霸");
        idList.add("钢铁侠");
        idList.add("美国队长");
        idList.add("雷神");
        idList.add("黑寡妇");
        idList.add("绿巨人");
        idList.add("黑豹");
        idList.add("冬兵");
        idList.add("洛基");
        idList.add("蜘蛛侠");
        idList.add("幻视");
        idList.add("绯红女巫");
        idList.add("奇异博士");

        if (userNumber<0 ||userNumber>idList.size())
        {
            return "error";
        }
        return idList.get(userNumber);
    }

    @ResponseBody
    @RequestMapping(value ="/addUserName", method= RequestMethod.PUT)
    @ApiOperation(value="增加用户", notes="用户名")
    public String addUserName(@RequestParam String[] users) {
        for (String I:users) {
            System.out.print(I+"-");
        }
        return "ok";
    }

    @ResponseBody
    @RequestMapping(value ="/updatePassword", method= RequestMethod.POST)
    @ApiOperation(value="修改用户密码", notes="根据用户id修改密码")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "password", value = "旧密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "newPassword", value = "新密码", required = true, dataType = "String")
    })
    public String updatePassword(@RequestParam(value="userId") Integer userId, @RequestParam(value="password") String password,
                                 @RequestParam(value="newPassword") String newPassword){
        if(userId <= 0 || userId > idList.size()){
            return "未知的用户";
        }
        if(StringUtils.isEmpty(password) || StringUtils.isEmpty(newPassword)){
            return "密码不能为空";
        }
        if(password.equals(newPassword)){
            return "新旧密码不能相同";
        }
        return "密码修改成功!";
    }

    @ResponseBody
    @RequestMapping(value ="/deleteUserName", method= RequestMethod.DELETE)
    @ApiOperation(value="根据用户名删除用户", notes="删除用户")
    public String Delete(@RequestParam Integer usernumber){
        idList.remove(usernumber);
        for (String i:idList) {
            System.out.println(i);
        }
        return "删除成功" ;
    }
}

