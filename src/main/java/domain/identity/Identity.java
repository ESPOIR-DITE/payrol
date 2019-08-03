package domain.identity;

public class Identity {
    private int identityId;
    private String indentityTpe;
    private String identityValeu;

    private Identity() {
    }

    public int getIdentityId() {
        return identityId;
    }

    public void setIdentityId(int identityId) {
        this.identityId = identityId;
    }

    public String getIndentityTpe() {
        return indentityTpe;
    }

    public void setIndentityTpe(String indentityTpe) {
        this.indentityTpe = indentityTpe;
    }

    public String getIdentityValeu() {
        return identityValeu;
    }

    public void setIdentityValeu(String identityValeu) {
        this.identityValeu = identityValeu;
    }

    @Override
    public String toString() {
        return "Itentity{" +
                "identityId=" + identityId +
                ", indentityTpe='" + indentityTpe + '\'' +
                ", identityValeu='" + identityValeu + '\'' +
                '}';
    }

    public static class Builder{
        private int identityId;
        private String indentityType;
        private String identityValeu;

        public Builder(int identityId) {
            this.identityId = identityId;
        }
        public Builder buildIdentityTpe(String indentityType){
            this.indentityType=indentityType;
            return this;
        }
        public Builder buildIdentityValeu(String identityValeu){
            this.identityValeu=identityValeu;
            return this;
        }
        public Identity getIdentity(){
            Identity identity=new Identity();
            identity.identityId=this.identityId;
            identity.identityValeu=this.identityValeu;
            identity.indentityTpe=this.indentityType;
            return identity;
        }
    }
}
