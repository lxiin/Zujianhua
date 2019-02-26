package com.example.minecomponent;

import android.app.Application;

import com.example.componentlib.IAppComponent;
import com.example.componentlib.ServiceFactory;

public class MineApp extends Application implements IAppComponent {

    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);

    }

    @Override
    public void initializa(Application app) {
        application = app;

        ServiceFactory.getInstance().setmMineService(new MineService());


    }
}
