package Z4;

import d5.u;

public class i {
    public String customToken = "";
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAccountCreatedSuccessfully = false;
    public boolean isNameAlreadyExist = false;
    public boolean isReachToMaximumAccountsOnDevice = false;
    public u userObject;

    public String toString() {
        return "CreateNewAccountResultObject{hasError=" + this.hasError + ", isNameAlreadyExist=" + this.isNameAlreadyExist + ", isReachToMaximumAccountsOnDevice=" + this.isReachToMaximumAccountsOnDevice + ", isAccountCreatedSuccessfully=" + this.isAccountCreatedSuccessfully + ", customToken=" + this.customToken + ", errorMessage='" + this.errorMessage + "', userObject=" + this.userObject + '}';
    }
}
