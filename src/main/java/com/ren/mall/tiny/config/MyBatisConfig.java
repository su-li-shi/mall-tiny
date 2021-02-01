package com.ren.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : renwenhao
 * @date : 16:18 2021/1/19
 */
@Configuration
@MapperScan("com.ren.mall.tiny.mgb.mapper")
public class MyBatisConfig {
}
