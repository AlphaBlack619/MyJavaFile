public class AutoPolicy {
   private int accountNumber;
  private  String makeAndModel;
  private  String state;
    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
    public boolean isNoFaultState() {
        boolean noFaultState;
        switch (getState()) {
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        } return noFaultState;
    }
    public int getAccountNumber(){ return accountNumber;}
    public String getMakeAndModel(){return makeAndModel;}
    public String getState(){ return state;}
    public void setAccountNumber(int accountNumber){ this.accountNumber = accountNumber;}
    public void setMakeAndModel() {this.makeAndModel = makeAndModel;}
    public void setState(){this.state = state;}

}
