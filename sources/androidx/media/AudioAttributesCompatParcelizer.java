package androidx.media;

import v0.C1037a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C1037a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f5295a;
        if (aVar.e(1)) {
            obj = aVar.h();
        }
        audioAttributesCompat.f5295a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C1037a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f5295a;
        aVar.i(1);
        aVar.k(audioAttributesImpl);
    }
}
