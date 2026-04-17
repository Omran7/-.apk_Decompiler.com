package androidx.media;

import v0.C1037a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C1037a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f5298a = aVar.f(audioAttributesImplBase.f5298a, 1);
        audioAttributesImplBase.f5299b = aVar.f(audioAttributesImplBase.f5299b, 2);
        audioAttributesImplBase.f5300c = aVar.f(audioAttributesImplBase.f5300c, 3);
        audioAttributesImplBase.d = aVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C1037a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f5298a, 1);
        aVar.j(audioAttributesImplBase.f5299b, 2);
        aVar.j(audioAttributesImplBase.f5300c, 3);
        aVar.j(audioAttributesImplBase.d, 4);
    }
}
