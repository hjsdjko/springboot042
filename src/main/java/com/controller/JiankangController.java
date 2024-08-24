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

import com.entity.JiankangEntity;
import com.entity.view.JiankangView;

import com.service.JiankangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 健康
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
@RestController
@RequestMapping("/jiankang")
public class JiankangController {
    @Autowired
    private JiankangService jiankangService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiankangEntity jiankang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashu")) {
			jiankang.setJiashuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiankangEntity> ew = new EntityWrapper<JiankangEntity>();

		PageUtils page = jiankangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiankangEntity jiankang, 
		HttpServletRequest request){
        EntityWrapper<JiankangEntity> ew = new EntityWrapper<JiankangEntity>();

		PageUtils page = jiankangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiankangEntity jiankang){
       	EntityWrapper<JiankangEntity> ew = new EntityWrapper<JiankangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiankang, "jiankang")); 
        return R.ok().put("data", jiankangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiankangEntity jiankang){
        EntityWrapper< JiankangEntity> ew = new EntityWrapper< JiankangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiankang, "jiankang")); 
		JiankangView jiankangView =  jiankangService.selectView(ew);
		return R.ok("查询健康成功").put("data", jiankangView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiankangEntity jiankang = jiankangService.selectById(id);
        return R.ok().put("data", jiankang);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiankangEntity jiankang = jiankangService.selectById(id);
        return R.ok().put("data", jiankang);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangEntity jiankang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiankang);
        jiankangService.insert(jiankang);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiankangEntity jiankang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiankang);
        jiankangService.insert(jiankang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiankangEntity jiankang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiankang);
        jiankangService.updateById(jiankang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiankangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
