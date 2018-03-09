package com.myfour.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 这就是通用的Mapper
 * 你的Mapper实现这个接口就能有许多内置的CRUD方法可以使用
 * 该接口不能被启动类扫描到
 * 你可以选择将其放到非启动类所在包及其子包下
 * 或者在启动类上加上@MapperScan(basePackages="com.myfour.dao",markerInterface=MyMapper.class)来扫描指定的Mapper接口所在包
 * @author
 * @since 2018-03-09 14:53
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}