package L4;

import R2.b;
import Y4.D;
import android.content.Context;
import android.support.v4.media.session.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import d5.o;
import j4.C0639o;
import java.util.ArrayList;
import x1.i;

public final class d extends C0286s {

    /* renamed from: M0  reason: collision with root package name */
    public static final /* synthetic */ int f1742M0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public ImageView f1743A0;

    /* renamed from: B0  reason: collision with root package name */
    public RelativeLayout f1744B0;

    /* renamed from: C0  reason: collision with root package name */
    public TextView f1745C0;

    /* renamed from: D0  reason: collision with root package name */
    public RelativeLayout f1746D0;

    /* renamed from: E0  reason: collision with root package name */
    public C0639o f1747E0;

    /* renamed from: F0  reason: collision with root package name */
    public final ArrayList f1748F0 = new ArrayList();

    /* renamed from: G0  reason: collision with root package name */
    public final ArrayList f1749G0 = new ArrayList();

    /* renamed from: H0  reason: collision with root package name */
    public final ArrayList f1750H0 = new ArrayList();

    /* renamed from: I0  reason: collision with root package name */
    public final ArrayList f1751I0 = new ArrayList();

    /* renamed from: J0  reason: collision with root package name */
    public final ArrayList f1752J0 = new ArrayList();

    /* renamed from: K0  reason: collision with root package name */
    public final ArrayList f1753K0 = new ArrayList();
    public final ArrayList L0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    public final Context f1754d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f1755e0;

    /* renamed from: f0  reason: collision with root package name */
    public ListView f1756f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f1757g0;

    /* renamed from: h0  reason: collision with root package name */
    public ConstraintLayout f1758h0;

    /* renamed from: i0  reason: collision with root package name */
    public ImageView f1759i0;

    /* renamed from: j0  reason: collision with root package name */
    public ConstraintLayout f1760j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f1761k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f1762l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextView f1763m0;

    /* renamed from: n0  reason: collision with root package name */
    public ConstraintLayout f1764n0;

    /* renamed from: o0  reason: collision with root package name */
    public TextView f1765o0;

    /* renamed from: p0  reason: collision with root package name */
    public ImageView f1766p0;

    /* renamed from: q0  reason: collision with root package name */
    public ConstraintLayout f1767q0;

    /* renamed from: r0  reason: collision with root package name */
    public TextView f1768r0;
    public RelativeLayout s0;

    /* renamed from: t0  reason: collision with root package name */
    public TextView f1769t0;

    /* renamed from: u0  reason: collision with root package name */
    public LinearLayout f1770u0;

    /* renamed from: v0  reason: collision with root package name */
    public TextView f1771v0;

    /* renamed from: w0  reason: collision with root package name */
    public ImageView f1772w0;

    /* renamed from: x0  reason: collision with root package name */
    public RelativeLayout f1773x0;

    /* renamed from: y0  reason: collision with root package name */
    public LinearLayout f1774y0;

    /* renamed from: z0  reason: collision with root package name */
    public TextView f1775z0;

    public d(Context context) {
        this.f1754d0 = context;
    }

    public static void V(d dVar, int i2, boolean z3) {
        dVar.getClass();
        b.w(true);
        if (o.getLocationObject().getCurrentCity() == 0) {
            a.O(new a(dVar, i2, z3, 0));
            return;
        }
        a.N(o.getAccountObject().getId(), new a(dVar, i2, z3, 1));
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [Y4.D, java.lang.Object] */
    public static ArrayList X(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            D d = (D) arrayList.get(i2);
            ? obj = new Object();
            obj.f4293a = -1;
            obj.f4298i = 0;
            obj.f4300k = false;
            obj.f4301l = false;
            obj.f4302m = false;
            obj.f4303n = false;
            obj.f4304o = false;
            obj.f4305p = false;
            obj.f4306q = false;
            obj.f4307r = false;
            obj.f4308s = -1;
            obj.f4293a = d.f4293a;
            obj.f4294b = d.f4294b;
            obj.f4295c = d.f4295c;
            obj.d = d.d;
            obj.f4296e = d.f4296e;
            obj.f4297f = d.f4297f;
            obj.g = d.g;
            obj.h = d.h;
            obj.f4298i = d.f4298i;
            obj.f4299j = d.f4299j;
            obj.f4300k = d.f4300k;
            obj.f4301l = d.f4301l;
            obj.f4302m = d.f4302m;
            obj.f4303n = d.f4303n;
            obj.f4304o = d.f4304o;
            obj.f4305p = d.f4305p;
            obj.f4306q = d.f4306q;
            obj.f4307r = d.f4307r;
            obj.f4308s = d.f4308s;
            obj.f4309t = d.f4309t;
            obj.f4310u = d.f4310u;
            obj.f4311v = d.f4311v;
            obj.f4312w = d.f4312w;
            obj.f4313x = d.f4313x;
            obj.f4314y = d.f4314y;
            obj.f4315z = d.f4315z;
            obj.f4289A = d.f4289A;
            obj.f4290B = d.f4290B;
            obj.f4291C = d.f4291C;
            arrayList2.add(obj);
        }
        return arrayList2;
    }

