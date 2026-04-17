package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.HashMap;
import q.C0928e;

/* renamed from: v.b  reason: case insensitive filesystem */
public final class C1036b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11948a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f11949b;

    /* renamed from: c  reason: collision with root package name */
    public int f11950c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public String f11951e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11952f;
    public int g;

    public C1036b(C1036b bVar, Object obj) {
        bVar.getClass();
        this.f11949b = bVar.f11949b;
        b(obj);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, v.b] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        Object valueOf;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i2 = 0;
        boolean z3 = false;
        Object obj = null;
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            int i6 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z3 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else {
                int i7 = 3;
                if (index == 3) {
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i7 = 4;
                    if (index == 2) {
                        string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i7 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i2 = 2;
                            } else {
                                if (index == 6) {
                                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    string = obtainStyledAttributes.getString(index);
                                } else {
                                    i6 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        valueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i2 = i6;
                            }
                        }
                        i2 = 7;
                    }
                }
                i2 = i7;
            }
        }
        if (!(str == null || obj == null)) {
            ? obj2 = new Object();
            obj2.f11949b = i2;
            obj2.f11948a = z3;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (C0928e.c(this.f11949b)) {
            case 0:
            case zzaky.zzf.zzg:
                this.f11950c = ((Integer) obj).intValue();
                return;
            case 1:
                this.d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f11951e = (String) obj;
                return;
            case 5:
                this.f11952f = ((Boolean) obj).booleanValue();
                return;
            case zzaky.zzf.zzf:
                this.d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
