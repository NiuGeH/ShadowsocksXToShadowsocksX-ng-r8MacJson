package com.ngh.shadowrocketmac.pojo;

import lombok.Data;

/**
 * TODO:
 *
 * @author NiuGeH
 * @description TODO:
 * @Date: 2020/5/10 12:23 上午
 */
@Data
public class IosJson {


    /**
     * obfsParam : f71918243.microsoft.com
     * weight : 1589015480
     * title : 京日A-SSR-v3-IPLC[x3.0-10Mbps]
     * host : 120.132.11.50
     * file :
     * uuid : 7642B673-8FCB-4848-A3AA-B442007849C1
     * method : aes-256-ctr
     * flag : CN
     * updated : 1.589015480889579E9
     * obfs : tls1.2_ticket_auth
     * chain :
     * type : ShadowsocksR
     * cert :
     * plugin :
     * user :
     * protoParam : 8243:waOrow
     * port : 24544
     * proto : auth_aes128_md5
     * peer :
     * password : nautF3
     * data :
     * ping : 299
     * created : 1.589015480869443E9
     */

    private String obfsParam;
    private int weight;
    private String title;
    private String host;
    private String file;
    private String uuid;
    private String method;
    private String flag;
    private double updated;
    private String obfs;
    private String chain;
    private String type;
    private String cert;
    private String plugin;
    private String user;
    private String protoParam;
    private int port;
    private String proto;
    private String peer;
    private String password;
    private String data;
    private int ping;
    private double created;


    public String getObfsParam() {
        return obfsParam;
    }

    public void setObfsParam(String obfsParam) {
        this.obfsParam = obfsParam;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public double getUpdated() {
        return updated;
    }

    public void setUpdated(double updated) {
        this.updated = updated;
    }

    public String getObfs() {
        return obfs;
    }

    public void setObfs(String obfs) {
        this.obfs = obfs;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProtoParam() {
        return protoParam;
    }

    public void setProtoParam(String protoParam) {
        this.protoParam = protoParam;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getProto() {
        return proto;
    }

    public void setProto(String proto) {
        this.proto = proto;
    }

    public String getPeer() {
        return peer;
    }

    public void setPeer(String peer) {
        this.peer = peer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPing() {
        return ping;
    }

    public void setPing(int ping) {
        this.ping = ping;
    }

    public double getCreated() {
        return created;
    }

    public void setCreated(double created) {
        this.created = created;
    }
}
