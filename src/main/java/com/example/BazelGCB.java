/* 
 sample code for demonstrating Java w/ Bazel
 (no license) 
*/

package com.example;

import com.davidstanke.util.BazelGCBUtil;

class BazelGCB {
	
	// instance vars
	String message;

	BazelGCB(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public String getMessageTwice() {
		return BazelGCBUtil.concat(this.message,this.message);
	}
}