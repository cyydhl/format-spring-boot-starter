package com.itcast.starter;

import com.itcast.starter.autoconfiguration.HelloProperties;
import com.itcast.starter.format.FormatProcessor;

/**
 * Created by Administrator on 2019/7/7.
 */
public class HelloFormatTemplate {
    private FormatProcessor formatProcessor;
    private HelloProperties helloProperties;

    public HelloFormatTemplate(HelloProperties helloProperties,FormatProcessor formatProcessor){
      this.formatProcessor = formatProcessor;
        this.helloProperties = helloProperties;
    }

    public <T> String doFormat(T obj){
        StringBuilder sb = new StringBuilder();
        sb.append("Excute format").append("\n");
        sb.append("helloProperties:").append(formatProcessor.format(helloProperties.getInfo())).append("<br/>");
        sb.append("Obj format results").append(formatProcessor.format(obj)).append("\n");

        return sb.toString();
    }

}
