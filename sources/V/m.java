package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

public final class m {

    /* renamed from: n  reason: collision with root package name */
    public static final SparseIntArray f12121n;

    /* renamed from: a  reason: collision with root package name */
    public float f12122a;

    /* renamed from: b  reason: collision with root package name */
    public float f12123b;

    /* renamed from: c  reason: collision with root package name */
    public float f12124c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f12125e;

    /* renamed from: f  reason: collision with root package name */
    public float f12126f;
    public float g;
    public int h;

    /* renamed from: i  reason: collision with root package name */
    public float f12127i;

    /* renamed from: j  reason: collision with root package name */
    public float f12128j;

    /* renamed from: k  reason: collision with root package name */
    public float f12129k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12130l;

    /* renamed from: m  reason: collision with root package name */
    public float f12131m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12121n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f12142i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f12121n.get(index)) {
                case 1:
                    this.f12122a = obtainStyledAttributes.getFloat(index, this.f12122a);
                    break;
                case 2:
                    this.f12123b = obtainStyledAttributes.getFloat(index, this.f12123b);
                    break;
                case 3:
                    this.f12124c = obtainStyledAttributes.getFloat(index, this.f12124c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.f12125e = obtainStyledAttributes.getFloat(index, this.f12125e);
                    break;
                case zzaky.zzf.zzf:
                    this.f12126f = obtainStyledAttributes.getDimension(index, this.f12126f);
                    break;
                case zzaky.zzf.zzg:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 8:
                    this.f12127i = obtainStyledAttributes.getDimension(index, this.f12127i);
                    break;
                case 9:
                    this.f12128j = obtainStyledAttributes.getDimension(index, this.f12128j);
                    break;
                case 10:
                    this.f12129k = obtainStyledAttributes.getDimension(index, this.f12129k);
                    break;
                case ModuleDescriptor.MODULE_VERSION:
                    this.f12130l = true;
                    this.f12131m = obtainStyledAttributes.getDimension(index, this.f12131m);
                    break;
                case 12:
                    this.h = n.f(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
