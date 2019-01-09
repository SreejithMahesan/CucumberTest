package Common;

import FunctionLibrary.Global;
import FunctionLibrary.HTML_Report;

public final class GlobalObjects {
	public static HTML_Report reporter ;
	public static Global objGlobal;
	
	synchronized public static HTML_Report getHTML_Report()
	{
		if (reporter == null)
		{
			reporter = new HTML_Report();
		}
		return reporter;
	}
	
	synchronized public  static Global getGlobal()
	{
		if(objGlobal == null)
		{
			objGlobal= new Global();
		}
		return objGlobal;
	}
	
//	Global.cfnRootPath();
//	reporter = new HTML_Report();
//	objGlobal = new Global();
//	reporter.mstrModuleName = "Login Feature";
//	reporter.mstrTC_Name = this.getClass().getSimpleName();
//	reporter.mstrTC_Desc = "TestCaseDescription";
//	objGlobal.cfnModuleRootPath(reporter.mstrModuleName);

}
