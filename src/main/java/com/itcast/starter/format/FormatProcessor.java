package com.itcast.starter.format;

/**
 * Created by Administrator on 2019/7/7.
 */
public interface FormatProcessor {
    <T> String format(T obj);
}
