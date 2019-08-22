package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.dao.ProviderDao;
import com.mengxuegu.springboot.entities.Provider;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: sxy
 * @Date: 2019/5/31 12:59
 * @Version 1.0
 */
@Controller
public class ProviderController {
    Logger logger = LoggerFactory.getLogger(ProviderController.class);
    @Autowired
    ProviderDao providerDao;

    //@RequestMapping(value = "/providers",method = RequestMethod.GET)
    //获取提供商列表
    @GetMapping("/providers")
    public ModelAndView list(@RequestParam(value = "providerName",required = false) String providerName){
        logger.info("查询供应商列表。。。。。。"+providerName);
        ModelAndView view=new ModelAndView("provider/list");
        Collection<Provider> providers = providerDao.getAll(providerName);
        view.addObject("providers",providers);
        view.addObject("providerName",providerName);
        //在classpath:/templates/  所以返回值不需要加/
        return view;
    }

    /**
     * 传递了type的值，就跳转到update页面，没有传递type的值，就默认跳转到view页面
     * @param pid
     * @param type
     * @param map
     * @return
     */
    @GetMapping("/provider/{pid}")
    public String view(@PathVariable("pid") Integer pid,
                       @RequestParam(value="type",defaultValue = "view") String type,
                       Map<String,Object> map){
        logger.info("查询供应商的详细信息");
        Provider provider = providerDao.getProvider(pid);
        map.put("provider",provider);
        return "provider/"+type;
    }

    /**
     * 修改供应商信息
     * @param provider
     * @return
     */
    @PutMapping("/provider")
    public String update(Provider provider){
        logger.info("开始执行更新操作");
        providerDao.save(provider);
        return "redirect:providers";
    }

    /**
     * 前往添加页面
     * @return
     */
    @GetMapping("/provider")
    public String toAddPage(){
        return "provider/add";
    }

    /**
     * 添加供应商
     * @param provider
     * @return
     */
    @PostMapping("/provider")
    public String add(Provider provider){
        logger.info("添加供应商信息"+provider);
        providerDao.save(provider);
        return "redirect:providers";
    }

    /**
     * 删除某个供应商
     * @param pid
     * @return
     */
    @DeleteMapping("/provider/{pid}")
    public String delete(@PathVariable("pid") Integer pid){
        logger.info("删除操作"+pid);
        providerDao.delete(pid);
        return "redirect:/providers";
    }
}
