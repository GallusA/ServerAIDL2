package com.example.gallusawa.serveraidl2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import java.util.ArrayList;
import java.util.List;

public class AIDLService extends Service {

    List<String> allNames = new ArrayList<>();

    public AIDLService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new IMyAidlInterface.Stub() {
            @Override
            public List<String> getStrings() throws RemoteException {
                getNames();
                return allNames;
            }
        };
    }

    private void getNames() {

        allNames.add("Mike");
        allNames.add("Zach");
        allNames.add("Todo");
        allNames.add("Nori");
        allNames.add("Joel");
        allNames.add("Fiscal");

    }
}
