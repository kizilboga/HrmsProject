package com.idris.HRMSProject.core.helpers;

import com.idris.HRMSProject.core.results.Result;

public interface EmailService {
	Result send(String to, String title, String message);
}
