package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChuangweiEntity;
import com.entity.view.ChuangweiView;

import com.service.ChuangweiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 床位
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
@RestController
@RequestMapping("/chuangwei")
public class ChuangweiController {
    @Autowired
    private ChuangweiService chuangweiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChuangweiEntity chuangwei,
		HttpServletRequest request){
        EntityWrapper<ChuangweiEntity> ew = new EntityWrapper<ChuangweiEntity>();

		PageUtils page = chuangweiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chuangwei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChuangweiEntity chuangwei, 
		HttpServletRequest request){
        EntityWrapper<ChuangweiEntity> ew = new EntityWrapper<ChuangweiEntity>();

		PageUtils page = chuangweiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chuangwei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChuangweiEntity chuangwei){
       	EntityWrapper<ChuangweiEntity> ew = new EntityWrapper<ChuangweiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chuangwei, "chuangwei")); 
        return R.ok().put("data", chuangweiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChuangweiEntity chuangwei){
        EntityWrapper< ChuangweiEntity> ew = new EntityWrapper< ChuangweiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chuangwei, "chuangwei")); 
		ChuangweiView chuangweiView =  chuangweiService.selectView(ew);
		return R.ok("查询床位成功").put("data", chuangweiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChuangweiEntity chuangwei = chuangweiService.selectById(id);
        return R.ok().put("data", chuangwei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChuangweiEntity chuangwei = chuangweiService.selectById(id);
        return R.ok().put("data", chuangwei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChuangweiEntity chuangwei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chuangwei);
        chuangweiService.insert(chuangwei);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChuangweiEntity chuangwei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chuangwei);
        chuangweiService.insert(chuangwei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChuangweiEntity chuangwei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chuangwei);
        chuangweiService.updateById(chuangwei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chuangweiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
