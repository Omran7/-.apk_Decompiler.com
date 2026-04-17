package com.google.android.gms.internal.measurement;

import R2.b;
import Y4.D;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.internal.play_billing.zzgr;
import com.google.android.recaptcha.internal.zzln;
import com.google.crypto.tink.shaded.protobuf.C0408m;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import i3.C0590f;
import i3.C0592h;
import java.util.ArrayList;

public abstract /* synthetic */ class a {
    public static int a(int i2, int i5, int i6) {
        return zzlk.zzz(i2) + i5 + i6;
    }

    public static int b(int i2, int i5, int i6, int i7) {
        return C0408m.m1(i2) + i5 + i6 + i7;
    }

    public static C0590f c(C0590f fVar, String str) {
        return fVar.E(b.Z()).E(str);
    }

    public static C0590f d(C0590f fVar, String str, String str2) {
        return fVar.E(o.getAccountObject().getId()).E(str).E(str2);
    }

    public static C0590f e(boolean z3) {
        b.w(z3);
        return C0592h.b().e();
    }

    public static String f(int i2, String str) {
        return str + i2;
    }

    public static String g(EditText editText) {
        return editText.getText().toString().trim();
    }

    public static StringBuilder h(String str, int i2, String str2, int i5, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i5);
        sb.append(str3);
        return sb;
    }

    public static void i(Context context, Resources resources, int i2, TextView textView) {
        textView.setTextColor(resources.getColor(i2, context.getTheme()));
    }

    public static void j(C0269a aVar, boolean z3) {
        aVar.c();
        aVar.e(z3);
        b.N0();
    }

    public static void k(MyApplication myApplication, int i2, Context context) {
        v0.e(context, myApplication.getApplicationContext().getString(i2));
    }

    public static void l(MyApplication myApplication, int i2, Context context, int i5) {
        v0.e(context, myApplication.getApplicationContext().getString(i2));
        b.M0(i5);
    }

    public static void m(MyApplication myApplication, int i2, Context context, View view) {
        v0.d(context, view, myApplication.getApplicationContext().getString(i2));
    }

    public static void n(MyApplication myApplication, int i2, Context context, String str) {
        c.s0(context, myApplication.getApplicationContext().getString(i2), str);
    }

    public static void o(MyApplication myApplication, int i2, TextView textView) {
        textView.setText(myApplication.getApplicationContext().getString(i2));
    }

    public static void p(MyApplication myApplication, int i2, MainActivity mainActivity, String str) {
        c.s0(mainActivity, myApplication.getApplicationContext().getString(i2), str);
    }

    public static void q(String str, String str2, String str3, Exception exc, String str4) {
        Log.e(str4, str + str2 + str3 + exc);
    }

    public static void r(String str, String str2, String str3, String str4, Exception exc) {
        Log.e(str4, str + str2 + str3, exc);
    }

    public static void s(ArrayList arrayList, D d, int i2, int i5, int i6) {
        arrayList.add(d);
        arrayList.add(D.s(i2, i5, i6));
    }

    public static boolean t(String str) {
        return str.equals(o.getAccountObject().getId());
    }

    public static int u(int i2, int i5, int i6) {
        return zzgr.zzz(i2) + i5 + i6;
    }

    public static C0590f v(C0590f fVar, String str) {
        return fVar.E(o.getAccountObject().getId()).E(str);
    }

    public static int w(int i2, int i5, int i6) {
        return zzln.zzA(i2) + i5 + i6;
    }

    public static C0590f x(C0590f fVar, String str) {
        return fVar.E(b.a0()).E(str);
    }

    public static /* synthetic */ String y(int i2) {
        switch (i2) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case zzaky.zzf.zzf:
                return "STRING";
            case zzaky.zzf.zzg:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
