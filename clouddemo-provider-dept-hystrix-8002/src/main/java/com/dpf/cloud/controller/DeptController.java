package com.dpf.cloud.controller;

import com.dpf.cloud.entities.Dept;
import com.dpf.cloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = deptService.get(id);
        if(null == dept){
            throw new RuntimeException("该id:"+id+"没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        Dept dept = new Dept();
        dept.setDeptId(id);
        dept.setName("该id:"+id+"没有相应的信息，@HystrixCommand");
        dept.setDbSource("no database in mysql");
        return dept;
    }



}
