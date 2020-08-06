package com.application;

import com.ess.SessionDetails;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

public class logoutAction extends ActionSupport implements ServletRequestAware, SessionAware {

    HttpServletRequest request;
    SessionMap<String, Object> session;

    @Override
    public String execute() {
        Session s = com.ess.HibernateUtil.getSession();
        SessionDetails sd;

        sd = (SessionDetails) s.get(SessionDetails.class, (Integer) session.get("loginId"));
        sd.setLogoffTime(new Date());
        s.saveOrUpdate(sd);
        s.beginTransaction().commit();
        s.close();

        session.remove("loginId");
        session.remove("user");
        session.remove("type");
        session.clear();
        session.invalidate();
        return SUCCESS;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

    public void setSession(Map<String, Object> map) {
        session = (SessionMap) map;
    }

}
