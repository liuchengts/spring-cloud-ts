package spring.cloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by apple on 2017/7/14.
 */
public class PreRequestFilter extends ZuulFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(PreRequestFilter.class);
    @Override
    public String filterType() {
//        pre：可以在请求被路由之前调用
//        route：在路由请求时候被调用
//        post：在route和error过滤器之后被调用
//        error：处理请求时发生错误时被调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        //返回一个int值来指定过滤器的执行顺序，不同的过滤器允许返回相同的数字，数字越大，优先级越低。
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //返回一个boolean值来判断该过滤器是否要执行，true表示执行，false表示不执行。
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        //过滤器的具体逻辑
        HttpServletRequest request = ctx.getRequest();
        LOGGER.info("日志输出===============" + String.format("send %s request to %s", request.getMethod(), request.getRequestURL().toString()));
        String s = request.getParameter("s");
        if (StringUtils.isBlank(s)) {
            LOGGER.info("===========401=====================");
            //设置zuul不对当前请求路由
            ctx.setSendZuulResponse(false);
            //设置返回编码
            ctx.setResponseStatusCode(401);
            //设置返回内容
            ctx.setResponseBody("参数无效");
            //设置编码为gbk，防止中文乱码
            ctx.getResponse().setCharacterEncoding("gbk");
        }
        return null;
    }
}
