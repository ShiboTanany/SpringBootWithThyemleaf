package www.personalwebsite.com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.servlet.http.Cookie;

import java.security.Principal;

import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
@Entity
public class ServletRequest {
    @Id
    @GeneratedValue
    private int id;
    private Date requestDate;
    private String authType;
    private String method;
    private String pathInfo;
    private String pathTranslated;
    private String contextPath;
    private String queryString;
    private String remoteUser;
    private String requestedSessionId;
    private String requestURI;
    private StringBuffer requestURL;
    private String servletPath;
    private String sessionId;
    private boolean isRequestedSessionIdValid;
    private boolean isRequestedSessionIdFromCookie;
    private boolean isRequestedSessionIdFromURL;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPathInfo() {
        return pathInfo;
    }

    public void setPathInfo(String pathInfo) {
        this.pathInfo = pathInfo;
    }

    public String getPathTranslated() {
        return pathTranslated;
    }

    public void setPathTranslated(String pathTranslated) {
        this.pathTranslated = pathTranslated;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getRemoteUser() {
        return remoteUser;
    }

    public void setRemoteUser(String remoteUser) {
        this.remoteUser = remoteUser;
    }


    public String getRequestedSessionId() {
        return requestedSessionId;
    }

    public void setRequestedSessionId(String requestedSessionId) {
        this.requestedSessionId = requestedSessionId;
    }

    public String getRequestURI() {
        return requestURI;
    }

    public void setRequestURI(String requestURI) {
        this.requestURI = requestURI;
    }

    public StringBuffer getRequestURL() {
        return requestURL;
    }

    public void setRequestURL(StringBuffer requestURL) {
        this.requestURL = requestURL;
    }

    public String getServletPath() {
        return servletPath;
    }

    public void setServletPath(String servletPath) {
        this.servletPath = servletPath;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public boolean isRequestedSessionIdValid() {
        return isRequestedSessionIdValid;
    }

    public void setRequestedSessionIdValid(boolean requestedSessionIdValid) {
        isRequestedSessionIdValid = requestedSessionIdValid;
    }

    public boolean isRequestedSessionIdFromCookie() {
        return isRequestedSessionIdFromCookie;
    }

    public void setRequestedSessionIdFromCookie(boolean requestedSessionIdFromCookie) {
        isRequestedSessionIdFromCookie = requestedSessionIdFromCookie;
    }

    public boolean isRequestedSessionIdFromURL() {
        return isRequestedSessionIdFromURL;
    }

    public void setRequestedSessionIdFromURL(boolean requestedSessionIdFromURL) {
        isRequestedSessionIdFromURL = requestedSessionIdFromURL;
    }

    @Override
    public String toString() {
        return "ServletRequest{" +
                "id=" + id +
                ", requestDate=" + requestDate +
                ", authType='" + authType + '\'' +


                ", method='" + method + '\'' +
                ", pathInfo='" + pathInfo + '\'' +
                ", pathTranslated='" + pathTranslated + '\'' +
                ", contextPath='" + contextPath + '\'' +
                ", queryString='" + queryString + '\'' +
                ", remoteUser='" + remoteUser + '\'' +
                ", requestedSessionId='" + requestedSessionId + '\'' +
                ", requestURI='" + requestURI + '\'' +
                ", requestURL=" + requestURL +
                ", servletPath='" + servletPath + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", isRequestedSessionIdValid=" + isRequestedSessionIdValid +
                ", isRequestedSessionIdFromCookie=" + isRequestedSessionIdFromCookie +
                ", isRequestedSessionIdFromURL=" + isRequestedSessionIdFromURL +
                '}';
    }
}
