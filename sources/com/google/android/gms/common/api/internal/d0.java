package com.google.android.gms.common.api.internal;

import A2.f;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;

public final class d0 extends Fragment implements C0359m {

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f6085b = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final f f6086a = new f(4, (byte) 0);

    public final void b(String str, C0358l lVar) {
        this.f6086a.x(str, lVar);
    }

    public final C0358l d(Class cls, String str) {
        return (C0358l) cls.cast(((Map) this.f6086a.f30c).get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (C0358l dump : ((Map) this.f6086a.f30c).values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final Activity g() {
        return getActivity();
    }

    public final void onActivityResult(int i2, int i5, Intent intent) {
        super.onActivityResult(i2, i5, intent);
        for (C0358l onActivityResult : ((Map) this.f6086a.f30c).values()) {
            onActivityResult.onActivityResult(i2, i5, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6086a.y(bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        f fVar = this.f6086a;
        fVar.f29b = 5;
        for (C0358l onDestroy : ((Map) fVar.f30c).values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        f fVar = this.f6086a;
        fVar.f29b = 3;
        for (C0358l onResume : ((Map) fVar.f30c).values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f6086a.z(bundle);
    }

    public final void onStart() {
        super.onStart();
        f fVar = this.f6086a;
        fVar.f29b = 2;
        for (C0358l onStart : ((Map) fVar.f30c).values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        f fVar = this.f6086a;
        fVar.f29b = 4;
        for (C0358l onStop : ((Map) fVar.f30c).values()) {
            onStop.onStop();
        }
    }
}
