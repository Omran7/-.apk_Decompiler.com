package androidx.media;

import android.media.AudioAttributes;

class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f5296a;

    /* renamed from: b  reason: collision with root package name */
    public int f5297b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f5296a.equals(((AudioAttributesImplApi21) obj).f5296a);
    }

    public final int hashCode() {
        return this.f5296a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f5296a;
    }
}
