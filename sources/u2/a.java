package U2;

import A2.b;
import A2.d;
import A2.g;
import A2.i;
import K1.e;
import T1.K0;
import java.util.Arrays;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final i f3704a;

    /* renamed from: b  reason: collision with root package name */
    public static final i f3705b;

    /* renamed from: c  reason: collision with root package name */
    public static final i f3706c;

    static {
        int i2 = g.f31c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        g.z(15, objArr);
        b bVar = d.f24b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        R2.b.h(7, objArr2);
        f3704a = d.x(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        R2.b.h(3, objArr3);
        f3705b = d.x(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        R2.b.h(2, objArr4);
        f3706c = d.x(2, objArr4);
        com.bumptech.glide.d.f(4, "initialCapacity");
        String[] strArr = K0.f2979i;
        R2.b.h(15, strArr);
        Object[] copyOf = Arrays.copyOf(new Object[4], e.o(4, 15));
        System.arraycopy(strArr, 0, copyOf, 0, 15);
        String[] strArr2 = K0.f2980j;
        R2.b.h(15, strArr2);
        if (copyOf.length < 30) {
            copyOf = Arrays.copyOf(copyOf, e.o(copyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, copyOf, 15, 15);
        d.x(30, copyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        R2.b.h(2, objArr5);
        d.x(2, objArr5);
    }
}
