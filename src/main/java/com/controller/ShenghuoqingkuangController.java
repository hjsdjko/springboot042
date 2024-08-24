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

import com.entity.ShenghuoqingkuangEntity;
import com.entity.view.ShenghuoqingkuangView;

import com.service.ShenghuoqingkuangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 生活情况
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-19 17:25:13
 */
@RestController
@RequestMapping("/shenghuoqingkuang")
public class ShenghuoqingkuangController {
    @Autowired
    private ShenghuoqingkuangService shenghuoqingkuangService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenghuoqingkuangEntity shenghuoqingkuang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashu")) {
			shenghuoqingkuang.setJiashuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenghuoqingkuangEntity> ew = new EntityWrapper<ShenghuoqingkuangEntity>();

		PageUtils page = shenghuoqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenghuoqingkuang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenghuoqingkuangEntity shenghuoqingkuang, 
		HttpServletRequest request){
        EntityWrapper<ShenghuoqingkuangEntity> ew = new EntityWrapper<ShenghuoqingkuangEntity>();

		PageUtils page = shenghuoqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenghuoqingkuang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenghuoqingkuangEntity shenghuoqingkuang){
       	EntityWrapper<ShenghuoqingkuangEntity> ew = new EntityWrapper<ShenghuoqingkuangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenghuoqingkuang, "shenghuoqingkuang")); 
        return R.ok().put("data", shenghuoqingkuangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenghuoqingkuangEntity shenghuoqingkuang){
        EntityWrapper< ShenghuoqingkuangEntity> ew = new EntityWrapper< ShenghuoqingkuangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenghuoqingkuang, "shenghuoqingkuang")); 
		ShenghuoqingkuangView shenghuoqingkuangView =  shenghuoqingkuangService.selectView(ew);
		return R.ok("查询生活情况成功").put("data", shenghuoqingkuangView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenghuoqingkuangEntity shenghuoqingkuang = shenghuoqingkuangService.selectById(id);
        return R.ok().put("data", shenghuoqingkuang);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenghuoqingkuangEntity shenghuoqingkuang = shenghuoqingkuangService.selectById(id);
        return R.ok().put("data", shenghuoqingkuang);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenghuoqingkuangEntity shenghuoqingkuang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shenghuoqingkuang);
        shenghuoqingkuangService.insert(shenghuoqingkuang);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenghuoqingkuangEntity shenghuoqingkuang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shenghuoqingkuang);
        shenghuoqingkuangService.insert(shenghuoqingkuang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShenghuoqingkuangEntity shenghuoqingkuang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenghuoqingkuang);
        shenghuoqingkuangService.updateById(shenghuoqingkuang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenghuoqingkuangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
