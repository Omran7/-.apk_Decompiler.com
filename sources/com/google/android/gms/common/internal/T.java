package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public final class T implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ U f6159a;

    public /* synthetic */ T(U u6) {
        this.f6159a = u6;
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f6159a.d) {
                try {
                    Q q6 = (Q) message.obj;
                    S s6 = (S) this.f6159a.d.get(q6);
                    if (s6 != null && s6.f6154a.isEmpty()) {
                        if (s6.f6156c) {
                            s6.g.f6161f.removeMessages(1, s6.f6157e);
                            U u6 = s6.g;
                            u6.g.c(u6.f6160e, s6);
                            s6.f6156c = false;
                            s6.f6155b = 2;
                        }
                        this.f6159a.d.remove(q6);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            synchronized (this.f6159a.d) {
                try {
                    Q q7 = (Q) message.obj;
                    S s7 = (S) this.f6159a.d.get(q7);
                    if (s7 != null && s7.f6155b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(q7)), new Exception());
                        ComponentName componentName = s7.f6158f;
                        if (componentName == null) {
                            q7.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = q7.f6152b;
                            I.g(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        s7.onServiceDisconnected(componentName);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }
}
