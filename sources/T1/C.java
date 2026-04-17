package T1;

import A4.c;
import E3.a;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzqo;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.firebase.components.ComponentRegistrar;
import g3.C0549b;
import java.util.ArrayList;
import java.util.List;

public /* synthetic */ class C implements F, a, V0.a {

    /* renamed from: b  reason: collision with root package name */
    public static C f2811b;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2812a;

    public /* synthetic */ C(int i2) {
        this.f2812a = i2;
    }

    public Signature[] a(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C0549b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f8013a;
            if (str != null) {
                c cVar = new c(str, 3, (Object) bVar);
                bVar = new C0549b(str, bVar.f8014b, bVar.f8015c, bVar.d, bVar.f8016e, cVar, bVar.g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public Object j() {
        return new ArrayList();
    }

    public Object zza() {
        switch (this.f2812a) {
            case 0:
                List list = H.f2892a;
                return Long.valueOf(zzpb.zzg());
            case 1:
                List list2 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzm());
            case 2:
                List list3 = H.f2892a;
                return Long.valueOf(zzpb.zzy());
            case 3:
                List list4 = H.f2892a;
                return zzqo.zzf();
            case 4:
                List list5 = H.f2892a;
                return Boolean.valueOf(zzpt.zzb());
            case 5:
                List list6 = H.f2892a;
                return Long.valueOf(zzqo.zzb());
            case zzaky.zzf.zzf /*6*/:
                List list7 = H.f2892a;
                return Double.valueOf(zzqo.zza());
            case zzaky.zzf.zzg /*7*/:
                List list8 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzn());
            case 8:
                List list9 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzc());
            case 9:
                List list10 = H.f2892a;
                return Long.valueOf(zzpb.zzO());
            case 10:
                List list11 = H.f2892a;
                return zzpb.zzag();
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                List list12 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzi());
            case 12:
                List list13 = H.f2892a;
                return zzpb.zzan();
            case 13:
                List list14 = H.f2892a;
                return Long.valueOf(zzpb.zzf());
            case 14:
                List list15 = H.f2892a;
                return zzpb.zzas();
            case 15:
                List list16 = H.f2892a;
                return Boolean.valueOf(zzpk.zzb());
            case 16:
                List list17 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzT());
            case 17:
                List list18 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzK());
            case 18:
                List list19 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzp());
            case 19:
                List list20 = H.f2892a;
                return Boolean.valueOf(zzpb.zzat());
            default:
                List list21 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzu());
        }
    }
}
