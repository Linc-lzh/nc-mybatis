package cn.mybatis.session;

import cn.mybatis.builder.xml.XMLConfigBuilder;
import cn.mybatis.session.defaults.DefaultSqlSessionFactory;
import org.dom4j.Document;

import java.io.Reader;

public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(Reader reader) {
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(reader);
        return build(xmlConfigBuilder.parse());
    }

    public SqlSessionFactory build(Document document) {
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(document);
        return build(xmlConfigBuilder.parse());
    }

    public SqlSessionFactory build(Configuration config) {
        return new DefaultSqlSessionFactory(config);
    }

}
