/*
    This file is part of Cyclos (www.cyclos.org).
    A project of the Social Trade Organisation (www.socialtrade.org).

    Cyclos is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Cyclos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Cyclos; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package com.puremoneysystems.poc.services;


import com.puremoneysystems.poc.utils.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Service implementation for Open Transactions PoC.
 * 
 * @author chris
 */
@Service
public class OTPoCServiceImpl implements OTPoCServiceLocal {

    
    private OTManager			 otManager;

    @Autowired
    public void setOTManager(final OTManager otManager) {
        this.otManager = otManager;
    }
    
    @Override
	public String executeTest() {
    	String testResult = this.otManager.executeTest();
    	return testResult;
	}

	
    @Override
	public String getLastTestResult() {
    	String lastTestResult = this.otManager.getLastTestResult();
    	return lastTestResult;
	}

}