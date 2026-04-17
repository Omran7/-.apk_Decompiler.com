package w0;

import android.text.TextUtils;
import androidx.emoji2.text.v;
import androidx.fragment.app.D;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: w0.f  reason: case insensitive filesystem */
public final class C1059f {

    /* renamed from: a  reason: collision with root package name */
    public final String f12363a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f12364b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12365c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12366e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12367f;
    public final String g;
    public final ArrayList h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f12368i;

    public C1059f(String str) {
        ArrayList arrayList;
        String str2 = str;
        this.f12363a = str2;
        JSONObject jSONObject = new JSONObject(str2);
        this.f12364b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f12365c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        } else if (!TextUtils.isEmpty(optString2)) {
            this.f12366e = jSONObject.optString("title");
            jSONObject.optString("name");
            jSONObject.optString("description");
            jSONObject.optString("packageDisplayName");
            jSONObject.optString("iconUrl");
            this.f12367f = jSONObject.optString("skuDetailsToken");
            this.g = jSONObject.optString("serializedDocid");
            JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    v vVar = new v(29);
                    jSONObject2.optString("basePlanId");
                    jSONObject2.optString("offerId").getClass();
                    jSONObject2.getString("offerIdToken");
                    JSONArray jSONArray = jSONObject2.getJSONArray("pricingPhases");
                    ArrayList arrayList3 = new ArrayList();
                    if (jSONArray != null) {
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i5);
                            if (optJSONObject != null) {
                                arrayList3.add(new D(optJSONObject));
                            }
                        }
                    }
                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("installmentPlanDetails");
                    if (optJSONObject2 != null) {
                        optJSONObject2.getInt("commitmentPaymentsCount");
                        optJSONObject2.optInt("subsequentCommitmentPaymentsCount");
                    }
                    JSONObject optJSONObject3 = jSONObject2.optJSONObject("transitionPlanDetails");
                    if (optJSONObject3 != null) {
                        optJSONObject3.getString("productId");
                        optJSONObject3.optString("title");
                        optJSONObject3.optString("name");
                        optJSONObject3.optString("description");
                        optJSONObject3.optString("basePlanId");
                        JSONObject optJSONObject4 = optJSONObject3.optJSONObject("pricingPhase");
                        if (optJSONObject4 != null) {
                            optJSONObject4.optString("billingPeriod");
                            optJSONObject4.optString("priceCurrencyCode");
                            optJSONObject4.optString("formattedPrice");
                            optJSONObject4.optLong("priceAmountMicros");
                            optJSONObject4.optInt("recurrenceMode");
                            optJSONObject4.optInt("billingCycleCount");
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("offerTags");
                    if (optJSONArray2 != null) {
                        for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                            arrayList4.add(optJSONArray2.getString(i6));
                        }
                    }
                    arrayList2.add(vVar);
                }
                this.h = arrayList2;
            } else {
                if (optString2.equals("subs") || optString2.equals("play_pass_subs")) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                this.h = arrayList;
            }
            JSONObject optJSONObject5 = this.f12364b.optJSONObject("oneTimePurchaseOfferDetails");
            JSONArray optJSONArray3 = this.f12364b.optJSONArray("oneTimePurchaseOfferDetailsList");
            ArrayList arrayList5 = new ArrayList();
            if (optJSONArray3 != null) {
                for (int i7 = 0; i7 < optJSONArray3.length(); i7++) {
                    arrayList5.add(new C1058e(optJSONArray3.getJSONObject(i7)));
                }
                this.f12368i = arrayList5;
            } else if (optJSONObject5 != null) {
                arrayList5.add(new C1058e(optJSONObject5));
                this.f12368i = arrayList5;
            } else {
                this.f12368i = null;
            }
        } else {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
    }

    public final C1058e a() {
        ArrayList arrayList = this.f12368i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (C1058e) arrayList.get(0);
    }

    public final String b() {
        return this.f12365c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f12364b.optString("packageName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1059f)) {
            return false;
        }
        return TextUtils.equals(this.f12363a, ((C1059f) obj).f12363a);
    }

    public final int hashCode() {
        return this.f12363a.hashCode();
    }

    public final String toString() {
        String obj = this.f12364b.toString();
        String valueOf = String.valueOf(this.h);
        return "ProductDetails{jsonString='" + this.f12363a + "', parsedJson=" + obj + ", productId='" + this.f12365c + "', productType='" + this.d + "', title='" + this.f12366e + "', productDetailsToken='" + this.f12367f + "', subscriptionOfferDetails=" + valueOf + "}";
    }
}
