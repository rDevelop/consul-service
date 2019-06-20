package us.rlit.ds.consul.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import us.rlit.ds.consul.discovery.DiscoveryClientApplication;
import us.rlit.ds.consul.health.ServiceDiscoveryApplication;
import us.rlit.ds.consul.properties.DistributedPropertiesApplication;


/**
 * 
 * This Live test requires:
 * * a Consul instance running on port 8500
 * * Consul configured with particular properties (e.g. 'my.prop')
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { DiscoveryClientApplication.class, ServiceDiscoveryApplication.class,
		DistributedPropertiesApplication.class })
public class SpringContextLiveTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
