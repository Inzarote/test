package mytest.others.proxy.jdkproxy;

import mytest.others.proxy.staticproxy.Hello;
import mytest.others.proxy.staticproxy.HelloImpl;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author lilong
 * @Date 2019-02-23 20:34
 */
public class Test {
    public static void main(String[] args) {
        Hello hello = new HelloImpl();

        JDKProxy dynamicProxyHandler = new JDKProxy(hello);

        Hello helloProxy = (Hello) Proxy.newProxyInstance(
                hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(),
                dynamicProxyHandler
        );

        helloProxy.say("biglong");
    }
}
