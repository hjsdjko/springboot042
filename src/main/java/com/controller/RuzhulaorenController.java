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

import com.entity.RuzhulaorenEntity;
import com.entity.view.RuzhulaorenView;

import com.service.RuzhulaorenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 入住老人
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-19 17:25:12
 */
@RestController
@RequestMapping("/ruzhulaoren")
public class RuzhulaorenController {
    @Autowired
    private RuzhulaorenService ruzhulaorenService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RuzhulaorenEntity ruzhulaoren,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashu")) {
			ruzhulaoren.setJiashuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RuzhulaorenEntity> ew = new EntityWrapper<RuzhulaorenEntity>();

		PageUtils page = ruzhulaorenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruzhulaoren), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RuzhulaorenEntity ruzhulaoren, 
		HttpServletRequest request){
        EntityWrapper<RuzhulaorenEntity> ew = new EntityWrapper<RuzhulaorenEntity>();

		PageUtils page = ruzhulaorenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruzhulaoren), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RuzhulaorenEntity ruzhulaoren){
       	EntityWrapper<RuzhulaorenEntity> ew = new EntityWrapper<RuzhulaorenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ruzhulaoren, "ruzhulaoren")); 
        return R.ok().put("data", ruzhulaorenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RuzhulaorenEntity ruzhulaoren){
        EntityWrapper< RuzhulaorenEntity> ew = new EntityWrapper< RuzhulaorenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ruzhulaoren, "ruzhulaoren")); 
		RuzhulaorenView ruzhulaorenView =  ruzhulaorenService.selectView(ew);
		return R.ok("查询入住老人成功").put("data", ruzhulaorenView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RuzhulaorenEntity ruzhulaoren = ruzhulaorenService.selectById(id);
        return R.ok().put("data", ruzhulaoren);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RuzhulaorenEntity ruzhulaoren = ruzhulaorenService.selectById(id);
        return R.ok().put("data", ruzhulaoren);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RuzhulaorenEntity ruzhulaoren, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ruzhulaoren);
        ruzhulaorenService.insert(ruzhulaoren);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RuzhulaorenEntity ruzhulaoren, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ruzhulaoren);
        ruzhulaorenService.insert(ruzhulaoren);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody RuzhulaorenEntity ruzhulaoren, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ruzhulaoren);
        ruzhulaorenService.updateById(ruzhulaoren);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ruzhulaorenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
