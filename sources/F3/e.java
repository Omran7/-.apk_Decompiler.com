package F3;

import A3.b;
import D2.l;
import I5.u;
import K.C0064d;
import K.O;
import K3.a;
import S3.C0149j;
import S3.t;
import S3.z;
import W0.y;
import Z4.h;
import a1.C0257b;
import a1.C0258c;
import a5.C0264a;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.ImageView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import b1.m;
import b3.C0317a;
import b5.k;
import c.C0326a;
import c.C0327b;
import com.bumptech.glide.c;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.StorageRegistrar;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0423c;
import com.mtma.criminal.city.utils.C0434d;
import com.mtma.criminal.city.utils.H;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.r0;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import f.C0518i;
import f1.C0521a;
import f3.C0524a;
import g3.d;
import i1.i;
import i1.j;
import i3.C0592h;
import j1.C0607c;
import j4.C0630j;
import j4.M0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k.C0744w;
import k1.C0757b;
import u4.C1034c;
import u4.f;
import u4.g;

public final /* synthetic */ class e implements Continuation, C0327b, SuccessContinuation, d, r0, H, C0757b, a, C0434d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f738a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f739b;

    public /* synthetic */ e(h hVar, p pVar) {
        this.f738a = 0;
        this.f739b = hVar;
    }

    public void a(C0264a aVar) {
        boolean z3 = aVar.isAllProcessSuccess;
        int i2 = aVar.currentPlace;
        g gVar = ((C1034c) this.f739b).f11868a;
        gVar.getClass();
        if (z3) {
            k kVar = new k(18, o.getAccountObject().getId(), o.getMainStatesObject().getNickName());
            String str = gVar.f11905e0;
            c.k0(str, kVar);
            gVar.Z();
            if (gVar.f11913i1 < gVar.f11908f1.getMainStatesObject().getHealthCurrent()) {
                com.bumptech.glide.d.j1(gVar.f11913i1, str, (C1034c) null);
            }
        }
    }

    public Object b() {
        Cursor rawQuery;
        Object obj = this.f739b;
        switch (this.f738a) {
            case 12:
                j1.g gVar = (j1.g) ((C0607c) obj);
                gVar.getClass();
                int i2 = C0521a.f7879e;
                z zVar = new z(10, false);
                zVar.f2712c = null;
                zVar.d = new ArrayList();
                zVar.f2713e = null;
                zVar.f2711b = "";
                HashMap hashMap = new HashMap();
                SQLiteDatabase c3 = gVar.c();
                c3.beginTransaction();
                try {
                    C0521a aVar = (C0521a) j1.g.o(c3.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new b(gVar, hashMap, zVar, 7));
                    c3.setTransactionSuccessful();
                    return aVar;
                } finally {
                    c3.endTransaction();
                }
            case 13:
                j1.g gVar2 = (j1.g) ((j1.d) obj);
                long g = gVar2.f8807b.g() - gVar2.d.d;
                SQLiteDatabase c6 = gVar2.c();
                c6.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(g)};
                    rawQuery = c6.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i5 = rawQuery.getInt(0);
                        gVar2.l((long) i5, f1.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = c6.delete("events", "timestamp_ms < ?", strArr);
                    c6.setTransactionSuccessful();
                    c6.endTransaction();
                    return Integer.valueOf(delete);
                } catch (Throwable th) {
                    c6.endTransaction();
                    throw th;
                }
            case 14:
                j1.g gVar3 = (j1.g) ((i) obj).f8272i;
                SQLiteDatabase c7 = gVar3.c();
                c7.beginTransaction();
                try {
                    c7.compileStatement("DELETE FROM log_event_dropped").execute();
                    c7.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f8807b.g()).execute();
                    c7.setTransactionSuccessful();
                    return null;
                } finally {
                    c7.endTransaction();
                }
            default:
                j jVar = (j) obj;
                for (c1.j a6 : (Iterable) ((j1.g) jVar.f8274b).j(new h3.j(4))) {
                    jVar.f8275c.a(a6, 1, false);
                }
                return null;
        }
    }

    public C0258c c(Object obj) {
        OutputStream outputStream;
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        Throwable th2;
        C3.e eVar;
        Throwable th3;
        InputStream inputStream;
        Throwable th4;
        C0257b bVar = (C0257b) obj;
        a1.d dVar = (a1.d) this.f739b;
        URL url = bVar.f4546a;
        String f02 = android.support.v4.media.session.a.f0("CctTransportBackend");
        if (Log.isLoggable(f02, 4)) {
            Log.i(f02, String.format("Making request to: %s", new Object[]{url}));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f4546a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = bVar.f4548c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            outputStream = httpURLConnection.getOutputStream();
            gZIPOutputStream = new GZIPOutputStream(outputStream);
            U3.c cVar = dVar.f4552a;
            b1.i iVar = bVar.f4547b;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
            C3.d dVar2 = (C3.d) cVar.f3713b;
            new C3.e(bufferedWriter, dVar2.f460a, dVar2.f461b, dVar2.f462c, dVar2.d);
            C3.e eVar2 = eVar;
            eVar2.f(iVar);
            eVar2.h();
            eVar2.f464b.flush();
            gZIPOutputStream.close();
            if (outputStream != null) {
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            Integer valueOf = Integer.valueOf(responseCode);
            String f03 = android.support.v4.media.session.a.f0("CctTransportBackend");
            if (Log.isLoggable(f03, 4)) {
                Log.i(f03, String.format("Status Code: %d", new Object[]{valueOf}));
            }
            android.support.v4.media.session.a.o(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
            android.support.v4.media.session.a.o(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                return new C0258c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
            }
            if (responseCode != 200) {
                return new C0258c(responseCode, (URL) null, 0);
            }
            InputStream inputStream2 = httpURLConnection.getInputStream();
            try {
                if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                    inputStream = new GZIPInputStream(inputStream2);
                } else {
                    inputStream = inputStream2;
                }
                C0258c cVar2 = new C0258c(responseCode, (URL) null, m.a(new BufferedReader(new InputStreamReader(inputStream))).f5499a);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                return cVar2;
            } catch (Throwable th5) {
                th3.addSuppressed(th5);
            }
            throw th3;
            throw th;
            throw th4;
            throw th2;
        } catch (ConnectException | UnknownHostException e6) {
            android.support.v4.media.session.a.q(e6, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new C0258c(500, (URL) null, 0);
        } catch (b | IOException e7) {
            android.support.v4.media.session.a.q(e7, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new C0258c(400, (URL) null, 0);
        } catch (Throwable th6) {
            th.addSuppressed(th6);
        }
    }

    public void d(int i2, boolean z3) {
        r4.j jVar = (r4.j) this.f739b;
        if (z3) {
            jVar.f11252k0.setText(String.valueOf(i2));
            R2.b.c(jVar.f11254m0, 1);
            return;
        }
        jVar.getClass();
    }

    public void e(Object obj) {
        Uri uri;
        Object obj2 = this.f739b;
        switch (this.f738a) {
            case 3:
                C0326a aVar = (C0326a) obj;
                k kVar = (k) obj2;
                kotlin.jvm.internal.j.e(kVar, "this$0");
                kotlin.jvm.internal.j.e(aVar, "activityRes");
                int i2 = aVar.f5560a;
                CropImageActivity cropImageActivity = (CropImageActivity) ((t) kVar.f769b).f2700b;
                if (i2 == -1) {
                    Intent intent = aVar.f5561b;
                    if (intent == null || (uri = intent.getData()) == null) {
                        uri = (Uri) kVar.f771e;
                    }
                    if (uri == null) {
                        cropImageActivity.r();
                        return;
                    }
                    cropImageActivity.f5847I = uri;
                    CropImageView cropImageView = cropImageActivity.f5849K;
                    if (cropImageView != null) {
                        cropImageView.setImageUriAsync(uri);
                        return;
                    }
                    return;
                }
                cropImageActivity.r();
                return;
            case 9:
                y yVar = (y) obj;
                C0423c cVar = (C0423c) obj2;
                cVar.getClass();
                if (yVar.f4054c == null) {
                    try {
                        Bitmap decodeFile = BitmapFactory.decodeFile(yVar.a(MyApplication.f7090a.getApplicationContext()));
                        cVar.f7171m0 = decodeFile;
                        Bitmap b02 = I1.b.b0(decodeFile);
                        cVar.f7171m0 = b02;
                        cVar.f7168j0.setImageBitmap(b02);
                        return;
                    } catch (Exception e6) {
                        com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "c", " in onActivityResult method.", e6, "c");
                        return;
                    }
                } else {
                    return;
                }
            default:
                y yVar2 = (y) obj;
                l4.i iVar = (l4.i) obj2;
                iVar.getClass();
                if (yVar2.f4054c == null) {
                    try {
                        Bitmap decodeFile2 = BitmapFactory.decodeFile(yVar2.a(MyApplication.f7090a.getApplicationContext()));
                        iVar.f9800W0 = decodeFile2;
                        iVar.f9800W0 = I1.b.b0(decodeFile2);
                        ((ImageView) iVar.X0.findViewById(R.id.dialog_profile_pic_image_view)).setImageBitmap(iVar.f9800W0);
                        return;
                    } catch (Exception e7) {
                        com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "i", " in onActivityResult method.", e7, "i");
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public Object f(J2.o oVar) {
        switch (this.f738a) {
            case zzaky.zzf.zzg /*7*/:
                return ((StorageRegistrar) this.f739b).lambda$getComponents$0(oVar);
            default:
                return this.f739b;
        }
    }

    public void g(K3.b bVar) {
        switch (this.f738a) {
            case 16:
                j3.e eVar = (j3.e) this.f739b;
                eVar.getClass();
                eVar.f8829c.set((b3.b) bVar.get());
                return;
            default:
                j3.e eVar2 = (j3.e) this.f739b;
                eVar2.getClass();
                eVar2.f8829c.set((C0524a) bVar.get());
                return;
        }
    }

    public void h(Z4.b bVar) {
        MyApplication myApplication;
        int i2;
        M0 m02 = (M0) this.f739b;
        m02.getClass();
        boolean z3 = bVar.isAllProcessSuccess;
        Context context = m02.f8919a;
        if (z3) {
            com.google.android.gms.internal.measurement.a.l(MyApplication.f7090a, R.string.toast_successfully, context, R.raw.add_new_item);
            C0518i iVar = (C0518i) context;
            for (C0286s sVar : iVar.l().f5000c.v()) {
                if ((sVar instanceof U4.a) || (sVar instanceof U4.c)) {
                    I l6 = iVar.l();
                    l6.getClass();
                    C0269a aVar = new C0269a(l6);
                    aVar.h(sVar);
                    aVar.e(false);
                }
            }
            U4.a aVar2 = new U4.a(context);
            I l7 = iVar.l();
            l7.getClass();
            C0269a aVar3 = new C0269a(l7);
            aVar3.i(R.id.fragment_store_frame_layout, aVar2);
            aVar3.c();
            aVar3.e(false);
            R2.b.N0();
            return;
        }
        R2.b.w(false);
        if (bVar.isCountOverMaximumValue) {
            c.s0(context, MyApplication.f7090a.getApplicationContext().getString(R.string.can_not_add_more_than_for_each_stall_cell, new Object[]{Integer.valueOf(bVar.maximumItemsForEachCell)}), (String) null);
            return;
        }
        if (!bVar.isMaterialCountInStockChanged) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.do_not_have_enough_items;
        } else if (!bVar.isMaterialAddedToStallCell) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.stall_cell_already_filled;
        } else {
            myApplication = MyApplication.f7090a;
            i2 = R.string.unknown_error_try_again;
        }
        com.google.android.gms.internal.measurement.a.n(myApplication, i2, context, (String) null);
    }

    public void i(h hVar) {
        MyApplication myApplication;
        int i2;
        C0630j jVar = (C0630j) this.f739b;
        jVar.getClass();
        boolean z3 = hVar.isAllProcessSuccess;
        MainActivity mainActivity = jVar.f9031a;
        if (z3) {
            v0.e(mainActivity, MyApplication.f7090a.getApplicationContext().getString(R.string.happy_trip));
            R2.b.M0(R.raw.money_pay);
            Q.b(37, o.getAccountObject().getId(), (long) 1);
            return;
        }
        R2.b.w(false);
        if (hVar.isDestinationWrong) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_flight_destination_wrong;
        } else if (!hVar.isMoneyChanged) {
            c.x0(mainActivity);
            return;
        } else if (hVar.isPlayerAlreadyInPlane) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_already_in_flight;
        } else {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_can_not_travel;
        }
        com.google.android.gms.internal.measurement.a.p(myApplication, i2, mainActivity, (String) null);
    }

    public void j(long j6) {
        MainActivity mainActivity = (MainActivity) this.f739b;
        l4.i iVar = mainActivity.f7024z0;
        iVar.getClass();
        com.bumptech.glide.d.b(j6, new l4.g(iVar, 0));
        C0592h.b().e().E("Servers").E(String.valueOf(com.bumptech.glide.d.v0(1, "server_number"))).E("players").E(o.getAccountObject().getId()).d(new com.mtma.criminal.city.activities.g(mainActivity, 1));
    }

    public boolean k(x1.i iVar, int i2, Bundle bundle) {
        U3.c cVar;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 25 && (i2 & 1) != 0) {
            try {
                ((P.g) iVar.f12553b).f();
                Parcelable parcelable = (Parcelable) ((P.g) iVar.f12553b).c();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e6) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e6);
                return false;
            }
        }
        ClipDescription b6 = ((P.g) iVar.f12553b).b();
        P.g gVar = (P.g) iVar.f12553b;
        ClipData clipData = new ClipData(b6, new ClipData.Item(gVar.e()));
        if (i5 >= 31) {
            cVar = new U3.c(clipData, 2);
        } else {
            C0064d dVar = new C0064d();
            dVar.f1377b = clipData;
            dVar.f1378c = 2;
            cVar = dVar;
        }
        cVar.d(gVar.g());
        cVar.c(bundle);
        if (O.h((C0744w) this.f739b, cVar.a()) == null) {
            return true;
        }
        return false;
    }

    public void l(boolean z3, int i2, long j6) {
        f fVar = (f) this.f739b;
        fVar.getClass();
        R2.b.w(false);
        String string = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_leave_with_draw_dialog_message, new Object[]{Long.valueOf(j6)});
        g gVar = fVar.f11876b;
        g.X(gVar, string);
        boolean g02 = K1.e.g0(gVar.f11906e1.getSkillsObject(), gVar.f11906e1.getArmingObject(), gVar.f11906e1.getSchoolObject());
        String str = gVar.f11905e0;
        if (g02) {
            c.k0(str, new k(19, o.getAccountObject().getId(), o.getMainStatesObject().getNickName()));
        } else {
            c.k0(str, new k(19, "player_not_visible", MyApplication.f7090a.getApplicationContext().getString(R.string.unknown)));
        }
        gVar.Z();
    }

    public Task then(Object obj) {
        Z2.b bVar;
        switch (this.f738a) {
            case 4:
                Y2.a aVar = (Y2.a) this.f739b;
                aVar.getClass();
                return Tasks.call(aVar.f4272c, new C0149j(aVar, new u((String) obj, 1), 1));
            default:
                Z2.e eVar = (Z2.e) this.f739b;
                Z2.b bVar2 = (Z2.b) obj;
                eVar.f4493i.execute(new B.m(eVar, bVar2, 6));
                eVar.f4497m = bVar2;
                Z2.k kVar = eVar.f4492f;
                kVar.getClass();
                if (bVar2 instanceof Z2.b) {
                    bVar = bVar2;
                } else {
                    bVar = Z2.b.b(bVar2.f4480a);
                }
                kVar.f4514e = bVar.f4481b + ((long) (((double) bVar.f4482c) * 0.5d)) + 300000;
                long j6 = kVar.f4514e;
                long j7 = bVar.f4481b;
                long j8 = bVar.f4482c;
                if (j6 > j7 + j8) {
                    kVar.f4514e = (j7 + j8) - 60000;
                }
                if (kVar.a()) {
                    Z2.g gVar = kVar.f4511a;
                    long j9 = kVar.f4514e;
                    kVar.f4512b.getClass();
                    gVar.b(j9 - System.currentTimeMillis());
                }
                Iterator it2 = eVar.d.iterator();
                if (!it2.hasNext()) {
                    Z2.c a6 = Z2.c.a(bVar2);
                    Iterator it3 = eVar.f4490c.iterator();
                    while (it3.hasNext()) {
                        ((C0317a) it3.next()).a(a6);
                    }
                    return Tasks.forResult(bVar2);
                }
                throw o3.d.e(it2);
        }
    }

    public /* synthetic */ e(Object obj, int i2) {
        this.f738a = i2;
        this.f739b = obj;
    }

    public Object then(Task task) {
        Task task2;
        Task task3;
        switch (this.f738a) {
            case 0:
                h hVar = (h) this.f739b;
                kotlin.jvm.internal.j.e(hVar, "this$0");
                kotlin.jvm.internal.j.e(task, "it");
                d dVar = hVar.d;
                C0524a aVar = (C0524a) dVar.f735a.get();
                Executor executor = dVar.f737c;
                if (aVar == null) {
                    task2 = Tasks.forResult(null);
                    kotlin.jvm.internal.j.d(task2, "forResult(null)");
                } else {
                    FirebaseAuth firebaseAuth = (FirebaseAuth) aVar;
                    task2 = firebaseAuth.c(firebaseAuth.f6866f, false).continueWith(executor, new l(5));
                    kotlin.jvm.internal.j.d(task2, "auth.getAccessToken(fals…  }\n      authToken\n    }");
                }
                b3.b bVar = (b3.b) dVar.d.get();
                if (bVar == null) {
                    task3 = Tasks.forResult(null);
                    kotlin.jvm.internal.j.d(task3, "forResult(null)");
                } else {
                    Task b6 = ((Z2.e) bVar).b(false);
                    kotlin.jvm.internal.j.d(b6, "if (getLimitedUseAppChec… appCheck.getToken(false)");
                    task3 = b6.onSuccessTask(executor, new a(dVar));
                    kotlin.jvm.internal.j.d(task3, "tokenTask.onSuccessTask(…esult(result.token)\n    }");
                }
                return Tasks.whenAll((Task<?>[]) new Task[]{task2, task3}).onSuccessTask(executor, new b(task2, dVar, task3));
            default:
                ((J2.o) this.f739b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if ("RST".equals(string2)) {
                        throw new IOException("INSTANCE_ID_RESET");
                    } else if (string2 != null) {
                        throw new IOException(string2);
                    } else {
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                } else {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
        }
    }
}
