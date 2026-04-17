package okhttp3.internal.http2;

import N5.c;
import N5.d;
import N5.t;
import N5.u;
import N5.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.concurrent.RejectedExecutionException;
import okhttp3.Headers;
import okhttp3.internal.NamedRunnable;

public final class Http2Stream {

    /* renamed from: a  reason: collision with root package name */
    public long f10877a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f10878b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10879c;
    public final Http2Connection d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f10880e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10881f;
    public final FramingSource g;
    public final FramingSink h;

    /* renamed from: i  reason: collision with root package name */
    public final StreamTimeout f10882i;

    /* renamed from: j  reason: collision with root package name */
    public final StreamTimeout f10883j;

    /* renamed from: k  reason: collision with root package name */
    public ErrorCode f10884k;

    public final class FramingSink implements t {

        /* renamed from: a  reason: collision with root package name */
        public final d f10885a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public boolean f10886b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10887c;

        /* JADX WARNING: type inference failed for: r1v1, types: [N5.d, java.lang.Object] */
        public FramingSink() {
        }

        public final w b() {
            return Http2Stream.this.f10883j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.f10883j.n();
            r11.d.b();
            r9 = java.lang.Math.min(r11.d.f10878b, r11.f10885a.f1932b);
            r1 = r11.d;
            r1.f10878b -= r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(boolean r12) {
            /*
                r11 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x0075 }
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r1.f10883j     // Catch:{ all -> 0x0075 }
                r1.i()     // Catch:{ all -> 0x0075 }
            L_0x000a:
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x0024 }
                long r2 = r1.f10878b     // Catch:{ all -> 0x0024 }
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 > 0) goto L_0x0026
                boolean r2 = r11.f10887c     // Catch:{ all -> 0x0024 }
                if (r2 != 0) goto L_0x0026
                boolean r2 = r11.f10886b     // Catch:{ all -> 0x0024 }
                if (r2 != 0) goto L_0x0026
                okhttp3.internal.http2.ErrorCode r2 = r1.f10884k     // Catch:{ all -> 0x0024 }
                if (r2 != 0) goto L_0x0026
                r1.i()     // Catch:{ all -> 0x0024 }
                goto L_0x000a
            L_0x0024:
                r12 = move-exception
                goto L_0x0077
            L_0x0026:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r1.f10883j     // Catch:{ all -> 0x0075 }
                r1.n()     // Catch:{ all -> 0x0075 }
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x0075 }
                r1.b()     // Catch:{ all -> 0x0075 }
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x0075 }
                long r1 = r1.f10878b     // Catch:{ all -> 0x0075 }
                N5.d r3 = r11.f10885a     // Catch:{ all -> 0x0075 }
                long r3 = r3.f1932b     // Catch:{ all -> 0x0075 }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x0075 }
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x0075 }
                long r2 = r1.f10878b     // Catch:{ all -> 0x0075 }
                long r2 = r2 - r9
                r1.f10878b = r2     // Catch:{ all -> 0x0075 }
                monitor-exit(r0)     // Catch:{ all -> 0x0075 }
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.f10883j
                r0.i()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x005c }
                okhttp3.internal.http2.Http2Connection r5 = r0.d     // Catch:{ all -> 0x005c }
                int r6 = r0.f10879c     // Catch:{ all -> 0x005c }
                if (r12 == 0) goto L_0x005e
                N5.d r12 = r11.f10885a     // Catch:{ all -> 0x005c }
                long r0 = r12.f1932b     // Catch:{ all -> 0x005c }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005e
                r12 = 1
            L_0x005a:
                r7 = r12
                goto L_0x0060
            L_0x005c:
                r12 = move-exception
                goto L_0x006d
            L_0x005e:
                r12 = 0
                goto L_0x005a
            L_0x0060:
                N5.d r8 = r11.f10885a     // Catch:{ all -> 0x005c }
                r5.q(r6, r7, r8, r9)     // Catch:{ all -> 0x005c }
                okhttp3.internal.http2.Http2Stream r12 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$StreamTimeout r12 = r12.f10883j
                r12.n()
                return
            L_0x006d:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.f10883j
                r0.n()
                throw r12
            L_0x0075:
                r12 = move-exception
                goto L_0x007f
            L_0x0077:
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x0075 }
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r1.f10883j     // Catch:{ all -> 0x0075 }
                r1.n()     // Catch:{ all -> 0x0075 }
                throw r12     // Catch:{ all -> 0x0075 }
            L_0x007f:
                monitor-exit(r0)     // Catch:{ all -> 0x0075 }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.c(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x000c, code lost:
            r0 = r13.d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
            if (r0.h.f10887c != false) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
            if (r13.f10885a.f1932b <= 0) goto L_0x002b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            if (r13.f10885a.f1932b <= 0) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            c(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
            r0.d.q(r0.f10879c, true, (N5.d) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
            r1 = r13.d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r13.f10886b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
            r13.d.d.flush();
            r13.d.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
                r13 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                boolean r1 = r13.f10886b     // Catch:{ all -> 0x0009 }
                if (r1 == 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                return
            L_0x0009:
                r1 = move-exception
                goto L_0x004c
            L_0x000b:
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r1 = r0.h
                boolean r1 = r1.f10887c
                r2 = 1
                if (r1 != 0) goto L_0x0036
                N5.d r1 = r13.f10885a
                long r3 = r1.f1932b
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x002b
            L_0x001f:
                N5.d r0 = r13.f10885a
                long r0 = r0.f1932b
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 <= 0) goto L_0x0036
                r13.c(r2)
                goto L_0x001f
            L_0x002b:
                okhttp3.internal.http2.Http2Connection r7 = r0.d
                int r8 = r0.f10879c
                r11 = 0
                r9 = 1
                r10 = 0
                r7.q(r8, r9, r10, r11)
            L_0x0036:
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r1)
                r13.f10886b = r2     // Catch:{ all -> 0x0049 }
                monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.d
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.a()
                return
            L_0x0049:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                throw r0
            L_0x004c:
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }

        public final void f(long j6, d dVar) {
            d dVar2 = this.f10885a;
            dVar2.f(j6, dVar);
            while (dVar2.f1932b >= 16384) {
                c(false);
            }
        }

        public final void flush() {
            synchronized (Http2Stream.this) {
                Http2Stream.this.b();
            }
            while (this.f10885a.f1932b > 0) {
                c(false);
                Http2Stream.this.d.flush();
            }
        }
    }

    public final class FramingSource implements u {

        /* renamed from: a  reason: collision with root package name */
        public final d f10888a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public final d f10889b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final long f10890c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10891e;

        /* JADX WARNING: type inference failed for: r1v1, types: [N5.d, java.lang.Object] */
        /* JADX WARNING: type inference failed for: r1v2, types: [N5.d, java.lang.Object] */
        public FramingSource(long j6) {
            this.f10890c = j6;
        }

        public final w b() {
            return Http2Stream.this.f10882i;
        }

        public final void close() {
            long j6;
            synchronized (Http2Stream.this) {
                try {
                    this.d = true;
                    d dVar = this.f10889b;
                    j6 = dVar.f1932b;
                    dVar.c();
                    if (!Http2Stream.this.f10880e.isEmpty()) {
                        Http2Stream.this.getClass();
                    }
                    Http2Stream.this.notifyAll();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (j6 > 0) {
                Http2Stream.this.d.p(j6);
            }
            Http2Stream.this.a();
        }

        /* JADX INFO: finally extract failed */
        public final long e(long j6, d dVar) {
            ErrorCode errorCode;
            long e6;
            while (true) {
                synchronized (Http2Stream.this) {
                    try {
                        Http2Stream.this.f10882i.i();
                        Http2Stream http2Stream = Http2Stream.this;
                        errorCode = http2Stream.f10884k;
                        if (errorCode == null) {
                            errorCode = null;
                        }
                        if (!this.d) {
                            if (!http2Stream.f10880e.isEmpty()) {
                                Http2Stream.this.getClass();
                            }
                            d dVar2 = this.f10889b;
                            long j7 = dVar2.f1932b;
                            if (j7 > 0) {
                                e6 = dVar2.e(Math.min(8192, j7), dVar);
                                Http2Stream http2Stream2 = Http2Stream.this;
                                long j8 = http2Stream2.f10877a + e6;
                                http2Stream2.f10877a = j8;
                                if (errorCode == null && j8 >= ((long) (http2Stream2.d.f10817A.a() / 2))) {
                                    Http2Stream http2Stream3 = Http2Stream.this;
                                    http2Stream3.d.s(http2Stream3.f10879c, http2Stream3.f10877a);
                                    Http2Stream.this.f10877a = 0;
                                }
                            } else if (this.f10891e || errorCode != null) {
                                e6 = -1;
                            } else {
                                Http2Stream.this.i();
                                Http2Stream.this.f10882i.n();
                            }
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Http2Stream.this.f10882i.n();
            if (e6 != -1) {
                Http2Stream.this.d.p(e6);
                return e6;
            } else if (errorCode == null) {
                return -1;
            } else {
                throw new StreamResetException(errorCode);
            }
        }
    }

    public class StreamTimeout extends c {
        public StreamTimeout() {
        }

        public final IOException l(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void m() {
            Http2Stream http2Stream = Http2Stream.this;
            ErrorCode errorCode = ErrorCode.CANCEL;
            if (http2Stream.d(errorCode)) {
                http2Stream.d.r(http2Stream.f10879c, errorCode);
            }
            Http2Connection http2Connection = Http2Stream.this.d;
            synchronized (http2Connection) {
                try {
                    long j6 = http2Connection.f10834w;
                    long j7 = http2Connection.f10833v;
                    if (j6 >= j7) {
                        http2Connection.f10833v = j7 + 1;
                        http2Connection.f10835x = System.nanoTime() + 1000000000;
                        try {
                            http2Connection.f10828q.execute(new NamedRunnable(http2Connection.d) {
                                public final void a(
/*
Method generation error in method: okhttp3.internal.http2.Http2Connection.3.a():void, dex: classes.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: okhttp3.internal.http2.Http2Connection.3.a():void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:260)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:70)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/
                            });
                        } catch (RejectedExecutionException unused) {
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }

        public final void n() {
            if (k()) {
                throw l((IOException) null);
            }
        }
    }

    public Http2Stream(int i2, Http2Connection http2Connection, boolean z3, boolean z4, Headers headers) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f10880e = arrayDeque;
        this.f10882i = new StreamTimeout();
        this.f10883j = new StreamTimeout();
        this.f10884k = null;
        if (http2Connection != null) {
            this.f10879c = i2;
            this.d = http2Connection;
            this.f10878b = (long) http2Connection.f10818B.a();
            FramingSource framingSource = new FramingSource((long) http2Connection.f10817A.a());
            this.g = framingSource;
            FramingSink framingSink = new FramingSink();
            this.h = framingSink;
            framingSource.f10891e = z4;
            framingSink.f10887c = z3;
            if (headers != null) {
                arrayDeque.add(headers);
            }
            if (f() && headers != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!f() && headers == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    public final void a() {
        boolean z3;
        boolean g5;
        synchronized (this) {
            try {
                FramingSource framingSource = this.g;
                if (!framingSource.f10891e && framingSource.d) {
                    FramingSink framingSink = this.h;
                    if (!framingSink.f10887c) {
                        if (framingSink.f10886b) {
                        }
                    }
                    z3 = true;
                    g5 = g();
                }
                z3 = false;
                g5 = g();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z3) {
            c(ErrorCode.CANCEL);
        } else if (!g5) {
            this.d.m(this.f10879c);
        }
    }

    public final void b() {
        FramingSink framingSink = this.h;
        if (framingSink.f10886b) {
            throw new IOException("stream closed");
        } else if (framingSink.f10887c) {
            throw new IOException("stream finished");
        } else if (this.f10884k != null) {
            throw new StreamResetException(this.f10884k);
        }
    }

    public final void c(ErrorCode errorCode) {
        if (d(errorCode)) {
            this.d.f10820D.n(this.f10879c, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode) {
        synchronized (this) {
            try {
                if (this.f10884k != null) {
                    return false;
                }
                if (this.g.f10891e && this.h.f10887c) {
                    return false;
                }
                this.f10884k = errorCode;
                notifyAll();
                this.d.m(this.f10879c);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final t e() {
        synchronized (this) {
            try {
                if (!this.f10881f) {
                    if (!f()) {
                        throw new IllegalStateException("reply before requesting the sink");
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return this.h;
    }

    public final boolean f() {
        boolean z3;
        if ((this.f10879c & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.d.f10822a == z3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean g() {
        /*
            r3 = this;
            monitor-enter(r3)
            okhttp3.internal.http2.ErrorCode r0 = r3.f10884k     // Catch:{ all -> 0x0013 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.g     // Catch:{ all -> 0x0013 }
            boolean r2 = r0.f10891e     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x0015
            boolean r0 = r0.d     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
            goto L_0x0015
        L_0x0013:
            r0 = move-exception
            goto L_0x0028
        L_0x0015:
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r3.h     // Catch:{ all -> 0x0013 }
            boolean r2 = r0.f10887c     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x001f
            boolean r0 = r0.f10886b     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
        L_0x001f:
            boolean r0 = r3.f10881f     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0025
            monitor-exit(r3)
            return r1
        L_0x0025:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.g():boolean");
    }

    public final void h() {
        boolean g5;
        synchronized (this) {
            this.g.f10891e = true;
            g5 = g();
            notifyAll();
        }
        if (!g5) {
            this.d.m(this.f10879c);
        }
    }

    public final void i() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
