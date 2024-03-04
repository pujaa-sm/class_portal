package com.day2_cw1.day1_cw1.config;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppConfig {
    
    @Value("rever1") 
    public String appName;
    @Value("1.2.1")
    public String appVersion;
public String getAppName() {
    return appName;
}
public void setAppName(String appName) {
    this.appName = appName;
}
public String getAppVersion() {
    return appVersion;
}
public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
}
}