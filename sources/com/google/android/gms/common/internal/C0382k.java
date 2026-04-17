package com.google.android.gms.common.internal;

import A1.a;
import a.C0251c;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import z1.d;

/* renamed from: com.google.android.gms.common.internal.k  reason: case insensitive filesystem */
public final class C0382k extends a {
    public static final Parcelable.Creator<C0382k> CREATOR = new C0251c(27);

    /* renamed from: x  reason: collision with root package name */
    public static final Scope[] f6183x = new Scope[0];

    /* renamed from: y  reason: collision with root package name */
    public static final d[] f6184y = new d[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f6185a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6186b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6187c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f6188e;

    /* renamed from: f  reason: collision with root package name */
    public Scope[] f6189f;

    /* renamed from: p  reason: collision with root package name */
    public Bundle f6190p;

    /* renamed from: q  reason: collision with root package name */
    public Account f6191q;

    /* renamed from: r  reason: collision with root package name */
    public d[] f6192r;

    /* renamed from: s  reason: collision with root package name */
    public d[] f6193s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f6194t;

    /* renamed from: u  reason: collision with root package name */
    public final int f6195u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6196v;

    /* renamed from: w  reason: collision with root package name */
    public final String f6197w;

    public C0382k(int i2, int i5, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z3, int i7, boolean z4, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        d[] dVarArr3;
        Account account2;
        Object obj;
        int i8 = i2;
        String str3 = str;
        IBinder iBinder2 = iBinder;
        if (scopeArr == null) {
            scopeArr2 = f6183x;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        d[] dVarArr4 = f6184y;
        if (dVarArr == null) {
            dVarArr3 = dVarArr4;
        } else {
            dVarArr3 = dVarArr;
        }
        dVarArr4 = dVarArr2 != null ? dVarArr2 : dVarArr4;
        this.f6185a = i8;
        this.f6186b = i5;
        this.f6187c = i6;
        if ("com.google.android.gms".equals(str3)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str3;
        }
        if (i8 < 2) {
            account2 = null;
            if (iBinder2 != null) {
                int i9 = C0372a.f6167a;
                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof C0386o) {
                    obj = (C0386o) queryLocalInterface;
                } else {
                    obj = new zza(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
                }
                if (obj != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        X x6 = (X) obj;
                        Parcel zzB = x6.zzB(2, x6.zza());
                        Account account3 = (Account) zzc.zza(zzB, Account.CREATOR);
                        zzB.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.f6188e = iBinder2;
            account2 = account;
        }
        this.f6191q = account2;
        this.f6189f = scopeArr2;
        this.f6190p = bundle2;
        this.f6192r = dVarArr3;
        this.f6193s = dVarArr4;
        this.f6194t = z3;
        this.f6195u = i7;
        this.f6196v = z4;
        this.f6197w = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        C0251c.a(this, parcel, i2);
    }
}
