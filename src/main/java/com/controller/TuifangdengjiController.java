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

import com.entity.TuifangdengjiEntity;
import com.entity.view.TuifangdengjiView;

import com.service.TuifangdengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 退房登记
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
@RestController
@RequestMapping("/tuifangdengji")
public class TuifangdengjiController {
    @Autowired
    private TuifangdengjiService tuifangdengjiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TuifangdengjiEntity tuifangdengji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashu")) {
			tuifangdengji.setJiashuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuifangdengjiEntity> ew = new EntityWrapper<TuifangdengjiEntity>();

		PageUtils page = tuifangdengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuifangdengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TuifangdengjiEntity tuifangdengji, 
		HttpServletRequest request){
        EntityWrapper<TuifangdengjiEntity> ew = new EntityWrapper<TuifangdengjiEntity>();

		PageUtils page = tuifangdengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuifangdengji), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TuifangdengjiEntity tuifangdengji){
       	EntityWrapper<TuifangdengjiEntity> ew = new EntityWrapper<TuifangdengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tuifangdengji, "tuifangdengji")); 
        return R.ok().put("data", tuifangdengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TuifangdengjiEntity tuifangdengji){
        EntityWrapper< TuifangdengjiEntity> ew = new EntityWrapper< TuifangdengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tuifangdengji, "tuifangdengji")); 
		TuifangdengjiView tuifangdengjiView =  tuifangdengjiService.selectView(ew);
		return R.ok("查询退房登记成功").put("data", tuifangdengjiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TuifangdengjiEntity tuifangdengji = tuifangdengjiService.selectById(id);
        return R.ok().put("data", tuifangdengji);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TuifangdengjiEntity tuifangdengji = tuifangdengjiService.selectById(id);
        return R.ok().put("data", tuifangdengji);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TuifangdengjiEntity tuifangdengji, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tuifangdengji);
        tuifangdengjiService.insert(tuifangdengji);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TuifangdengjiEntity tuifangdengji, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tuifangdengji);
        tuifangdengjiService.insert(tuifangdengji);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TuifangdengjiEntity tuifangdengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tuifangdengji);
        tuifangdengjiService.updateById(tuifangdengji);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tuifangdengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
