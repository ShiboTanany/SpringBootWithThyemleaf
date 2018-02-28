package www.personalwebsite.com.securityConfiguration;

import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebFilter(urlPatterns = {"/Admins/admin/*" })
@Configuration
public class AdminFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println(
                "happened in filter "
        );
        HttpServletRequest request = (HttpServletRequest) servletRequest;


        www.personalwebsite.com.entities.ServletRequest newServletRequest=new www.personalwebsite.com.entities.ServletRequest();
        newServletRequest.setRequestDate(new Date());
        newServletRequest.setContextPath(request.getContextPath());
        newServletRequest.setAuthType(request.getAuthType());
//        newServletRequest.setCookies(request.getCookies());
//        newServletRequest.setHeaders(request.getHeaderNames());
        newServletRequest.setMethod(request.getMethod());
        newServletRequest.setPathInfo(request.getPathInfo());
        newServletRequest.setQueryString(request.getQueryString());
        newServletRequest.setPathTranslated(request.getPathTranslated());

        newServletRequest.setSessionId(request.getRequestedSessionId());
        newServletRequest.setServletPath(request.getServletPath());
        newServletRequest.setRequestURL(request.getRequestURL());
        newServletRequest.setRequestedSessionIdValid(request.isRequestedSessionIdValid());
        newServletRequest.setRemoteUser(request.getRemoteUser());

     //   webRequest
        System.out.println(newServletRequest);


        HttpServletResponse response= (HttpServletResponse)servletResponse;
        filterChain.doFilter(request,response);

    }

    @Override
    public void destroy() {

    }
}
