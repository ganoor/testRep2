package org.com.sample ;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.com.sample.SampleApplication;
import org.junit.jupiter.api.Test;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = SampleApplication.class)
public class SampleApplicationTest {
	
	@Mock
	private SpringApplicationBuilder springApplicationBuilder;
	
	
	/*@Test
	public void applicationContextTest() {
		
		 DmapExtensionApplication.main(new String[] {});
		 assertTrue(true);
	}*/
	
	//@Test
	public void configureTest() {
		SampleApplication app = new SampleApplication();

		Mockito.when(springApplicationBuilder.sources(SampleApplication.class)).thenReturn(springApplicationBuilder);

		SpringApplicationBuilder result = app.configure(springApplicationBuilder);

		Mockito.verify(springApplicationBuilder).sources(SampleApplication.class);

		assertEquals(springApplicationBuilder, result);
	}
}
