package T1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.ArrayList;
import java.util.List;

public final class I extends zzbm implements J {
    public I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final List A(String str, String str2, String str3, boolean z3) {
        Parcel zza = zza();
        zza.writeString((String) null);
        zza.writeString(str2);
        zza.writeString(str3);
        int i2 = zzbo.zza;
        zza.writeInt(z3 ? 1 : 0);
        Parcel zzb = zzb(15, zza);
        ArrayList<W1> createTypedArrayList = zzb.createTypedArrayList(W1.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void c(W1 w12, Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, w12);
        zzbo.zzd(zza, z12);
        zzc(2, zza);
    }

    public final byte[] d(C0214v vVar, String str) {
        Parcel zza = zza();
        zzbo.zzd(zza, vVar);
        zza.writeString(str);
        Parcel zzb = zzb(9, zza);
        byte[] createByteArray = zzb.createByteArray();
        zzb.recycle();
        return createByteArray;
    }

    public final void e(Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        zzc(25, zza);
    }

    public final List f(String str, String str2, boolean z3, Z1 z12) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i2 = zzbo.zza;
        zza.writeInt(z3 ? 1 : 0);
        zzbo.zzd(zza, z12);
        Parcel zzb = zzb(14, zza);
        ArrayList<W1> createTypedArrayList = zzb.createTypedArrayList(W1.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final String g(Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        Parcel zzb = zzb(11, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final void h(C0164e eVar, Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, eVar);
        zzbo.zzd(zza, z12);
        zzc(12, zza);
    }

    public final void i(Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        zzc(18, zza);
    }

    public final void k(Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        zzc(4, zza);
    }

    public final void l(Z1 z12, M1 m12, N n2) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        zzbo.zzd(zza, m12);
        zzbo.zze(zza, n2);
        zzc(29, zza);
    }

    public final void m(Z1 z12, Bundle bundle, L l6) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        zzbo.zzd(zza, bundle);
        zzbo.zze(zza, l6);
        zzc(31, zza);
    }

    public final void n(Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        zzc(20, zza);
    }

    public final C0176i o(Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        Parcel zzb = zzb(21, zza);
        C0176i iVar = (C0176i) zzbo.zza(zzb, C0176i.CREATOR);
        zzb.recycle();
        return iVar;
    }

    public final void p(C0214v vVar, Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, vVar);
        zzbo.zzd(zza, z12);
        zzc(1, zza);
    }

    public final void q(Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        zzc(27, zza);
    }

    public final List r(String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeString((String) null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(17, zza);
        ArrayList<C0164e> createTypedArrayList = zzb.createTypedArrayList(C0164e.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void s(Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        zzc(6, zza);
    }

    public final void t(Z1 z12, C0161d dVar) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        zzbo.zzd(zza, dVar);
        zzc(30, zza);
    }

    public final void u(Z1 z12, Bundle bundle) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zzbo.zzd(zza, z12);
        zzc(19, zza);
    }

    public final List v(String str, String str2, Z1 z12) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, z12);
        Parcel zzb = zzb(16, zza);
        ArrayList<C0164e> createTypedArrayList = zzb.createTypedArrayList(C0164e.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void y(long j6, String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeLong(j6);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    public final void z(Z1 z12) {
        Parcel zza = zza();
        zzbo.zzd(zza, z12);
        zzc(26, zza);
    }
}
