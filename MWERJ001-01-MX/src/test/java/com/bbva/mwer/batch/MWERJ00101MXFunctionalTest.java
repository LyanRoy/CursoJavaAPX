package com.bbva.mwer.batch;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test for batch process MWERJ001-01-MX
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/META-INF/spring/batch/beans/MWERJ001-01-MX-beans.xml","classpath:/META-INF/spring/batch/jobs/jobs-MWERJ001-01-MX-context.xml","classpath:/META-INF/spring/jobs-MWERJ001-01-MX-runner-context.xml"})
public class MWERJ00101MXFunctionalTest{

	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;


	@Test
	public void testLaunchJob() throws Exception {
		//TODO implements job launch test
		//Without parameters (use this implementation if job not need parameters)
		final JobExecution jobExecution = jobLauncherTestUtils.launchJob();
		
		//With parameters (use this implementation if job needs parameters comment first implementation) 
		/*********************** Parameters Definition ***********************/
		//First parameter
//		final JobParameter jobParameter = new JobParameter("ParamValue");
		//Add parameters to job
//		final HashMap<String, JobParameter> parameters = new HashMap<String, JobParameter>();
//		parameters.put("paramName", jobParameter);
//		final JobParameters jobParameters = new JobParameters(parameters);
//		final JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParameters);
		
		//TODO implements job launch test Assert's
		Assert.assertTrue(jobExecution.getExitStatus().equals(ExitStatus.COMPLETED));
	}
}
