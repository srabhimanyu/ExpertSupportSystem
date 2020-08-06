
package com.application;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class TermsNConditionCheckAction  extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;    
    private boolean c1;
    private boolean c2;
    private boolean c3;
    
        @Override
    public String execute() {
        
        if( c1 == true && c2 == true && c3 == true ) { //_1.equals("true") && _2.equals("true") && _3.equals("true")
            return "success";
        }
        
        else
        {
            request.setAttribute("errorMsg", "*Please agree with all the Terms & Conditions");
            return ERROR;
        }
    }

    public boolean isC1() {
        return c1;
    }

    public void setC1(boolean c1) {
        this.c1 = c1;
    }

    public boolean isC2() {
        return c2;
    }

    public void setC2(boolean c2) {
        this.c2 = c2;
    }

    public boolean isC3() {
        return c3;
    }

    public void setC3(boolean c3) {
        this.c3 = c3;
    }


    

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public SessionMap<String, Object> getSession() {
        return session;
    }

    public void setSession(SessionMap<String, Object> session) {
        this.session = session;
    }
    
    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    public void setSession(Map<String, Object> map) {
        session=(SessionMap)map;
    }
    
    
    
}
