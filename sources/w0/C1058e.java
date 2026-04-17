package w0;

/* renamed from: w0.e  reason: case insensitive filesystem */
public final class C1058e {

    /* renamed from: a  reason: collision with root package name */
    public final String f12360a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12361b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12362c;
    public final C1074u d;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: w0.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: w0.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: w0.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: w0.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1058e(org.json.JSONObject r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "formattedPrice"
            java.lang.String r0 = r7.optString(r0)
            r6.f12360a = r0
            java.lang.String r0 = "priceAmountMicros"
            r7.optLong(r0)
            java.lang.String r0 = "priceCurrencyCode"
            r7.optString(r0)
            java.lang.String r0 = "offerIdToken"
            java.lang.String r0 = r7.optString(r0)
            boolean r1 = r0.isEmpty()
            r2 = 0
            r3 = 1
            if (r3 != r1) goto L_0x0024
            r0 = r2
        L_0x0024:
            r6.f12361b = r0
            java.lang.String r0 = "offerId"
            java.lang.String r0 = r7.optString(r0)
            r0.getClass()
            java.lang.String r0 = "purchaseOptionId"
            java.lang.String r0 = r7.optString(r0)
            r0.getClass()
            java.lang.String r0 = "offerType"
            r7.optInt(r0)
            java.lang.String r0 = "offerTags"
            org.json.JSONArray r0 = r7.optJSONArray(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
            if (r0 == 0) goto L_0x005c
            r4 = r3
        L_0x004c:
            int r5 = r0.length()
            if (r4 >= r5) goto L_0x005c
            java.lang.String r5 = r0.getString(r4)
            r1.add(r5)
            int r4 = r4 + 1
            goto L_0x004c
        L_0x005c:
            com.google.android.gms.internal.play_billing.zzco.zzk(r1)
            java.lang.String r0 = "fullPriceMicros"
            boolean r1 = r7.has(r0)
            if (r1 == 0) goto L_0x006a
            r7.optLong(r0)
        L_0x006a:
            java.lang.String r0 = "discountDisplayInfo"
            org.json.JSONObject r0 = r7.optJSONObject(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = "percentageDiscount"
            r0.getInt(r1)
        L_0x0077:
            java.lang.String r0 = "validTimeWindow"
            org.json.JSONObject r0 = r7.optJSONObject(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.String r1 = "startTimeMillis"
            r0.getLong(r1)
            java.lang.String r1 = "endTimeMillis"
            r0.getLong(r1)
        L_0x0089:
            java.lang.String r0 = "limitedQuantityInfo"
            org.json.JSONObject r0 = r7.optJSONObject(r0)
            if (r0 == 0) goto L_0x009b
            java.lang.String r1 = "maximumQuantity"
            r0.getInt(r1)
            java.lang.String r1 = "remainingQuantity"
            r0.getInt(r1)
        L_0x009b:
            java.lang.String r0 = "serializedDocid"
            java.lang.String r0 = r7.optString(r0)
            r6.f12362c = r0
            java.lang.String r0 = "preorderDetails"
            org.json.JSONObject r0 = r7.optJSONObject(r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r1 = "preorderReleaseTimeMillis"
            r0.getLong(r1)
            java.lang.String r1 = "preorderPresaleEndTimeMillis"
            r0.getLong(r1)
        L_0x00b5:
            java.lang.String r0 = "rentalDetails"
            org.json.JSONObject r0 = r7.optJSONObject(r0)
            if (r0 == 0) goto L_0x00cb
            java.lang.String r1 = "rentalPeriod"
            r0.getString(r1)
            java.lang.String r1 = "rentalExpirationPeriod"
            java.lang.String r0 = r0.optString(r1)
            r0.getClass()
        L_0x00cb:
            java.lang.String r0 = "autoPayDetails"
            org.json.JSONObject r7 = r7.optJSONObject(r0)
            if (r7 != 0) goto L_0x00d4
            goto L_0x0124
        L_0x00d4:
            w0.u r2 = new w0.u
            r2.<init>()
            java.lang.String r0 = "type"
            r7.getString(r0)
            java.lang.String r0 = "balanceThresholds"
            org.json.JSONArray r0 = r7.optJSONArray(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L_0x0100
            r4 = r3
        L_0x00ec:
            int r5 = r0.length()
            if (r4 >= r5) goto L_0x0100
            int r5 = r0.getInt(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.add(r5)
            int r4 = r4 + 1
            goto L_0x00ec
        L_0x0100:
            java.lang.String r0 = "pricingPhases"
            org.json.JSONArray r7 = r7.getJSONArray(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r7 == 0) goto L_0x0124
        L_0x010d:
            int r1 = r7.length()
            if (r3 >= r1) goto L_0x0124
            org.json.JSONObject r1 = r7.optJSONObject(r3)
            if (r1 == 0) goto L_0x0121
            androidx.fragment.app.D r4 = new androidx.fragment.app.D
            r4.<init>((org.json.JSONObject) r1)
            r0.add(r4)
        L_0x0121:
            int r3 = r3 + 1
            goto L_0x010d
        L_0x0124:
            r6.d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.C1058e.<init>(org.json.JSONObject):void");
    }
}
