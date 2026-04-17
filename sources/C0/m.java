package C0;

import I3.h;
import U0.o;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class m {
    public static final Bitmap.Config[] d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f425e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f426f = {Bitmap.Config.RGB_565};
    public static final Bitmap.Config[] g = {Bitmap.Config.ARGB_4444};
    public static final Bitmap.Config[] h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    public final f f427a = new f(1);

    /* renamed from: b  reason: collision with root package name */
    public final h f428b = new h(3);

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f429c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        f425e = configArr;
    }

    public static String c(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap d6 = d(bitmap.getConfig());
        Integer num2 = (Integer) d6.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(o.c(bitmap), bitmap.getConfig()) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d6.remove(num);
        } else {
            d6.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final Bitmap b(int i2, int i5, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int d6 = o.d(config) * i2 * i5;
        f fVar = this.f427a;
        j jVar = (j) ((ArrayDeque) fVar.f398a).poll();
        if (jVar == null) {
            jVar = fVar.p();
        }
        l lVar = (l) jVar;
        lVar.f423b = d6;
        lVar.f424c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i6 = k.f421a[config.ordinal()];
            if (i6 == 1) {
                configArr = d;
            } else if (i6 == 2) {
                configArr = f426f;
            } else if (i6 == 3) {
                configArr = g;
            } else if (i6 != 4) {
                configArr = new Bitmap.Config[]{config};
            } else {
                configArr = h;
            }
        } else {
            configArr = f425e;
        }
        int length = configArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i7];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(d6));
            if (num == null || num.intValue() > d6 * 8) {
                i7++;
            } else if (num.intValue() != d6 || (config2 != null ? !config2.equals(config) : config != null)) {
                fVar.l(lVar);
                int intValue = num.intValue();
                j jVar2 = (j) ((ArrayDeque) fVar.f398a).poll();
                if (jVar2 == null) {
                    jVar2 = fVar.p();
                }
                lVar = (l) jVar2;
                lVar.f423b = intValue;
                lVar.f424c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.f428b.j(lVar);
        if (bitmap != null) {
            a(Integer.valueOf(lVar.f423b), bitmap);
            bitmap.reconfigure(i2, i5, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.f429c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int c3 = o.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        f fVar = this.f427a;
        j jVar = (j) ((ArrayDeque) fVar.f398a).poll();
        if (jVar == null) {
            jVar = fVar.p();
        }
        l lVar = (l) jVar;
        lVar.f423b = c3;
        lVar.f424c = config;
        this.f428b.E(lVar, bitmap);
        NavigableMap d6 = d(bitmap.getConfig());
        Integer num = (Integer) d6.get(Integer.valueOf(lVar.f423b));
        Integer valueOf = Integer.valueOf(lVar.f423b);
        int i2 = 1;
        if (num != null) {
            i2 = 1 + num.intValue();
        }
        d6.put(valueOf, Integer.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f428b);
        sb.append(", sortedSizes=(");
        HashMap hashMap = this.f429c;
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!hashMap.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
