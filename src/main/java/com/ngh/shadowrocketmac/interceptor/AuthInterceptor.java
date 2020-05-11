package com.ngh.shadowrocketmac.interceptor;

import com.ngh.shadowrocketmac.common.VerifyToken;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * TODO:
 *          JWT
 * @author NiuGeH
 * @description TODO:
 * @Date: 2020/5/11 3:23 下午
 */
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        if(!(handler instanceof HandlerMethod)){
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        if(method.isAnnotationPresent(VerifyToken.class)){
            VerifyToken userLoginToken = method.getAnnotation(VerifyToken.class);
            if (userLoginToken.required()){
                if(token == null){
                    throw new RuntimeException("该请求没有Token!请先获取Token");
                }
                String userId;
                try{
                    userId = JWT.decode(token).getAudience().get(0);
                }catch (Exception e){
                    e.printStackTrace();
                    throw new Exception("Token 非法, 没有userId");
                }
                // zhangsan 为用户名  此步操作应为查询数据库
                if(!(userId.equals("zhangsan"))){
                    throw new Exception("用户不存在,请重新登录");
                }
                // 123 为密码  123 为查询数据空后的数据
                JWTVerifier zhangsan = JWT.require(Algorithm.HMAC256("123")).build();
                try{
                    zhangsan.verify(token);

                }catch (Exception e){
                    throw new Exception("校验Token 发生异常");
                }
                return true;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
