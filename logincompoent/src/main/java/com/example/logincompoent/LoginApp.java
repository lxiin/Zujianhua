package com.example.logincompoent;

import android.app.Application;

import com.example.componentlib.IAppComponent;
import com.example.componentlib.ServiceFactory;

public class LoginApp extends Application implements IAppComponent {

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
        ServiceFactory.getInstance().setmLoginService(new LoginService());
    }



}
