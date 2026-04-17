package androidx.media;

import android.media.AudioAttributes;
import v0.C1037a;
import v0.C1038b;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C1037a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f5296a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f5296a, 1);
        audioAttributesImplApi21.f5297b = aVar.f(audioAttributesImplApi21.f5297b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C1037a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f5296a;
        aVar.i(1);
        ((C1038b) aVar).f12149e.writeParcelable(audioAttributes, 0);
        aVar.j(audioAttributesImplApi21.f5297b, 2);
    }
}
