package com.Android.Stepdef;
import utils.DriverManager;
import utils.GlobalParams;
import utils.ServerManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.ThreadContext;
public class Hooks {
    @Before
    public void initialize() throws Exception {
        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();
        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_" + params.getDeviceName());
        new ServerManager().startServer();
        new DriverManager().initializeDriver();
    }
    @After
    public void quit(){
       DriverManager driverManager = new DriverManager();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);

        }
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }

    }

}


