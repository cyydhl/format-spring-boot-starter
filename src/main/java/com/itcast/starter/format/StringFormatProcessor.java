package com.itcast.starter.format;

import com.alibaba.fastjson.JSON;

/**
 * Created by Administrator on 2019/7/7.
 */
public class StringFormatProcessor implements FormatProcessor {
    @Override
    public <T> String format(T obj) {
        return "StringFormatProcessor:" + obj.toString();
    }
}
