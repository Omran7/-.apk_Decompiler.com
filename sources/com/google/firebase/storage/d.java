package com.google.firebase.storage;

import K3.b;
import R2.i;
import com.bumptech.glide.c;
import h3.k;
import h3.l;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6918a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final i f6919b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6920c;
    public final b d;

    public d(i iVar, b bVar, b bVar2, Executor executor, Executor executor2) {
        this.f6919b = iVar;
        this.f6920c = bVar;
        this.d = bVar2;
        c.f5733a = new k(executor, 5);
        new LinkedBlockingQueue();
        new Semaphore(3, true);
        c.f5734b = new k(executor, 2);
        c.f5735c = new l(executor);
        c.d = executor2;
    }
}
