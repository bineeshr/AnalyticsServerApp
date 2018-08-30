package analytics.server.capture.app.com.analyticserverapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import analytics.capture.app.com.ICaptureAnalytics;

public class AddService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    private final ICaptureAnalytics.Stub mBinder = new ICaptureAnalytics.Stub() {


        @Override
        public String event(String event) throws RemoteException {

            return "SUCCESS";
        }
    };
}
