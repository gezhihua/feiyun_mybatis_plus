package com.yunfei.mp.controller;

import com.yunfei.mp.common.annotation.UserLoginToken;
import com.yunfei.mp.common.exception.ExceptionMsg;
import com.yunfei.mp.common.result.ResponseData;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.entity.AccountEntity;
import com.yunfei.mp.service.IAccountService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 账号表 
 *
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:52
 */
@RestController
@RequestMapping("/account")
public class AccountController extends BaseController{
    @Autowired
    private IAccountService accountService;

    /**
     * 列表
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseData list(@RequestParam Map<String, Object> params){

        try {
            if (params!= null && params.size() >0){
                PageUtils page = accountService.queryPage(params);
                return new ResponseData(ExceptionMsg.SUCCESS, page);
            }else {
                return new ResponseData(ExceptionMsg.FAILED, "传递参数异常");
            }

        } catch (Exception e) {
            logger.error("获取账号信息：",e);
            return new ResponseData(ExceptionMsg.FAILED, "获取账号异常");
        }
    }


    /**
     * 信息
     */
    @UserLoginToken
    @RequestMapping(value = "/info/{objectId}",  method = RequestMethod.POST)
    public ResponseData info(@PathVariable("objectId") String objectId){
        if (StringUtils.isNotBlank(objectId)){

            AccountEntity account = accountService.selectById(objectId);
            return new ResponseData(ExceptionMsg.SUCCESS, account);
        }else {
            logger.error("获取账号信息：",objectId);
            return new ResponseData(ExceptionMsg.FAILED, "获取账号异常");
        }
    }

    /**
     * 保存
     */
    @RequestMapping(value = "/save",  method = RequestMethod.POST)
    public ResponseData save(@RequestBody AccountEntity account){
        if (account!=null){
            boolean ok = accountService.insert(account);
            if (ok)
                return new ResponseData(ExceptionMsg.SUCCESS, account);
            else
                return new ResponseData(ExceptionMsg.FAILED, "保存账号异常");
        }else {
            return new ResponseData(ExceptionMsg.FAILED, "获取账号异常");
        }
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update",  method = RequestMethod.POST)
    public ResponseData update(@RequestBody AccountEntity account){
        if (account!=null){
            boolean ok = accountService.updateById(account);
            if (ok)
                return new ResponseData(ExceptionMsg.SUCCESS, account);
            else
                return new ResponseData(ExceptionMsg.FAILED, "保存账号异常");
        }else {
            return new ResponseData(ExceptionMsg.FAILED, "获取账号异常");
        }
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete",  method = RequestMethod.POST)
    public ResponseData delete(@RequestBody String[] objectIds){
        if (objectIds!=null && objectIds.length > 0){
            boolean ok = accountService.deleteBatchIds(Arrays.asList(objectIds));
            if (ok)
                return new ResponseData(ExceptionMsg.SUCCESS, objectIds);
            else
                return new ResponseData(ExceptionMsg.FAILED, "保存账号异常");
        }else {
            return new ResponseData(ExceptionMsg.FAILED, "获取账号异常");
        }
    }

}
