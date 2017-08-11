package com.reflector;

import java.lang.reflect.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

class ThisInvokationHandler implements InvocationHandler
{
    // 需要被代理的对象
    private Object target;
    public void setTarget(Object target)
    {
        this.target = target;
    }
    // 执行动态代理对象的所有方法时，都会被替换成执行如下的invoke方法
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Exception
    {
        //DogUtil du = new DogUtil();
        // 执行DogUtil对象中的method1。
        //du.method1();
        // 以target作为主调来执行method方法
        Object result = method.invoke(target , args);
        // 执行DogUtil对象中的method2。
        //du.method2();
        return result;
    }
}

public class MyProxyFactory
{
	// 为指定target生成动态代理对象
	public static Object getProxy(Object target)
		throws Exception
		{
		// 创建一个MyInvokationHandler对象
	    ThisInvokationHandler handler =
		new ThisInvokationHandler();
		// 为MyInvokationHandler设置target对象
		handler.setTarget(target);
		// 创建、并返回一个动态代理
		return Proxy.newProxyInstance(target.getClass().getClassLoader()
			, target.getClass().getInterfaces() , handler);
	}
	
	public static void main(String[] args)
	        throws Exception
	    {
	        // 创建一个原始的GunDog对象，作为target
	        People target = new Man();
	        // 以指定的target来创建动态代理
	        People  p= (People)MyProxyFactory.getProxy(target);
	        p.walk();
	        p.sayHello("张三");
	    }
}

