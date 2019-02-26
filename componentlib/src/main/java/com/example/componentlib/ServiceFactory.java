package com.example.componentlib;

import com.example.componentlib.Impl.EmptyLoginService;
import com.example.componentlib.Impl.EmptyMineService;
import com.example.componentlib.service.ILoginService;
import com.example.componentlib.service.IMineService;

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance(){
        return instance;
    }

    private ServiceFactory(){

    }

    private ILoginService mLoginService;
    private IMineService mMineService;

    public ILoginService getmLoginService() {
        if (mLoginService == null){
            mLoginService = new EmptyLoginService();
        }
        return mLoginService;
    }

    public void setmLoginService(ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }

    public IMineService getmMineService() {
        if (mMineService == null){
            mMineService = new EmptyMineService();
        }
        return mMineService;
    }

    public void setmMineService(IMineService mMineService) {
        this.mMineService = mMineService;
    }



}
