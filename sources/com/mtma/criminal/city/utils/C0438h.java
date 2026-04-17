package com.mtma.criminal.city.utils;

import K1.e;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.RelativeLayout;
import com.bumptech.glide.c;
import e5.C0505b;
import e5.C0509f;
import f.C0518i;

/* renamed from: com.mtma.criminal.city.utils.h  reason: case insensitive filesystem */
public final class C0438h extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7416a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f7417b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0518i f7418c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0438h(RelativeLayout relativeLayout, C0505b bVar, C0518i iVar, int i2) {
        super(relativeLayout);
        this.f7416a = i2;
        this.f7417b = bVar;
        this.f7418c = iVar;
    }

    public final void onClick(View view) {
        switch (this.f7416a) {
            case 0:
                super.onClick(view);
                this.f7417b.dismiss();
                this.f7418c.finish();
                return;
            case 1:
                super.onClick(view);
                this.f7417b.dismiss();
                this.f7418c.finish();
                return;
            case 2:
                super.onClick(view);
                this.f7417b.dismiss();
                this.f7418c.finish();
                c.f5742m = false;
                return;
            case 3:
                C0518i iVar = this.f7418c;
                super.onClick(view);
                String F = e.F();
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + F));
                    intent.setFlags(268435456);
                    iVar.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    iVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + F)));
                }
                this.f7417b.dismiss();
                c.f5738i = false;
                iVar.finish();
                return;
            default:
                super.onClick(view);
                this.f7417b.dismiss();
                c.f5738i = false;
                this.f7418c.finish();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0438h(RelativeLayout relativeLayout, C0518i iVar, C0505b bVar) {
        super(relativeLayout);
        this.f7416a = 3;
        this.f7418c = iVar;
        this.f7417b = bVar;
    }
}
