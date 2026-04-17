package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* renamed from: a  reason: collision with root package name */
    public final ParcelFileDescriptor f5804a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f5804a = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() {
        ParcelFileDescriptor parcelFileDescriptor = this.f5804a;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e6) {
            throw new IOException(e6);
        }
    }
}
