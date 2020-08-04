package org.testing.runner;

import java.io.IOException;

import org.testing.TestScripts.DeleteRequestTC;
import org.testing.TestScripts.GetRequestTC;
import org.testing.TestScripts.GetRequestWithQueryParam;
import org.testing.TestScripts.PatchRequestTC;
import org.testing.TestScripts.PostRequestTC;
import org.testing.TestScripts.PutRequestTC;

public class TCRunnerClass {

	public static void main(String[] args) throws IOException {
		
		
		PostRequestTC post=new PostRequestTC();
		post.tc1();
		
		GetRequestTC get=new GetRequestTC();
		get.tc2();
		
		GetRequestWithQueryParam queryParam=new GetRequestWithQueryParam();
		queryParam.tc3();
		
		PutRequestTC put=new PutRequestTC();
		put.tc4();
		
		PatchRequestTC patch=new PatchRequestTC();
		patch.tc5();
		
		DeleteRequestTC delete=new DeleteRequestTC();
		delete.tc6();

	}

}
