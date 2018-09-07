package analytics.server.capture.app.com.analyticserverapp;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.gm.analytics.IAnalyticsInterface;


public class AddService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    private final IAnalyticsInterface.Stub mBinder = new IAnalyticsInterface.Stub() {
        @Override
        public String event(Bundle event, Bundle[] options) throws RemoteException {
            return null;
        }
    };
}
