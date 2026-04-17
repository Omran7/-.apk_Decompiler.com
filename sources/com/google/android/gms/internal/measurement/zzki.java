package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzki {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkg zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzg = new AtomicInteger();
    final zzkf zza;
    final String zzb;
    private Object zzh;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        new zzka
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: CONSTRUCTOR  (r0v2 ? I:com.google.android.gms.internal.measurement.zzka) =  call: com.google.android.gms.internal.measurement.zzka.<init>():void type: CONSTRUCTOR in method: com.google.android.gms.internal.measurement.zzki.<clinit>():void, dex: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v2 ?
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	... 29 more
            */
        /*
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            zzd = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.android.gms.internal.measurement.zzka r0 = new com.google.android.gms.internal.measurement.zzka
            r0.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            zzg = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzki.<clinit>():void");
    }

    public /* synthetic */ zzki(zzkf zzkf, String str, Object obj, boolean z3, zzkh zzkh) {
        if (zzkf.zza != null) {
            this.zza = zzkf;
            this.zzb = str;
            this.zzh = obj;
            this.zzk = false;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void zzc() {
        zzg.incrementAndGet();
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [z2.g, java.lang.Object] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void zzd(android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zzkg r0 = zze
            if (r0 != 0) goto L_0x005a
            if (r3 != 0) goto L_0x0007
            goto L_0x005a
        L_0x0007:
            java.lang.Object r0 = zzd
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzkg r1 = zze     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x0056
            monitor-enter(r0)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.measurement.zzkg r1 = zze     // Catch:{ all -> 0x0021 }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x0021 }
            if (r2 == 0) goto L_0x0018
            r3 = r2
        L_0x0018:
            if (r1 == 0) goto L_0x0023
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x0021 }
            if (r2 == r3) goto L_0x0050
            goto L_0x0023
        L_0x0021:
            r3 = move-exception
            goto L_0x0052
        L_0x0023:
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.zzjm.zze()     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.measurement.zzkk.zzd()     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.measurement.zzju.zze()     // Catch:{ all -> 0x0021 }
        L_0x002e:
            com.google.android.gms.internal.measurement.zzjz r1 = new com.google.android.gms.internal.measurement.zzjz     // Catch:{ all -> 0x0021 }
            r1.<init>(r3)     // Catch:{ all -> 0x0021 }
            boolean r2 = r1 instanceof java.io.Serializable     // Catch:{ all -> 0x0021 }
            if (r2 == 0) goto L_0x003d
            z2.f r2 = new z2.f     // Catch:{ all -> 0x0021 }
            r2.<init>(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x0044
        L_0x003d:
            z2.g r2 = new z2.g     // Catch:{ all -> 0x0021 }
            r2.<init>()     // Catch:{ all -> 0x0021 }
            r2.f12859a = r1     // Catch:{ all -> 0x0021 }
        L_0x0044:
            com.google.android.gms.internal.measurement.zzjj r1 = new com.google.android.gms.internal.measurement.zzjj     // Catch:{ all -> 0x0021 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0021 }
            zze = r1     // Catch:{ all -> 0x0021 }
            java.util.concurrent.atomic.AtomicInteger r3 = zzg     // Catch:{ all -> 0x0021 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0021 }
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            goto L_0x0056
        L_0x0052:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r3 = move-exception
            goto L_0x0058
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r3
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzki.zzd(android.content.Context):void");
    }

    public abstract Object zza(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bb A[Catch:{ all -> 0x0042 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzb() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = zzg
            int r0 = r0.get()
            int r1 = r9.zzi
            if (r1 >= r0) goto L_0x00c5
            monitor-enter(r9)
            int r1 = r9.zzi     // Catch:{ all -> 0x0042 }
            if (r1 >= r0) goto L_0x00c1
            com.google.android.gms.internal.measurement.zzkg r1 = zze     // Catch:{ all -> 0x0042 }
            z2.a r2 = z2.C1134a.f12854a     // Catch:{ all -> 0x0042 }
            r3 = 0
            if (r1 == 0) goto L_0x0045
            z2.e r4 = r1.zzb()     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0045
            z2.e r2 = r1.zzb()     // Catch:{ all -> 0x0042 }
            r2.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0042 }
            z2.c r2 = (z2.C1136c) r2     // Catch:{ all -> 0x0042 }
            boolean r4 = r2.b()     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = r2.a()     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.measurement.zzjo r4 = (com.google.android.gms.internal.measurement.zzjo) r4     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.measurement.zzkf r5 = r9.zza     // Catch:{ all -> 0x0042 }
            android.net.Uri r6 = r5.zza     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = r5.zzc     // Catch:{ all -> 0x0042 }
            java.lang.String r7 = r9.zzb     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = r4.zza(r6, r3, r5, r7)     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r0 = move-exception
            goto L_0x00c3
        L_0x0045:
            r4 = r3
        L_0x0046:
            if (r1 == 0) goto L_0x004a
            r5 = 1
            goto L_0x004b
        L_0x004a:
            r5 = 0
        L_0x004b:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            if (r5 == 0) goto L_0x00bb
            com.google.android.gms.internal.measurement.zzkf r5 = r9.zza     // Catch:{ all -> 0x0042 }
            android.net.Uri r6 = r5.zza     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x00b7
            android.content.Context r7 = r1.zza()     // Catch:{ all -> 0x0042 }
            boolean r7 = com.google.android.gms.internal.measurement.zzjw.zza(r7, r6)     // Catch:{ all -> 0x0042 }
            if (r7 == 0) goto L_0x0071
            android.content.Context r7 = r1.zza()     // Catch:{ all -> 0x0042 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.measurement.zzjy r8 = new com.google.android.gms.internal.measurement.zzjy     // Catch:{ all -> 0x0042 }
            r8.<init>()     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.measurement.zzjm r6 = com.google.android.gms.internal.measurement.zzjm.zza(r7, r6, r8)     // Catch:{ all -> 0x0042 }
            goto L_0x0072
        L_0x0071:
            r6 = r3
        L_0x0072:
            if (r6 == 0) goto L_0x0081
            java.lang.String r7 = r9.zzb     // Catch:{ all -> 0x0042 }
            java.lang.Object r6 = r6.zzb(r7)     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0081
            java.lang.Object r6 = r9.zza(r6)     // Catch:{ all -> 0x0042 }
            goto L_0x0082
        L_0x0081:
            r6 = r3
        L_0x0082:
            if (r6 == 0) goto L_0x0085
            goto L_0x00a3
        L_0x0085:
            boolean r5 = r5.zzd     // Catch:{ all -> 0x0042 }
            if (r5 != 0) goto L_0x009d
            android.content.Context r1 = r1.zza()     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.measurement.zzju r1 = com.google.android.gms.internal.measurement.zzju.zza(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = r9.zzb     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = r1.zzb(r5)     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x009d
            java.lang.Object r3 = r9.zza(r1)     // Catch:{ all -> 0x0042 }
        L_0x009d:
            if (r3 != 0) goto L_0x00a2
            java.lang.Object r6 = r9.zzh     // Catch:{ all -> 0x0042 }
            goto L_0x00a3
        L_0x00a2:
            r6 = r3
        L_0x00a3:
            boolean r1 = r2.b()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x00b2
            if (r4 != 0) goto L_0x00ae
            java.lang.Object r6 = r9.zzh     // Catch:{ all -> 0x0042 }
            goto L_0x00b2
        L_0x00ae:
            java.lang.Object r6 = r9.zza(r4)     // Catch:{ all -> 0x0042 }
        L_0x00b2:
            r9.zzj = r6     // Catch:{ all -> 0x0042 }
            r9.zzi = r0     // Catch:{ all -> 0x0042 }
            goto L_0x00c1
        L_0x00b7:
            r1.zza()     // Catch:{ all -> 0x0042 }
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x00bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0042 }
            r0.<init>(r6)     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x00c1:
            monitor-exit(r9)     // Catch:{ all -> 0x0042 }
            goto L_0x00c5
        L_0x00c3:
            monitor-exit(r9)     // Catch:{ all -> 0x0042 }
            throw r0
        L_0x00c5:
            java.lang.Object r0 = r9.zzj
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzki.zzb():java.lang.Object");
    }
}
