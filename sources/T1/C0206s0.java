package T1;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: T1.s0  reason: case insensitive filesystem */
public final /* synthetic */ class C0206s0 implements C0163d1 {

    /* renamed from: a  reason: collision with root package name */
    public final C0212u0 f3464a;

    public /* synthetic */ C0206s0(C0212u0 u0Var) {
        this.f3464a = u0Var;
    }

    public void a(int i2, IOException iOException, byte[] bArr) {
        Z z3;
        int i5 = i2;
        IOException iOException2 = iOException;
        byte[] bArr2 = bArr;
        C0212u0 u0Var = this.f3464a;
        if (!(i5 == 200 || i5 == 204)) {
            if (i5 == 304) {
                i5 = 304;
            }
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3175r.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i5), iOException2);
        }
        if (iOException2 == null) {
            C0174h0 h0Var = u0Var.f3495q;
            C0212u0.i(h0Var);
            h0Var.f3314D.a(true);
            Z z5 = u0Var.f3496r;
            if (bArr2 == null || bArr2.length == 0) {
                C0212u0.k(z5);
                z5.f3179v.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    C0212u0.k(z5);
                    z5.f3179v.a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                Y1 y12 = u0Var.f3499u;
                C0212u0.i(y12);
                C0212u0 u0Var2 = (C0212u0) y12.f398a;
                if (TextUtils.isEmpty(optString)) {
                    z3 = z5;
                } else {
                    Context context = u0Var2.f3489a;
                    z3 = z5;
                    try {
                        C0212u0 u0Var3 = u0Var2;
                        String str = "timestamp";
                        double d = optDouble;
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(optString3)) {
                                bundle.putString("gbraid", optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                bundle.putString("gad_source", optString4);
                            }
                            bundle.putString("gclid", optString2);
                            bundle.putString("_cis", "ddp");
                            u0Var.f3503y.z("auto", "_cmp", bundle);
                            if (!TextUtils.isEmpty(optString)) {
                                try {
                                    SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    edit.putString("deeplink", optString);
                                    edit.putLong(str, Double.doubleToRawLongBits(d));
                                    if (edit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = u0Var3.f3489a;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, (String) null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (RuntimeException e6) {
                                    Z z6 = u0Var3.f3496r;
                                    C0212u0.k(z6);
                                    z6.f3172f.b(e6, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (JSONException e7) {
                        e = e7;
                        z5 = z3;
                        C0212u0.k(z5);
                        z5.f3172f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                C0212u0.k(z3);
                z5 = z3;
                z5.f3175r.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                return;
            } catch (JSONException e8) {
                e = e8;
            }
        }
        Z z42 = u0Var.f3496r;
        C0212u0.k(z42);
        z42.f3175r.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i5), iOException2);
    }

    public void b(Bundle bundle, String str) {
        String str2;
        C0212u0 u0Var = this.f3464a;
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.o();
        if (!u0Var.a()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                C0174h0 h0Var = u0Var.f3495q;
                C0212u0.i(h0Var);
                h0Var.f3316G.D(str2);
                u0Var.f3501w.getClass();
                h0Var.f3317H.b(System.currentTimeMillis());
            }
        }
    }

    public boolean c() {
        C0174h0 h0Var = this.f3464a.f3495q;
        C0212u0.i(h0Var);
        if (h0Var.f3317H.a() > 0) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (!c()) {
            return false;
        }
        C0212u0 u0Var = this.f3464a;
        u0Var.f3501w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C0174h0 h0Var = u0Var.f3495q;
        C0212u0.i(h0Var);
        if (currentTimeMillis - h0Var.f3317H.a() > u0Var.f3494p.w((String) null, H.f2913i0)) {
            return true;
        }
        return false;
    }
}
