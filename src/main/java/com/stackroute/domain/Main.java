package com.stackroute.domain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
public static void main(String[] args){
  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

  ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
  BeanLifeCycle beanLifeCycle = (BeanLifeCycle) applicationContext.getBean("cycle");


}
}
