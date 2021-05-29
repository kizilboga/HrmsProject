package com.idris.HRMSProject.core.business;

import com.idris.HRMSProject.core.results.Result;

public class BusinessRules {
	 public static Result run(Result... logics)
     {
         for (Result result : logics)
         {
             if (!result.isSuccess())
             {
                 return result;
             }
         }

         return null;
     }
}
