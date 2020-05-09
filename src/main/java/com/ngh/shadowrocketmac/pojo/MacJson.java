package com.ngh.shadowrocketmac.pojo;

import lombok.Data;

import java.util.List;

/**
 * TODO:
 *
 * @author NiuGeH
 * @description TODO:
 * @Date: 2020/5/10 12:37 上午
 */
@Data
public class MacJson {


    /**
     * index : 0
     * random : false
     * global : false
     * enabled : true
     * shareOverLan : false
     * isDefault : false
     * localPort : 1080
     * pacUrl : null
     * useOnlinePac : false
     * reconnectTimes : 3
     * randomAlgorithm : 0
     * TTL : 0
     * proxyEnable : false
     * proxyType : 0
     * proxyHost : null
     * proxyPort : 0
     * proxyAuthUser : null
     * proxyAuthPass : null
     * authUser : null
     * authPass : null
     * autoban : false
     * configs : [{"remarks":"京日A-SSR-v3-IPLC[x3.0-10Mbps]","server":"120.132.11.50","server_port":24544,"method":"rc4-md5","obfs":"tls1.2_ticket_auth","obfsparam":"baidu.com","remarks_base64":"ZXhhbXBsZQ==","password":"nautF3","tcp_over_udp":false,"udp_over_tcp":false,"protocol":"auth_aes128_md5","obfs_udp":false,"enable":true}]
     */

    public static  final String DEMOMACJSON = "{\n" +
            "    \"index\": 0,\n" +
            "    \"random\": false,\n" +
            "    \"global\": false,\n" +
            "    \"enabled\": true,\n" +
            "    \"shareOverLan\": false,\n" +
            "    \"isDefault\": false,\n" +
            "    \"localPort\": 1080,\n" +
            "    \"pacUrl\": null,\n" +
            "    \"useOnlinePac\": false,\n" +
            "    \"reconnectTimes\": 3,\n" +
            "    \"randomAlgorithm\": 0,\n" +
            "    \"TTL\": 0,\n" +
            "    \"proxyEnable\": false,\n" +
            "    \"proxyType\": 0,\n" +
            "    \"proxyHost\": null,\n" +
            "    \"proxyPort\": 0,\n" +
            "    \"proxyAuthUser\": null,\n" +
            "    \"proxyAuthPass\": null,\n" +
            "    \"authUser\": null,\n" +
            "    \"authPass\": null,\n" +
            "    \"autoban\": false,\n" +
            "    \"configs\": [{\n" +
            "        \"remarks\": \"京日A-SSR-v3-IPLC[x3.0-10Mbps]\",\n" +
            "        \"server\": \"120.132.11.50\",\n" +
            "        \"server_port\": 24544,\n" +
            "        \"method\": \"rc4-md5\",\n" +
            "        \"obfs\": \"tls1.2_ticket_auth\",\n" +
            "        \"obfsparam\": \"baidu.com\",\n" +
            "        \"remarks_base64\": \"ZXhhbXBsZQ==\",\n" +
            "        \"password\": \"nautF3\",\n" +
            "        \"tcp_over_udp\": false,\n" +
            "        \"udp_over_tcp\": false,\n" +
            "        \"protocol\": \"auth_aes128_md5\",\n" +
            "        \"obfs_udp\": false,\n" +
            "        \"enable\": true\n" +
            "    }]\n" +
            "}";

    private int index;
    private boolean random;
    private boolean global;
    private boolean enabled;
    private boolean shareOverLan;
    private boolean isDefault;
    private int localPort;
    private Object pacUrl;
    private boolean useOnlinePac;
    private int reconnectTimes;
    private int randomAlgorithm;
    private int TTL;
    private boolean proxyEnable;
    private int proxyType;
    private Object proxyHost;
    private int proxyPort;
    private Object proxyAuthUser;
    private Object proxyAuthPass;
    private Object authUser;
    private Object authPass;
    private boolean autoban;
    private List<ConfigsBean> configs;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isRandom() {
        return random;
    }

    public void setRandom(boolean random) {
        this.random = random;
    }

    public boolean isGlobal() {
        return global;
    }

