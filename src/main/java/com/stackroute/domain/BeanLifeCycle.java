package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
  public  static  void main(String ar []) {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

    ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
    BeanLifeCycle beanLifeCycle = (BeanLifeCycle) applicationContext.getBean("cycle");

  }
  public void Init ()
  {
    System.out.println("Initialization");
  }

  public  void clean()
  {
    System.out.println("custom destroy");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("destroy");

  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("After all properties");

  }
}
