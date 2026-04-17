package com.mtma.criminal.city.fragments.gangBase;

import R2.b;
import W0.y;
import Z4.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import c.C0327b;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.T;

/* renamed from: com.mtma.criminal.city.fragments.gangBase.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0424d implements C0327b, T {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0429i f7173a;

    public /* synthetic */ C0424d(C0429i iVar) {
        this.f7173a = iVar;
    }

    public void a(p pVar) {
        MyApplication myApplication;
        int i2;
        C0429i iVar = this.f7173a;
        iVar.getClass();
        boolean z3 = pVar.isAllProcessSuccess;
        Context context = iVar.f7194d0;
        if (z3) {
            b.w(false);
            a.l(MyApplication.f7090a, R.string.toast_successfully, context, R.raw.add_new_item);
            return;
        }
        b.w(false);
        if (pVar.isCurrentPlayerBoss) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.gang_boss_can_not_leave_the_gang;
        } else {
            myApplication = MyApplication.f7090a;
            i2 = R.string.unknown_error_try_again;
        }
        a.n(myApplication, i2, context, (String) null);
    }

    public void c(boolean z3) {
        C0429i iVar = this.f7173a;
        if (z3) {
            iVar.Y();
            return;
        }
        iVar.getClass();
        b.w(false);
        c.y0(iVar.f7194d0);
    }

    public void e(Object obj) {
        y yVar = (y) obj;
        C0429i iVar = this.f7173a;
        iVar.getClass();
        if (yVar.f4054c == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(yVar.a(MyApplication.f7090a.getApplicationContext()));
                iVar.f7188E0 = decodeFile;
                iVar.f7188E0 = I1.b.b0(decodeFile);
                ((ImageView) iVar.f7189F0.findViewById(R.id.dialog_profile_pic_image_view)).setImageBitmap(iVar.f7188E0);
            } catch (Exception e6) {
                a.q("Exception from try-catch block inside ", "i", " in onActivityResult method.", e6, "i");
            }
        }
    }
}