    public void setGlobal(boolean global) {
        this.global = global;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isShareOverLan() {
        return shareOverLan;
    }

    public void setShareOverLan(boolean shareOverLan) {
        this.shareOverLan = shareOverLan;
    }

    public boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public int getLocalPort() {
        return localPort;
    }

    public void setLocalPort(int localPort) {
        this.localPort = localPort;
    }

    public Object getPacUrl() {
        return pacUrl;
    }

    public void setPacUrl(Object pacUrl) {
        this.pacUrl = pacUrl;
    }

    public boolean isUseOnlinePac() {
        return useOnlinePac;
    }

    public void setUseOnlinePac(boolean useOnlinePac) {
        this.useOnlinePac = useOnlinePac;
    }

    public int getReconnectTimes() {
        return reconnectTimes;
    }

    public void setReconnectTimes(int reconnectTimes) {
        this.reconnectTimes = reconnectTimes;
    }

    public int getRandomAlgorithm() {
        return randomAlgorithm;
    }

    public void setRandomAlgorithm(int randomAlgorithm) {
        this.randomAlgorithm = randomAlgorithm;
    }

    public int getTTL() {
        return TTL;
    }

    public void setTTL(int TTL) {
        this.TTL = TTL;
    }

    public boolean isProxyEnable() {
        return proxyEnable;
    }

    public void setProxyEnable(boolean proxyEnable) {
        this.proxyEnable = proxyEnable;
    }

    public int getProxyType() {
        return proxyType;
    }

    public void setProxyType(int proxyType) {
        this.proxyType = proxyType;
    }

    public Object getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(Object proxyHost) {
        this.proxyHost = proxyHost;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Object getProxyAuthUser() {
        return proxyAuthUser;
    }

    public void setProxyAuthUser(Object proxyAuthUser) {
        this.proxyAuthUser = proxyAuthUser;
    }

    public Object getProxyAuthPass() {
        return proxyAuthPass;
    }

    public void setProxyAuthPass(Object proxyAuthPass) {
        this.proxyAuthPass = proxyAuthPass;
    }

    public Object getAuthUser() {
        return authUser;
    }

    public void setAuthUser(Object authUser) {
        this.authUser = authUser;
    }

    public Object getAuthPass() {
        return authPass;
    }

    public void setAuthPass(Object authPass) {
        this.authPass = authPass;
    }

    public boolean isAutoban() {
        return autoban;
    }

    public void setAutoban(boolean autoban) {
        this.autoban = autoban;
    }

    public List<ConfigsBean> getConfigs() {
        return configs;
    }

    public void setConfigs(List<ConfigsBean> configs) {
        this.configs = configs;
    }

    public static class ConfigsBean {
        /**
         * remarks : 京日A-SSR-v3-IPLC[x3.0-10Mbps]
         * server : 120.132.11.50
         * server_port : 24544
         * method : rc4-md5
         * obfs : tls1.2_ticket_auth
         * obfsparam : baidu.com
         * remarks_base64 : ZXhhbXBsZQ==
         * password : nautF3
         * tcp_over_udp : false
         * udp_over_tcp : false
         * protocol : auth_aes128_md5
         * obfs_udp : false
         * enable : true
         */

        private String remarks;
        private String server;
        private int server_port;
        private String method;
        private String obfs;
        private String obfsparam;
        private String remarks_base64;
        private String password;
        private boolean tcp_over_udp;
        private boolean udp_over_tcp;
        private String protocol;
        private boolean obfs_udp;
        private boolean enable;
        private String protocolparam;

        public String getProtocolparam() {
            return protocolparam;
        }

        public void setProtocolparam(String protocolparam) {
            this.protocolparam = protocolparam;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public String getServer() {
            return server;
        }

        public void setServer(String server) {
            this.server = server;
        }

        public int getServer_port() {
            return server_port;
        }

        public void setServer_port(int server_port) {
            this.server_port = server_port;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getObfs() {
            return obfs;
        }

        public void setObfs(String obfs) {
            this.obfs = obfs;
        }

        public String getObfsparam() {
            return obfsparam;
        }

        public void setObfsparam(String obfsparam) {
            this.obfsparam = obfsparam;
        }

        public String getRemarks_base64() {
            return remarks_base64;
        }

        public void setRemarks_base64(String remarks_base64) {
            this.remarks_base64 = remarks_base64;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public boolean isTcp_over_udp() {
            return tcp_over_udp;
        }

        public void setTcp_over_udp(boolean tcp_over_udp) {
            this.tcp_over_udp = tcp_over_udp;
        }

        public boolean isUdp_over_tcp() {
            return udp_over_tcp;
        }

        public void setUdp_over_tcp(boolean udp_over_tcp) {
            this.udp_over_tcp = udp_over_tcp;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public boolean isObfs_udp() {
            return obfs_udp;
        }

        public void setObfs_udp(boolean obfs_udp) {
            this.obfs_udp = obfs_udp;
        }

        public boolean isEnable() {
            return enable;
        }

        public void setEnable(boolean enable) {
            this.enable = enable;
        }
    }
}
