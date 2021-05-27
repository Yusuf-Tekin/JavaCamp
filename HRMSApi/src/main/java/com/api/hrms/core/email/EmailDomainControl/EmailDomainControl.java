package com.api.hrms.core.email.EmailDomainControl;

public class EmailDomainControl implements EmailDomainControlAbs{

	@Override
	public boolean EmailDomainControl(String email,String webSite) {
		
		// www.kodlamaio.com
		// yusuf@kodlamaio.com
		
		String webSiteReplace= webSite.replace('.', ':');
		
		String[] webSiteSplit = webSiteReplace.split(":");
		String[] emailSplit = email.split("@");
		
		
		String SplitedWebSite = webSiteSplit[1] + "." + webSiteSplit[2];
		
		if(SplitedWebSite.equals(emailSplit[1])) {
			return true;
		}
		else {
			return false;
		}
	}
}
