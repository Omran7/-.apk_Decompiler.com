package c;

import android.support.v4.media.session.a;
import androidx.activity.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: c.h  reason: case insensitive filesystem */
public final class C0333h extends C0328c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5570a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f5571b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f5572c;
    public final /* synthetic */ a d;

    public /* synthetic */ C0333h(m mVar, String str, a aVar, int i2) {
        this.f5570a = i2;
        this.f5571b = mVar;
        this.f5572c = str;
        this.d = aVar;
    }

    public final void a(Object obj) {
        switch (this.f5570a) {
            case 0:
                m mVar = this.f5571b;
                LinkedHashMap linkedHashMap = mVar.f4635b;
                String str = this.f5572c;
                Object obj2 = linkedHashMap.get(str);
                a aVar = this.d;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    ArrayList arrayList = mVar.d;
                    arrayList.add(str);
                    try {
                        mVar.b(intValue, aVar, obj);
                        return;
                    } catch (Exception e6) {
                        arrayList.remove(str);
                        throw e6;
                    }
                } else {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
            default:
                m mVar2 = this.f5571b;
                LinkedHashMap linkedHashMap2 = mVar2.f4635b;
                String str2 = this.f5572c;
                Object obj3 = linkedHashMap2.get(str2);
                a aVar2 = this.d;
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    ArrayList arrayList2 = mVar2.d;
                    arrayList2.add(str2);
                    try {
                        mVar2.b(intValue2, aVar2, obj);
                        return;
                    } catch (Exception e7) {
                        arrayList2.remove(str2);
                        throw e7;
                    }
                } else {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
        }
    }

    public void b() {
        this.f5571b.f(this.f5572c);
    }
}
