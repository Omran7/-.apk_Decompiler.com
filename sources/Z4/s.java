package Z4;

public class s {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isEmailAlreadyExist = false;
    public boolean isUserNameAlreadyExist = false;

    public String toString() {
        return "SaveAccountDataObject{hasError=" + this.hasError + ", isAllProcessSuccess=" + this.isAllProcessSuccess + ", isEmailAlreadyExist=" + this.isEmailAlreadyExist + ", isUserNameAlreadyExist=" + this.isUserNameAlreadyExist + ", errorMessage=" + this.errorMessage + '}';
    }
}
