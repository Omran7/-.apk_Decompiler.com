package com.google.android.gms.common.api.internal;

import A2.f;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0286s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;

public final class e0 extends C0286s implements C0359m {

    /* renamed from: e0  reason: collision with root package name */
    public static final WeakHashMap f6087e0 = new WeakHashMap();

    /* renamed from: d0  reason: collision with root package name */
    public final f f6088d0 = new f(4, (byte) 0);

    public final void B(Bundle bundle) {
        super.B(bundle);
        this.f6088d0.y(bundle);
    }

    public final void D() {
        this.f5157L = true;
        f fVar = this.f6088d0;
        fVar.f29b = 5;
        for (C0358l onDestroy : ((Map) fVar.f30c).values()) {
            onDestroy.onDestroy();
        }
    }

    public final void I() {
        this.f5157L = true;
        f fVar = this.f6088d0;
        fVar.f29b = 3;
        for (C0358l onResume : ((Map) fVar.f30c).values()) {
            onResume.onResume();
        }
    }

    public final void J(Bundle bundle) {
        this.f6088d0.z(bundle);
    }

    public final void K() {
        this.f5157L = true;
        f fVar = this.f6088d0;
        fVar.f29b = 2;
        for (C0358l onStart : ((Map) fVar.f30c).values()) {
            onStart.onStart();
        }
    }

    public final void L() {
        this.f5157L = true;
        f fVar = this.f6088d0;
        fVar.f29b = 4;
        for (C0358l onStop : ((Map) fVar.f30c).values()) {
            onStop.onStop();
        }
    }

    public final void b(String str, C0358l lVar) {
        this.f6088d0.x(str, lVar);
    }

    public final C0358l d(Class cls, String str) {
        return (C0358l) cls.cast(((Map) this.f6088d0.f30c).get(str));
    }

    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.j(str, fileDescriptor, printWriter, strArr);
        for (C0358l dump : ((Map) this.f6088d0.f30c).values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void z(int i2, int i5, Intent intent) {
        super.z(i2, i5, intent);
        for (C0358l onActivityResult : ((Map) this.f6088d0.f30c).values()) {
            onActivityResult.onActivityResult(i2, i5, intent);
        }
    }
}
