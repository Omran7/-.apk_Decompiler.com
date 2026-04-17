package H0;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnPartialImageListener;

public final class a implements ImageDecoder$OnPartialImageListener {
    public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
        return false;
    }
}
