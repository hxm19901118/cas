package com.pac4j.util;

import org.apache.shiro.session.Session;

public class MyShiroProvidedSessionStore extends MyShiroSessionStore{

	
	private Session session;
	
	
	public MyShiroProvidedSessionStore(Session session) {
		this.session = session;
	}
	

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	protected Session getSession(final boolean createSession) {
        return getSession();
    }
	
	
}
