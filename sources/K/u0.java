package K;

import android.view.WindowInsets;

public abstract class u0 {
    public static int a(int i2) {
        int b6;
        int i5 = 0;
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((i2 & i6) != 0) {
                if (i6 == 1) {
                    b6 = WindowInsets.Type.statusBars();
                } else if (i6 == 2) {
                    b6 = WindowInsets.Type.navigationBars();
                } else if (i6 == 4) {
                    b6 = WindowInsets.Type.captionBar();
                } else if (i6 == 8) {
                    b6 = WindowInsets.Type.ime();
                } else if (i6 == 16) {
                    b6 = WindowInsets.Type.systemGestures();
                } else if (i6 == 32) {
                    b6 = WindowInsets.Type.mandatorySystemGestures();
                } else if (i6 == 64) {
                    b6 = WindowInsets.Type.tappableElement();
                } else if (i6 == 128) {
                    b6 = WindowInsets.Type.displayCutout();
                }
                i5 |= b6;
            }
        }
        return i5;
    }
}
