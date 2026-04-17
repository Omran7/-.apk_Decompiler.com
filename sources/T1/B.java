package T1;

import J2.o;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzqo;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import g3.d;
import java.util.List;

public final /* synthetic */ class B implements F, d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2803a;

    public /* synthetic */ B(int i2) {
        this.f2803a = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0075, code lost:
        if (r11 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(W.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x00ef
            if (r9 < 0) goto L_0x00ef
            if (r10 >= 0) goto L_0x0009
            goto L_0x00ef
        L_0x0009:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = -1
            if (r1 == r3) goto L_0x00ef
            if (r2 == r3) goto L_0x00ef
            if (r1 == r2) goto L_0x001a
            goto L_0x00ef
        L_0x001a:
            r4 = 1
            if (r11 == 0) goto L_0x00a5
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L_0x002c
            if (r11 >= r1) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            if (r9 >= 0) goto L_0x002e
        L_0x002c:
            r1 = r3
            goto L_0x005d
        L_0x002e:
            r11 = r0
        L_0x002f:
            if (r9 != 0) goto L_0x0032
            goto L_0x005d
        L_0x0032:
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x003b
            if (r11 == 0) goto L_0x0039
            goto L_0x002c
        L_0x0039:
            r1 = r0
            goto L_0x005d
        L_0x003b:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L_0x004b
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L_0x0048
            goto L_0x002c
        L_0x0048:
            int r9 = r9 + -1
            goto L_0x002e
        L_0x004b:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0054
            int r9 = r9 + -1
            goto L_0x002f
        L_0x0054:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L_0x005b
            goto L_0x002c
        L_0x005b:
            r11 = r4
            goto L_0x002f
        L_0x005d:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L_0x006c
            if (r10 >= r2) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            if (r9 >= 0) goto L_0x006e
        L_0x006c:
            r10 = r3
            goto L_0x00a0
        L_0x006e:
            r11 = r0
        L_0x006f:
            if (r9 != 0) goto L_0x0073
            r10 = r2
            goto L_0x00a0
        L_0x0073:
            if (r2 < r10) goto L_0x0078
            if (r11 == 0) goto L_0x00a0
            goto L_0x006c
        L_0x0078:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L_0x008a
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L_0x0085
            goto L_0x006c
        L_0x0085:
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x006e
        L_0x008a:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0095
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x006f
        L_0x0095:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L_0x009c
            goto L_0x006c
        L_0x009c:
            int r2 = r2 + 1
            r11 = r4
            goto L_0x006f
        L_0x00a0:
            if (r1 == r3) goto L_0x00ef
            if (r10 != r3) goto L_0x00b3
            goto L_0x00ef
        L_0x00a5:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        L_0x00b3:
            java.lang.Class<androidx.emoji2.text.u> r9 = androidx.emoji2.text.u.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            androidx.emoji2.text.u[] r9 = (androidx.emoji2.text.u[]) r9
            if (r9 == 0) goto L_0x00ef
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00ef
            int r11 = r9.length
            r2 = r0
        L_0x00c2:
            if (r2 >= r11) goto L_0x00d9
            r3 = r9[r2]
            int r5 = r8.getSpanStart(r3)
            int r3 = r8.getSpanEnd(r3)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r10)
            int r2 = r2 + 1
            goto L_0x00c2
        L_0x00d9:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            r0 = r4
        L_0x00ef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.B.a(W.b, android.text.Editable, int, int, boolean):boolean");
    }

    public Object f(o oVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(oVar);
    }

    public Object zza() {
        switch (this.f2803a) {
            case 0:
                List list = H.f2892a;
                return Long.valueOf(zzpb.zzZ());
            case 1:
                List list2 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzh());
            case 2:
                List list3 = H.f2892a;
                return Long.valueOf(zzpb.zzx());
            case 3:
                List list4 = H.f2892a;
                return Boolean.valueOf(zzqo.zzg());
            case 4:
                List list5 = H.f2892a;
                return zzpb.zzah();
            case 5:
                List list6 = H.f2892a;
                return Long.valueOf(zzqo.zzd());
            case zzaky.zzf.zzf /*6*/:
                List list7 = H.f2892a;
                return Integer.valueOf((int) zzqo.zzc());
            case zzaky.zzf.zzg /*7*/:
                List list8 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzl());
            case 8:
                List list9 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzj());
            case 9:
                List list10 = H.f2892a;
                return Long.valueOf(zzpb.zzN());
            case 10:
                List list11 = H.f2892a;
                return Boolean.valueOf(zzpk.zzc());
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                List list12 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzq());
            case 12:
                List list13 = H.f2892a;
                return zzpb.zzaq();
            case 13:
                List list14 = H.f2892a;
                return zzpb.zzao();
            case 14:
                List list15 = H.f2892a;
                return zzpb.zzak();
            case 15:
                List list16 = H.f2892a;
                return zzpb.zzai();
            case 16:
                List list17 = H.f2892a;
                return zzpb.zzap();
            case 17:
                List list18 = H.f2892a;
                return Long.valueOf(zzpb.zzM());
            case 18:
                List list19 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzL());
            case 19:
                List list20 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzo());
            case 20:
                List list21 = H.f2892a;
                return Boolean.valueOf(zzpb.zzau());
            default:
                List list22 = H.f2892a;
                return Boolean.valueOf(zzph.zzc());
        }
    }

    private final void b(Object obj) {
    }
}
