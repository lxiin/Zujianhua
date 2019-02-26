package com.example.zujianhua;

import android.app.Application;

import com.example.componentlib.AppConfig;
import com.example.componentlib.IAppComponent;

public class MainApp extends Application implements IAppComponent {

    private static MainApp application;

    public static MainApp getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application app) {
        application = (MainApp) app;
        for (String component : AppConfig.COMPONENTS){
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IAppComponent){
                    ((IAppComponent) object).initializa(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
