package com.zgd.springcloud.eurekaClient.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 通过继承ZuulFilter来自定义过滤器
 * @author zgd
 * @time 2018年8月1日14:18:06
 */
public class ZuulDemoFilter extends ZuulFilter {

    private boolean isFilter = true;

    RequestContext rc = new RequestContext();

    /**
     * 过滤类型,可以选"pre,routing,post"
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否进行过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return isFilter;
    }

    @Override
    public Object run() {
        System.out.println("调用了过滤器");
        return null;
    }
}
