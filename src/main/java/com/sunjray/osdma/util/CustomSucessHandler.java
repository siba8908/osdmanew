package com.sunjray.osdma.util;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomSucessHandler extends SimpleUrlAuthenticationSuccessHandler {

  private RedirectStrategy redirectStatergy = new DefaultRedirectStrategy();

  @Override
  public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
      Authentication authentication) throws IOException, ServletException {

    com.sunjray.osdma.HRmodel.User usrDtl = new com.sunjray.osdma.HRmodel.User();
    User principal = (User) authentication.getPrincipal();
    usrDtl.setUsername(principal.getUsername());
    System.out.println("principal" + principal.getAuthorities() + "hj" + principal);
    Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
    authorities.forEach(authority -> {

      System.out.println();


      if (authority.getAuthority().equals("ROLE_HR")) {
        usrDtl.setRoleHR(true);
        try {
          redirectStatergy.sendRedirect(request, response, "/hr/hr-dashboard");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
      else if (authority.getAuthority().equals("ROLE_PC")) {
        usrDtl.setRolePC(true);
        try {
          redirectStatergy.sendRedirect(request, response, "/pc/pc-dashboard");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
      else if (authority.getAuthority().equals("ROLE_AM")) {
        usrDtl.setRoleAM(true);
        try {
          redirectStatergy.sendRedirect(request, response, "/am/am-dashboard");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
      else if (authority.getAuthority().equals("ROLE_PM")) {
        usrDtl.setRolePM(true);
        try {
          redirectStatergy.sendRedirect(request, response, "/pm/pm-create-site-code");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
      else if (authority.getAuthority().equals("ROLE_QA")) {
        usrDtl.setRoleQA(true);
        try {
          redirectStatergy.sendRedirect(request, response, "/qaqc/getqaqcdashboard");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
      else if (authority.getAuthority().equals("ROLE_DW")) {
        usrDtl.setRoleDW(true);
        try {
          redirectStatergy.sendRedirect(request, response, "/dw/dw-dashboard");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
      else if (authority.getAuthority().equals("ROLE_WA")) {
        usrDtl.setRoleWA(true);
        try {
          redirectStatergy.sendRedirect(request, response, "/wa/sm-warehouse-a-dashboard");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
      else if (authority.getAuthority().equals("ROLE_WB")) {
        usrDtl.setRoleWB(true);
        try {
          redirectStatergy.sendRedirect(request, response, "/wb/wb-dashboard");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
      else if (authority.getAuthority().equals("ROLE_LOG")) {
        usrDtl.setRoleLOG(true);
        try {
          redirectStatergy.sendRedirect(request, response, "/lg/logistic-dashboard");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
      else {
        throw new IllegalStateException();
      }

    });
    
    request.getSession().setAttribute("userdtls", usrDtl);
    
  }



}
