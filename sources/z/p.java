package z;

import android.media.AudioAttributes;

public abstract class p {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i2) {
        return builder.setContentType(i2);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i2) {
        return builder.setLegacyStreamType(i2);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i2) {
        return builder.setUsage(i2);
    }
}
