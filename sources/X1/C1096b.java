package x1;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import o3.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w1.C1077c;

/* renamed from: x1.b  reason: case insensitive filesystem */
public final class C1096b {

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantLock f12533c = new ReentrantLock();
    public static C1096b d;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f12534a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f12535b;

    public C1096b(Context context) {
        this.f12535b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C1096b a(Context context) {
        I.g(context);
        ReentrantLock reentrantLock = f12533c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new C1096b(context.getApplicationContext());
            }
            C1096b bVar = d;
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String g(String str, String str2) {
        return d.g(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String e6;
        String e7 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e7) || (e6 = e(g("googleSignInAccount", e7))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.v(e6);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final GoogleSignInOptions c() {
        String e6;
        String e7 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e7) || (e6 = e(g("googleSignInOptions", e7))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.v(e6);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        I.g(googleSignInAccount);
        I.g(googleSignInOptions);
        String str = googleSignInAccount.f5968r;
        f("defaultGoogleSignInAccount", str);
        String g = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f5962b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f5963c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f5964e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f5970t;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f5971u;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f5965f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f5966p;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f5967q);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.f5969s;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, C1077c.f12414b);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f6001b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g, jSONObject.toString());
            String g5 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.f5984q;
            String str10 = googleSignInOptions.f5983p;
            ArrayList arrayList2 = googleSignInOptions.f5979b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.f5977x);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((Scope) it2.next()).f6001b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f5980c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f5982f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f5981e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                f(g5, jSONObject2.toString());
            } catch (JSONException e6) {
                throw new RuntimeException(e6);
            }
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f12534a;
        reentrantLock.lock();
        try {
            return this.f12535b.getString(str, (String) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.f12534a;
        reentrantLock.lock();
        try {
            this.f12535b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
