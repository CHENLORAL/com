package com.clinic.persistence;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import javax.servlet.ServletContext;

public class DBHelper {
	
	private static final Log log = LogFactory.getLog(DBHelper.class);
	
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			String webRoot = ServletActionContext.getServletContext().getRealPath("/");
			//给出mybatis配置文件路径
			Reader reader = new InputStreamReader(new FileInputStream(webRoot + "\\WEB-INF\\applicationContext.xml"));
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			log.error("SqlSessionFactory", e);
		}
	}

	 public static SqlSession getSqlSession() {
		 SqlSession sqlSession = sqlSessionFactory.openSession();
		 return sqlSession;
	 }
}
