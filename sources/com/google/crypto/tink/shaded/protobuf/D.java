package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

public class D extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6744a;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.IOException, com.google.crypto.tink.shaded.protobuf.D] */
    public static D a() {
        return new IOException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.IOException, com.google.crypto.tink.shaded.protobuf.D] */
    public static D b() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.IOException, com.google.crypto.tink.shaded.protobuf.C] */
    public static C c() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.IOException, com.google.crypto.tink.shaded.protobuf.D] */
    public static D d() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.IOException, com.google.crypto.tink.shaded.protobuf.D] */
    public static D e() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.IOException, com.google.crypto.tink.shaded.protobuf.D] */
    public static D f() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.IOException, com.google.crypto.tink.shaded.protobuf.D] */
    public static D g() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
