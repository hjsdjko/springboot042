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

import com.entity.AnquanqingkuangEntity;
import com.entity.view.AnquanqingkuangView;

import com.service.AnquanqingkuangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 安全情况
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-19 17:25:13
 */
@RestController
@RequestMapping("/anquanqingkuang")
public class AnquanqingkuangController {
    @Autowired
    private AnquanqingkuangService anquanqingkuangService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,AnquanqingkuangEntity anquanqingkuang,
		HttpServletRequest request){
        EntityWrapper<AnquanqingkuangEntity> ew = new EntityWrapper<AnquanqingkuangEntity>();

		PageUtils page = anquanqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, anquanqingkuang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,AnquanqingkuangEntity anquanqingkuang, 
		HttpServletRequest request){
        EntityWrapper<AnquanqingkuangEntity> ew = new EntityWrapper<AnquanqingkuangEntity>();

		PageUtils page = anquanqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, anquanqingkuang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( AnquanqingkuangEntity anquanqingkuang){
       	EntityWrapper<AnquanqingkuangEntity> ew = new EntityWrapper<AnquanqingkuangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( anquanqingkuang, "anquanqingkuang")); 
        return R.ok().put("data", anquanqingkuangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(AnquanqingkuangEntity anquanqingkuang){
        EntityWrapper< AnquanqingkuangEntity> ew = new EntityWrapper< AnquanqingkuangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( anquanqingkuang, "anquanqingkuang")); 
		AnquanqingkuangView anquanqingkuangView =  anquanqingkuangService.selectView(ew);
		return R.ok("查询安全情况成功").put("data", anquanqingkuangView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        AnquanqingkuangEntity anquanqingkuang = anquanqingkuangService.selectById(id);
        return R.ok().put("data", anquanqingkuang);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        AnquanqingkuangEntity anquanqingkuang = anquanqingkuangService.selectById(id);
        return R.ok().put("data", anquanqingkuang);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AnquanqingkuangEntity anquanqingkuang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(anquanqingkuang);
        anquanqingkuangService.insert(anquanqingkuang);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody AnquanqingkuangEntity anquanqingkuang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(anquanqingkuang);
        anquanqingkuangService.insert(anquanqingkuang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody AnquanqingkuangEntity anquanqingkuang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(anquanqingkuang);
        anquanqingkuangService.updateById(anquanqingkuang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        anquanqingkuangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
