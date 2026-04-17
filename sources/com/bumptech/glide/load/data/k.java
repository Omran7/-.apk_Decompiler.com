package com.bumptech.glide.load.data;

import F0.i;
import I0.x;
import U0.e;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import o3.d;

public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    public final i f5819a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5820b;

    /* renamed from: c  reason: collision with root package name */
    public HttpURLConnection f5821c;
    public InputStream d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f5822e;

    public k(i iVar, int i2) {
        this.f5819a = iVar;
        this.f5820b = i2;
    }

    public static int a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e6) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e6);
            return -1;
        }
    }

    public final Class b() {
        return InputStream.class;
    }

    public final void c() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f5821c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f5821c = null;
    }

    public final void cancel() {
        this.f5822e = true;
    }

    public final InputStream d(URL url, int i2, URL url2, Map map) {
        if (i2 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new x("In re-direct loop", -1, (IOException) null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int i5 = this.f5820b;
                httpURLConnection.setConnectTimeout(i5);
                httpURLConnection.setReadTimeout(i5);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f5821c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.d = this.f5821c.getInputStream();
                    if (this.f5822e) {
                        return null;
                    }
                    int a6 = a(this.f5821c);
                    int i6 = a6 / 100;
                    if (i6 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f5821c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.d = new e(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.d = httpURLConnection2.getInputStream();
                            }
                            return this.d;
                        } catch (IOException e6) {
                            throw new x("Failed to obtain InputStream", a(httpURLConnection2), e6);
                        }
                    } else if (i6 == 3) {
                        String headerField = this.f5821c.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                c();
                                return d(url3, i2 + 1, url, map);
                            } catch (MalformedURLException e7) {
                                throw new x(d.i("Bad redirect url: ", headerField), a6, e7);
                            }
                        } else {
                            throw new x("Received empty or null redirect url", a6, (IOException) null);
                        }
                    } else if (a6 == -1) {
                        throw new x("Http request failed", a6, (IOException) null);
                    } else {
                        try {
                            throw new x(this.f5821c.getResponseMessage(), a6, (IOException) null);
                        } catch (IOException e8) {
                            throw new x("Failed to get a response message", a6, e8);
                        }
                    }
                } catch (IOException e9) {
                    throw new x("Failed to connect or obtain data", a(this.f5821c), e9);
                }
            } catch (IOException e10) {
                throw new x("URL.openConnection threw", 0, e10);
            }
        } else {
            throw new x("Too many (> 5) redirects!", -1, (IOException) null);
        }
    }

    public final int e() {
        return 2;
    }

    public final void f(f fVar, d dVar) {
        StringBuilder sb;
        i iVar = this.f5819a;
        int i2 = U0.i.f3686b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            dVar.d(d(iVar.d(), 0, (URL) null, iVar.f688b.b()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(U0.i.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e6) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e6);
            }
            dVar.a(e6);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + U0.i.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
