package com.itcast.starter.autoconfiguration;

import com.sun.javafx.collections.MappingChange;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * Created by Administrator on 2019/7/7.
 */
@ConfigurationProperties(prefix = HelloProperties.HELLO_FPRMAT_PREFIX)
public class HelloProperties {
    public static final String HELLO_FPRMAT_PREFIX="gupao.hello.format";
    private Map<String,Object> info;

    public static String getHelloFprmatPrefix() {
        return HELLO_FPRMAT_PREFIX;
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}
