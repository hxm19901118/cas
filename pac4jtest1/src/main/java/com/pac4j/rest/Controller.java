package com.pac4j.rest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.pac4j.core.profile.CommonProfile;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.buji.pac4j.subject.Pac4jPrincipal;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping(value="/index",method=RequestMethod.GET) 
	public String index(ModelMap map) {
		
		//获取用户身份
		Pac4jPrincipal p = SecurityUtils.getSubject().getPrincipals().oneByType(Pac4jPrincipal.class);
		
		if(p != null) {
			CommonProfile profile = p.getProfile();
			map.put("profile", profile);
		}
		
		return "index";
	}
	
}
