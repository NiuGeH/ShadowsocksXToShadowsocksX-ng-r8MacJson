package com.ngh.shadowrocketmac.common;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

/**
 * TODO:
 *
 * @author NiuGeH
 * @description TODO:
 * @Date: 2020/5/11 3:33 下午
 */
public class TokenUtils {
    public static String getToken(String id , String sec){
        return JWT.create().withAudience(id).sign(Algorithm.HMAC256(sec));
    }
}
