package com.mtma.criminal.city.fragments.gangBase;

import K1.e;
import android.view.View;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import e5.C0509f;

/* renamed from: com.mtma.criminal.city.fragments.gangBase.h  reason: case insensitive filesystem */
public final class C0428h extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7181a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7182b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0429i f7183c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0428h(C0429i iVar, View view, String str, int i2) {
        super(view);
        this.f7181a = i2;
        this.f7183c = iVar;
        this.f7182b = str;
    }

    public final void onClick(View view) {
        switch (this.f7181a) {
            case 0:
                super.onClick(view);
                e.c(this.f7183c.f7194d0, this.f7182b, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_id), MyApplication.f7090a.getApplicationContext().getString(R.string.gang_id_copied_successfully));
                return;
            default:
                super.onClick(view);
                e.c(this.f7183c.f7194d0, this.f7182b, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name), MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name_copied_successfully));
                return;
        }
    }
}
