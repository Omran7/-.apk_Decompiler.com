package androidx.media;

import android.util.SparseIntArray;
import v0.C1039c;

public class AudioAttributesCompat implements C1039c {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f5294b = 0;

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f5295a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f5295a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f5295a);
        }
        if (audioAttributesCompat.f5295a == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5295a.hashCode();
    }

    public final String toString() {
        return this.f5295a.toString();
    }
}
