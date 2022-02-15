package com.bbva.mwer.lib.rurp;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.domain.transaction.Context;
import com.bbva.elara.domain.transaction.ThreadContext;
import javax.annotation.Resource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/MWERRURP-app.xml",
		"classpath:/META-INF/spring/MWERRURP-app-test.xml",
		"classpath:/META-INF/spring/MWERRURP-arc.xml",
		"classpath:/META-INF/spring/MWERRURP-arc-test.xml" })
public class MWERRURPTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(MWERRURPTest.class);

	@Spy
	private Context context;

	@Resource(name = "mwerRURP")
	private MWERRURP mwerRURP;

	@Resource(name = "applicationConfigurationService")
	private ApplicationConfigurationService applicationConfigurationService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		context = new Context();
		ThreadContext.set(context);
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.mwerRURP;
		if(this.mwerRURP instanceof Advised){
			Advised advised = (Advised) this.mwerRURP;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		//mwerRURP.execute();
		Assert.assertEquals(0, context.getAdviceList().size());
	}
	
}