    public static void a0(D d, ArrayList arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (d.f4293a != ((D) arrayList.get(i2)).f4293a || d.f4298i != ((D) arrayList.get(i2)).f4298i) {
                boolean z3 = ((D) arrayList.get(i2)).f4307r;
                boolean z4 = d.f4307r;
                if ((z4 && z3) || (!z4 && !z3)) {
                    ((D) arrayList.get(i2)).f4304o = false;
                }
            }
        }
    }

    public static void b0(ArrayList arrayList, boolean z3) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            boolean z4 = ((D) arrayList.get(i2)).f4307r;
            if ((z3 && z4) || (!z3 && !z4)) {
                ((D) arrayList.get(i2)).f4304o = false;
            }
        }
    }

    public static void c0(D d, ArrayList arrayList, int i2) {
        int i5 = 0;
        while (i5 < arrayList.size()) {
            if (d.f4293a != ((D) arrayList.get(i5)).f4293a || d.f4298i != ((D) arrayList.get(i5)).f4298i) {
                i5++;
            } else if (i2 == 1) {
                ((D) arrayList.get(i5)).f4304o = false;
                return;
            } else if (d.h > 0) {
                arrayList.set(i5, d);
                return;
            } else {
                arrayList.remove(i5);
                return;
            }
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_arming, viewGroup, false);
        this.f1755e0 = inflate;
        this.f1758h0 = (ConstraintLayout) inflate.findViewById(R.id.fragment_arming_gun_image_layout);
        this.f1757g0 = (TextView) this.f1755e0.findViewById(R.id.fragment_arming_gun_name);
        this.f1759i0 = (ImageView) this.f1755e0.findViewById(R.id.fragment_arming_gun_image);
        this.f1760j0 = (ConstraintLayout) this.f1755e0.findViewById(R.id.fragment_arming_gun_level_layout);
        this.f1761k0 = (TextView) this.f1755e0.findViewById(R.id.fragment_arming_gun_level);
        this.f1762l0 = (RelativeLayout) this.f1755e0.findViewById(R.id.fragment_arming_gun_button);
        this.f1763m0 = (TextView) this.f1755e0.findViewById(R.id.fragment_arming_gun_button_text);
        this.f1764n0 = (ConstraintLayout) this.f1755e0.findViewById(R.id.fragment_arming_armor_image_layout);
        this.f1765o0 = (TextView) this.f1755e0.findViewById(R.id.fragment_arming_armor_name);
        this.f1766p0 = (ImageView) this.f1755e0.findViewById(R.id.fragment_arming_armor_image);
        this.f1767q0 = (ConstraintLayout) this.f1755e0.findViewById(R.id.fragment_arming_armor_level_layout);
        this.f1768r0 = (TextView) this.f1755e0.findViewById(R.id.fragment_arming_armor_level);
        this.s0 = (RelativeLayout) this.f1755e0.findViewById(R.id.fragment_arming_armor_button);
        this.f1769t0 = (TextView) this.f1755e0.findViewById(R.id.fragment_arming_armor_button_text);
        this.f1770u0 = (LinearLayout) this.f1755e0.findViewById(R.id.fragment_arming_special_equipment_image_layout);
        this.f1771v0 = (TextView) this.f1755e0.findViewById(R.id.fragment_arming_special_equipment_name);
        this.f1772w0 = (ImageView) this.f1755e0.findViewById(R.id.fragment_arming_special_equipment_image);
        this.f1773x0 = (RelativeLayout) this.f1755e0.findViewById(R.id.fragment_arming_special_equipment_button);
        this.f1774y0 = (LinearLayout) this.f1755e0.findViewById(R.id.fragment_arming_biochemical_image_layout);
        this.f1775z0 = (TextView) this.f1755e0.findViewById(R.id.fragment_arming_biochemical_name);
        this.f1743A0 = (ImageView) this.f1755e0.findViewById(R.id.fragment_arming_biochemical_image);
        this.f1744B0 = (RelativeLayout) this.f1755e0.findViewById(R.id.fragment_arming_biochemical_button);
        this.f1756f0 = (ListView) this.f1755e0.findViewById(R.id.fragment_arming_list_view);
        this.f1745C0 = (TextView) this.f1755e0.findViewById(R.id.fragment_arming_empty_view);
        this.f1746D0 = (RelativeLayout) this.f1755e0.findViewById(R.id.fragment_arming_back_button);
        W();
        com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(com.google.android.gms.internal.measurement.a.e(true), "players"), "stockObject", "itemsInStock").d(new i((Object) this, 23));
        RelativeLayout relativeLayout = this.f1762l0;
        relativeLayout.setOnClickListener(new b(this, relativeLayout, 1));
        RelativeLayout relativeLayout2 = this.s0;
        relativeLayout2.setOnClickListener(new b(this, relativeLayout2, 2));
        RelativeLayout relativeLayout3 = this.f1773x0;
        relativeLayout3.setOnClickListener(new b(this, relativeLayout3, 3));
        RelativeLayout relativeLayout4 = this.f1744B0;
        relativeLayout4.setOnClickListener(new b(this, relativeLayout4, 4));
        RelativeLayout relativeLayout5 = this.f1746D0;
        relativeLayout5.setOnClickListener(new b(this, relativeLayout5, 0));
        return this.f1755e0;
    }

    public final void W() {
        D d;
        D d6;
        if (o.getArmingObject().getGunId() == -1) {
            this.f1760j0.setVisibility(8);
            this.f1757g0.setText(R.string.gun);
            this.f1759i0.setImageResource(R.drawable.stock_empty_frame);
            this.f1763m0.setText(R.string.button_buy);
            this.f1758h0.setOnClickListener((View.OnClickListener) null);
        } else {
            if (o.getArmingObject().getGunLevel() > 0) {
                d6 = D.v(o.getArmingObject().getGunId(), 1, o.getArmingObject().getGunLevel(), false);
                this.f1760j0.setVisibility(0);
                this.f1761k0.setText(String.valueOf(o.getArmingObject().getGunLevel()));
            } else {
                d6 = D.j(o.getArmingObject().getGunId(), 1, false);
                this.f1760j0.setVisibility(8);
            }
            this.f1757g0.setText(d6.f4295c);
            this.f1759i0.setImageResource(d6.d);
            this.f1763m0.setText(R.string.button_remove);
            ConstraintLayout constraintLayout = this.f1758h0;
            constraintLayout.setOnClickListener(new c(this, constraintLayout, d6, 0));
        }
        if (o.getArmingObject().getArmorId() == -1) {
            this.f1767q0.setVisibility(8);
            this.f1765o0.setText(R.string.armor);
            this.f1766p0.setImageResource(R.drawable.stock_empty_frame);
            this.f1769t0.setText(R.string.button_buy);
            this.f1764n0.setOnClickListener((View.OnClickListener) null);
        } else {
            if (o.getArmingObject().getArmorLevel() > 0) {
                d = D.v(o.getArmingObject().getArmorId(), 1, o.getArmingObject().getArmorLevel(), false);
                this.f1767q0.setVisibility(0);
                this.f1768r0.setText(String.valueOf(o.getArmingObject().getArmorLevel()));
            } else {
                d = D.b(o.getArmingObject().getArmorId(), 1, false);
                this.f1767q0.setVisibility(8);
            }
            this.f1765o0.setText(d.f4295c);
            this.f1766p0.setImageResource(d.d);
            this.f1769t0.setText(R.string.button_remove);
            ConstraintLayout constraintLayout2 = this.f1764n0;
            constraintLayout2.setOnClickListener(new c(this, constraintLayout2, d, 1));
        }
        if (o.getArmingObject().getSpecialEquipmentId() == -1) {
            this.f1771v0.setText(R.string.special_equipment);
            this.f1772w0.setImageResource(R.drawable.stock_empty_frame);
            this.f1773x0.setVisibility(8);
            this.f1770u0.setOnClickListener((View.OnClickListener) null);
        } else {
            D s6 = D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1);
            this.f1771v0.setText(s6.f4295c);
            this.f1772w0.setImageResource(s6.d);
            this.f1773x0.setVisibility(0);
            LinearLayout linearLayout = this.f1770u0;
            linearLayout.setOnClickListener(new c(this, linearLayout, s6, 2));
        }
        if (o.getArmingObject().getBioChemicalId() == -1) {
            this.f1775z0.setText(R.string.bio_chemical);
            this.f1743A0.setImageResource(R.drawable.stock_empty_frame);
            this.f1744B0.setVisibility(8);
            this.f1774y0.setOnClickListener((View.OnClickListener) null);
            return;
        }
        D s7 = D.s(o.getArmingObject().getBioChemicalId(), 0, 1);
        this.f1775z0.setText(s7.f4295c);
        this.f1743A0.setImageResource(s7.d);
        this.f1744B0.setVisibility(0);
        LinearLayout linearLayout2 = this.f1774y0;
        linearLayout2.setOnClickListener(new c(this, linearLayout2, s7, 3));
    }

    public final void Y(D d, int i2) {
        int i5 = d.f4294b;
        ArrayList arrayList = this.f1752J0;
        ArrayList arrayList2 = this.f1751I0;
        ArrayList arrayList3 = this.f1750H0;
        if (i5 == 14) {
            if (i2 == 0) {
                a0(d, arrayList2);
                a0(d, arrayList);
                a0(d, arrayList3);
            }
            c0(d, arrayList3, i2);
        } else if (i5 == 0) {
            if (i2 == 0) {
                a0(d, arrayList3);
                a0(d, arrayList2);
            }
            c0(d, arrayList2, i2);
        } else if (i5 == 1) {
            if (i2 == 0) {
                a0(d, arrayList3);
                a0(d, arrayList);
            }
            c0(d, arrayList, i2);
        } else if (i5 == 15) {
            ArrayList arrayList4 = this.f1753K0;
            if (i2 == 0) {
                a0(d, arrayList4);
            }
            c0(d, arrayList4, i2);
        } else if (i5 == 16) {
            ArrayList arrayList5 = this.L0;
            if (i2 == 0) {
                a0(d, arrayList5);
            }
            c0(d, arrayList5, i2);
        }
        Z();
        if (i2 == 0 || i2 == 1) {
            W();
        }
    }

    public final void Z() {
        ArrayList arrayList = this.f1748F0;
        arrayList.clear();
        arrayList.addAll(X(this.f1750H0));
        arrayList.addAll(X(this.f1751I0));
        arrayList.addAll(X(this.f1752J0));
        arrayList.addAll(X(this.f1753K0));
        arrayList.addAll(X(this.L0));
        ArrayList arrayList2 = this.f1749G0;
        arrayList2.clear();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (((D) arrayList.get(i2)).f4304o) {
                D s6 = D.s(((D) arrayList.get(i2)).f4293a, ((D) arrayList.get(i2)).f4298i, 1);
                s6.f4304o = true;
                s6.f4300k = false;
                s6.f4301l = false;
                arrayList2.add(s6);
                if (((D) arrayList.get(i2)).h > 1) {
                    ((D) arrayList.get(i2)).h--;
                } else {
                    arrayList.remove(i2);
                    i2--;
                }
            }
            i2++;
        }
        arrayList.addAll(arrayList2);
        this.f1747E0.notifyDataSetChanged();
    }
}
