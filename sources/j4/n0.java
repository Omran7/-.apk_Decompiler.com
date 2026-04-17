package j4;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;

public final class n0 extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9060a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9061b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9062c;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f9063e = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.drawable.rank_gold), Integer.valueOf(R.drawable.rank_silver), Integer.valueOf(R.drawable.rank_bronze)}));

    public n0(Context context, ArrayList arrayList, int i2, int i5) {
        super(context, 0, arrayList);
        int i6 = -1;
        this.f9060a = context;
        this.f9062c = i2;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    switch (i5) {
                        case 0:
                            i6 = R.string.rank_days_number;
                            break;
                        case 1:
                            i6 = R.string.rank_level;
                            break;
                        case 2:
                            i6 = R.string.rank_medals;
                            break;
                        case 3:
                            i6 = R.string.rank_estate;
                            break;
                        case 4:
                            i6 = R.string.rank_fight_winner;
                            break;
                        case 5:
                            break;
                        case zzaky.zzf.zzf:
                            i6 = R.string.rank_patient;
                            break;
                        case zzaky.zzf.zzg:
                            i6 = R.string.rank_prisoner;
                            break;
                        case 8:
                            i6 = R.string.rank_flight;
                            break;
                        case 9:
                            i6 = R.string.rank_student;
                            break;
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (i5 == 0) {
                            i6 = R.string.rank_stolen;
                        } else if (i5 == 1) {
                            i6 = R.string.rank_jail_breaker;
                        } else if (i5 == 2) {
                            i6 = R.string.rank_bailout_payer;
                        }
                    }
                } else if (i5 == 0) {
                    i6 = R.string.rank_gang_respect;
                } else if (i5 == 1) {
                    i6 = R.string.rank_gang_gold;
                } else if (i5 == 2) {
                    i6 = R.string.rank_gang_cash;
                } else if (i5 == 3) {
                    i6 = R.string.rank_gang_cities_conquered;
                }
            } else {
                if (i5 != 0) {
                    if (i5 == 1) {
                        i6 = R.string.rank_medals_number;
                    }
                }
                i6 = R.string.rank_levels_number;
            }
            this.f9061b = i6;
        } else if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    i6 = R.string.rank_fight;
                } else if (i5 == 3) {
                    i6 = R.string.rank_speakers;
                }
                this.f9061b = i6;
            }
            i6 = R.string.rank_levels_number;
            this.f9061b = i6;
        }
        i6 = R.string.rank_crimes;
        this.f9061b = i6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            if (r20 != 0) goto L_0x0017
            android.content.Context r3 = r0.f9060a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131493046(0x7f0c00b6, float:1.8609561E38)
            r5 = r21
            android.view.View r3 = r3.inflate(r4, r5, r2)
            goto L_0x0019
        L_0x0017:
            r3 = r20
        L_0x0019:
            r4 = 2131298067(0x7f090713, float:1.8214097E38)
            android.view.View r4 = r3.findViewById(r4)
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r5 = 2131298066(0x7f090712, float:1.8214095E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6 = 2131298064(0x7f090710, float:1.821409E38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7 = 2131298061(0x7f09070d, float:1.8214085E38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r8 = 2131298062(0x7f09070e, float:1.8214087E38)
            android.view.View r8 = r3.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r9 = 2131298065(0x7f090711, float:1.8214093E38)
            android.view.View r9 = r3.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131298068(0x7f090714, float:1.8214099E38)
            android.view.View r10 = r3.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131298069(0x7f090715, float:1.82141E38)
            android.view.View r11 = r3.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 2131298063(0x7f09070f, float:1.8214089E38)
            android.view.View r12 = r3.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.Object r13 = r18.getItem(r19)
            Y4.z r13 = (Y4.z) r13
            java.lang.String r14 = r13.f4452b
            r9.setText(r14)
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            int r14 = r0.f9061b
            java.lang.String r9 = r9.getString(r14)
            r10.setText(r9)
            int r9 = r0.f9062c
            r10 = 1
            if (r9 == 0) goto L_0x008b
            if (r9 != r10) goto L_0x0091
        L_0x008b:
            r17 = r3
            r16 = r11
            goto L_0x0121
        L_0x0091:
            r16 = r11
            long r10 = r13.f4455f
            int r14 = r0.d
            r15 = -1
            if (r14 != r15) goto L_0x00a7
            if (r1 != 0) goto L_0x00aa
            java.lang.Object r10 = r0.getItem(r2)
            Y4.z r10 = (Y4.z) r10
            r11 = 2131166649(0x7f0705b9, float:1.794755E38)
            r10.d = r11
        L_0x00a7:
            r17 = r3
            goto L_0x0101
        L_0x00aa:
            int r14 = r1 + -1
            java.lang.Object r15 = r0.getItem(r14)
            Y4.z r15 = (Y4.z) r15
            r17 = r3
            long r2 = r15.f4455f
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00cb
            java.lang.Object r2 = r18.getItem(r19)
            Y4.z r2 = (Y4.z) r2
            java.lang.Object r3 = r0.getItem(r14)
            Y4.z r3 = (Y4.z) r3
            int r3 = r3.d
            r2.d = r3
            goto L_0x0101
        L_0x00cb:
            java.lang.Object r2 = r0.getItem(r14)
            Y4.z r2 = (Y4.z) r2
            int r2 = r2.d
            r3 = 2131166638(0x7f0705ae, float:1.7947527E38)
            if (r2 != r3) goto L_0x00db
            r0.d = r14
            goto L_0x0101
        L_0x00db:
            java.lang.Object r2 = r18.getItem(r19)
            Y4.z r2 = (Y4.z) r2
            java.lang.Object r3 = r0.getItem(r14)
            Y4.z r3 = (Y4.z) r3
            int r3 = r3.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.ArrayList r10 = r0.f9063e
            int r3 = r10.indexOf(r3)
            r11 = 1
            int r3 = r3 + r11
            java.lang.Object r3 = r10.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.d = r3
        L_0x0101:
            int r2 = r13.d
            if (r2 == 0) goto L_0x010f
            r2 = 0
            r8.setVisibility(r2)
            int r1 = r13.d
            r8.setImageResource(r1)
            goto L_0x0156
        L_0x010f:
            r2 = 8
            r8.setVisibility(r2)
            int r2 = r0.d
            int r1 = r1 - r2
            r2 = 3
            int r1 = r1 + r2
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r12.setText(r1)
            goto L_0x0156
        L_0x0121:
            if (r1 != 0) goto L_0x012e
            r2 = 0
            r8.setVisibility(r2)
            r1 = 2131166649(0x7f0705b9, float:1.794755E38)
            r8.setImageResource(r1)
            goto L_0x0156
        L_0x012e:
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x013c
            r8.setVisibility(r2)
            r1 = 2131166668(0x7f0705cc, float:1.7947588E38)
            r8.setImageResource(r1)
            goto L_0x0156
        L_0x013c:
            r10 = 2
            if (r1 != r10) goto L_0x0149
            r8.setVisibility(r2)
            r1 = 2131166638(0x7f0705ae, float:1.7947527E38)
            r8.setImageResource(r1)
            goto L_0x0156
        L_0x0149:
            r2 = 8
            r8.setVisibility(r2)
            int r1 = r1 + r3
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r12.setText(r1)
        L_0x0156:
            long r1 = r13.f4455f
            r10 = 9999(0x270f, double:4.94E-320)
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0169
            java.lang.String r1 = com.mtma.criminal.city.utils.U.b(r1)
            r11 = r16
            r11.setText(r1)
        L_0x0167:
            r1 = 3
            goto L_0x0173
        L_0x0169:
            r11 = r16
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r11.setText(r1)
            goto L_0x0167
        L_0x0173:
            if (r9 != r1) goto L_0x0183
            java.lang.String r1 = r13.f4451a
            java.lang.String r2 = r13.f4453c
            I1.b.u(r5, r1, r2)
            r1 = 2131165681(0x7f0701f1, float:1.7945586E38)
            r5.setBackgroundResource(r1)
            goto L_0x01b3
        L_0x0183:
            int r1 = r13.f4454e
            int r1 = R2.b.M(r1)
            r7.setImageResource(r1)
            java.lang.String r1 = r13.f4453c
            I1.b.v(r5, r1)
            boolean r1 = r13.g
            if (r1 == 0) goto L_0x019c
            r1 = 2131166617(0x7f070599, float:1.7947484E38)
            r5.setBackgroundResource(r1)
            goto L_0x01a2
        L_0x019c:
            r1 = 2131166616(0x7f070598, float:1.7947482E38)
            r5.setBackgroundResource(r1)
        L_0x01a2:
            boolean r1 = r13.h
            if (r1 == 0) goto L_0x01ad
            r1 = 2131166585(0x7f070579, float:1.794742E38)
            r6.setImageResource(r1)
            goto L_0x01b3
        L_0x01ad:
            r1 = 2131166584(0x7f070578, float:1.7947417E38)
            r6.setImageResource(r1)
        L_0x01b3:
            j4.f0 r1 = new j4.f0
            r2 = 10
            r1.<init>(r0, r4, r13, r2)
            r4.setOnClickListener(r1)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.n0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public n0(MainActivity mainActivity, ArrayList arrayList) {
        super(mainActivity, 0, arrayList);
        this.f9060a = mainActivity;
        this.f9061b = R.string.activity_gold_bullion_chase_rank_gold_bullion;
    }
}
