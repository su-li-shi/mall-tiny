package com.ren.mall.tiny.service;

import com.ren.mall.tiny.mgb.model.PmsBrand;

import java.util.List;

/**
 * @author : renwenhao
 * @date : 16:12 2021/1/19
 */
public interface PmsBrandService {

    // 查询单个产品
    PmsBrand getBrand(Long id);

    // 查询所有产品
    List<PmsBrand> listAllBrand();

    // 创建产品
    int createBrand(PmsBrand brand);

    // 更新产品
    int updateBrand(Long id,PmsBrand brand);

    // 删除产品
    int deleteBrand(Long id);

    // 产品分页
    List<PmsBrand> listBrand(int pageNum,int pageSize);

}
