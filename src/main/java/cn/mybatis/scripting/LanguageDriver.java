package cn.mybatis.scripting;

import cn.mybatis.executor.parameter.ParameterHandler;
import cn.mybatis.mapping.BoundSql;
import cn.mybatis.mapping.MappedStatement;
import cn.mybatis.mapping.SqlSource;
import cn.mybatis.session.Configuration;
import org.dom4j.Element;

public interface LanguageDriver {

    /**
     * 创建SQL源码(mapper xml方式)
     */
    SqlSource createSqlSource(Configuration configuration, Element script, Class<?> parameterType);

    /**
     * 创建SQL源码(annotation 注解方式)
     */
    SqlSource createSqlSource(Configuration configuration, String script, Class<?> parameterType);

    /**
     * 创建参数处理器
     */
    ParameterHandler createParameterHandler(MappedStatement mappedStatement, Object parameterObject, BoundSql boundSql);

}
