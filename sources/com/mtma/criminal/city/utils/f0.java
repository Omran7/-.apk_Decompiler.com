package com.mtma.criminal.city.utils;

import I1.b;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import c1.i;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import i3.C0590f;

public final class f0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditText f7409a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7410b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f7411c;
    public final /* synthetic */ String d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f7412e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(RelativeLayout relativeLayout, EditText editText, Context context, C0505b bVar, String str, long j6) {
        super(relativeLayout);
        this.f7409a = editText;
        this.f7410b = context;
        this.f7411c = bVar;
        this.d = str;
        this.f7412e = j6;
    }

    public final void onClick(View view) {
        super.onClick(view);
        String replace = this.f7409a.getText().toString().trim().replace("\n", "").replace("\t", "");
        boolean isEmpty = replace.isEmpty();
        Context context = this.f7410b;
        if (isEmpty) {
            a.m(MyApplication.f7090a, R.string.empty_name, context, view);
        } else if (replace.equals(o.getMainStatesObject().getNickName())) {
            a.m(MyApplication.f7090a, R.string.same_name, context, view);
        } else {
            this.f7411c.dismiss();
            b.d = false;
            C0590f c3 = a.c(a.e(true), "players");
            c3.q("mainStatesObject/nickName").i(replace).d(new i((C0509f) this, c3, replace, 7));
        }
    }
}
