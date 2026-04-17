package S3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.media.session.a;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

public final class s implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f2696a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Future f2697b;

    /* renamed from: c  reason: collision with root package name */
    public Task f2698c;

    public s(URL url) {
        this.f2696a = url;
    }

    public final Bitmap c() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f2696a;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] x02 = a.x0(new C0143d(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + x02.length + " bytes from " + url);
                }
                if (x02.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(x02, 0, x02.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
                        }
                        return decodeByteArray;
                    }
                    throw new IOException("Failed to decode image: " + url);
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public final void close() {
        this.f2697b.cancel(true);
    }
}
