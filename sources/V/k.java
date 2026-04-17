package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import r.C0939a;

public final class k {

    /* renamed from: j  reason: collision with root package name */
    public static final SparseIntArray f12111j;

    /* renamed from: a  reason: collision with root package name */
    public int f12112a;

    /* renamed from: b  reason: collision with root package name */
    public int f12113b;

    /* renamed from: c  reason: collision with root package name */
    public int f12114c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f12115e;

    /* renamed from: f  reason: collision with root package name */
    public float f12116f;
    public int g;
    public String h;

    /* renamed from: i  reason: collision with root package name */
    public int f12117i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12111j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f12141f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f12111j.get(index)) {
                case 1:
                    this.f12115e = obtainStyledAttributes.getFloat(index, this.f12115e);
                    break;
                case 2:
                    this.f12114c = obtainStyledAttributes.getInt(index, this.f12114c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        String str = C0939a.f11126a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f12112a = n.f(obtainStyledAttributes, index, this.f12112a);
                    break;
                case zzaky.zzf.zzf:
                    this.f12113b = obtainStyledAttributes.getInteger(index, this.f12113b);
                    break;
                case zzaky.zzf.zzg:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.g = obtainStyledAttributes.getInteger(index, this.g);
                    break;
                case 9:
                    this.f12116f = obtainStyledAttributes.getFloat(index, this.f12116f);
                    break;
                case 10:
                    int i5 = obtainStyledAttributes.peekValue(index).type;
                    if (i5 != 1) {
                        if (i5 != 3) {
                            obtainStyledAttributes.getInteger(index, this.f12117i);
                            break;
                        } else {
                            String string = obtainStyledAttributes.getString(index);
                            this.h = string;
                            if (string.indexOf("/") <= 0) {
                                break;
                            } else {
                                this.f12117i = obtainStyledAttributes.getResourceId(index, -1);
                                break;
                            }
                        }
                    } else {
                        this.f12117i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
