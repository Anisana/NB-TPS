package com.netbuilder.tps.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.netbuilder.tps.entity.Status;
import com.netbuilder.tps.servicesbean.AvailabilityServiceBean;
import com.netbuilder.tps.servicesbean.ColorServiceBean;
import com.netbuilder.tps.servicesbean.GroupServiceBean;
import com.netbuilder.tps.servicesbean.ModuleServiceBean;
import com.netbuilder.tps.servicesbean.StatusServiceBean;
import com.netbuilder.tps.servicesbean.SupportServiceBean;
import com.netbuilder.tps.servicesbean.TopicServiceBean;
import com.netbuilder.tps.servicesbean.TraineeServiceBean;
import com.netbuilder.tps.servicesbean.TrainerServiceBean;


@Singleton
@Startup
@DataSourceDefinition(
        className = "com.mysql.jdbc.Driver",
        name = "java:global/jdbc/tps_mysql",
//        serverName="127.0.0.1",
        portNumber=3306,
        user = "root",
        password = "",
        databaseName = "tps_mysql",
        		properties = {"connectionAttributes=;create=true"}
)
public class StartupClass{
	
	@Inject
	private AvailabilityServiceBean availabilityBean;
	
	@Inject
	private ColorServiceBean colorBean;
	
	@Inject
	private GroupServiceBean groupBean;
	
	@Inject 
	private ModuleServiceBean moduleBean;
	
	@Inject
	private StatusServiceBean statusBean;
	
	@Inject
	private SupportServiceBean supportBean;
	
	@Inject
	private TopicServiceBean topicBean;
	
	@Inject
	private TraineeServiceBean traineeBean;
	
	@Inject
	private TrainerServiceBean trainerBean;
	

	
	@PostConstruct
	private void method0(){
		System.out.println("Post-Construct has been called");
		
		statusBean.readStatus(new Object());
		populateDB();
	}
	

	
	@PreDestroy
	private void method1(){
		System.out.println("Pre-Destroy has been called");	
	}
	
	private void populateDB(){
		
		Status active = new Status("Active");
		Status completed = new Status("Completed");
		Status planned = new Status("Planned");
		
		statusBean.createStatus(active);
		statusBean.createStatus(completed);
		statusBean.createStatus(planned);
		
		
		
	}

}
