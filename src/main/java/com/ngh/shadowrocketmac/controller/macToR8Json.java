package com.ngh.shadowrocketmac.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ngh.shadowrocketmac.common.ResultModel;
import com.ngh.shadowrocketmac.common.ResultUtils;
import com.ngh.shadowrocketmac.common.TokenUtils;
import com.ngh.shadowrocketmac.common.VerifyToken;
import com.ngh.shadowrocketmac.pojo.IosJson;
import com.ngh.shadowrocketmac.pojo.MacJson;
import com.ngh.shadowrocketmac.pojo.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * TODO:
 *
 * @author NiuGeH
 * @description TODO:
 * @Date: 2020/5/10 12:17 上午
 */
@RestController
@RequestMapping("/macToR8")
@Slf4j
public class macToR8Json {

    Gson gson = new Gson();

    @PostMapping("/login")
    public ResultModel login(@RequestBody String json, HttpServletRequest request){
        log.info("IP: {} ",getIpAddress(request));
        log.info("JSON: {}",json);
        UserEntity userEntity = gson.fromJson(json, UserEntity.class);
        String token = TokenUtils.getToken(userEntity.getUserName(), userEntity.getPwd());
        return ResultUtils.ok(token);
    }

    @PostMapping("/")
    @VerifyToken
    public Object jsonToJson(@RequestBody String json, HttpServletRequest request){
        log.info("IP: {} ",getIpAddress(request));
        log.info("JSON: {}",json);
        List<IosJson> jsonList = gson.fromJson(json, new TypeToken<List<IosJson>>(){}.getType());
        MacJson macJson = gson.fromJson(MacJson.DEMOMACJSON, MacJson.class);
        List<MacJson.ConfigsBean> configsBeans = new ArrayList<>();
        for (IosJson iosJson : jsonList) {
            MacJson.ConfigsBean configsBean = new MacJson.ConfigsBean();
            //设置名称
            configsBean.setRemarks(iosJson.getTitle());
            //ip
            configsBean.setServer(iosJson.getHost());
            //端口
            configsBean.setServer_port(iosJson.getPort());
            configsBean.setMethod(iosJson.getMethod());
            //obfs
            configsBean.setObfs(iosJson.getObfs());
            //obfsParams
            configsBean.setObfsparam(iosJson.getObfsParam());
            configsBean.setRemarks_base64(Base64.getEncoder().encodeToString(iosJson.getTitle().getBytes()));

            configsBean.setPassword(iosJson.getPassword());
            configsBean.setTcp_over_udp(true);
            configsBean.setUdp_over_tcp(true);
            configsBean.setProtocol(iosJson.getProto());
            configsBean.setObfs_udp(true);
            configsBean.setEnable(true);
            configsBean.setProtocolparam(iosJson.getProtoParam());

            configsBeans.add(configsBean);


        }

        macJson.setConfigs(configsBeans);
        return macJson;

    }



    public String getIpAddress(HttpServletRequest request){
        String ipAddress = request.getHeader("x-forwarded-for");
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
            if(ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")){
                //根据网卡取本机配置的IP
                InetAddress inet=null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ipAddress= inet.getHostAddress();
            }
        }
        //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15
            if(ipAddress.indexOf(",")>0){
                ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));
            }
        }
        return ipAddress;
    }
}
