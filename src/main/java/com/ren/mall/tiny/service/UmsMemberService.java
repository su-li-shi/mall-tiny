package com.ren.mall.tiny.service;

import com.ren.mall.tiny.common.api.CommonResult;

/**
 * @author : renwenhao
 * 会员管理Service
 * @date : 16:56 2021/1/22
 */
public interface UmsMemberService {
    /**
     *  生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     *  判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
