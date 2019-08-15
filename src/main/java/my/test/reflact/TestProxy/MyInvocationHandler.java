package my.test.reflact.TestProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler<T> implements InvocationHandler{
	T target;
	
	public T getTarget() {
		return target;
	}

	public void setTarget(T target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("被代理类：" + target.getClass().getName());
		System.out.println("被代理执行方法：" + method.getName());
		method.invoke(target, args);
		return "代理执行成功！";
	}

}
