package Prestamo;

public class PrestamoModelo {

	
	
	
private  int RESULT;		
private String SUBID;//	VARCHAR2	IN OUT	
private int OPERATORID;//NUMBER	IN	
private int SRRID;//NUMBER	OUT
private String CHARGEDATE;//VARCHAR2	OUT	
private String ACCREDITATIONDATE;//VARCHAR2	OUT	
private int SERVICEFLAG;//NUMBER	OUT	
private int DEBITAMOUNT;//NUMBER	OUT	
private int FLAGFORM;//	NUMBER	OUT	
private String USERFORM;//	VARCHAR2	OUT
private int CURRENTACCCREDITAMT;//	NUMBER	OUT	
private int CURRENTACCSERVICECOST;//	NUMBER	OUT	
private int  SERVICECOSTCHARGED;//	NUMBER	OUT	
private String FREESERVICECOSTDATE;//	VARCHAR2	OUT	
private int LOANTIMELOANAMOUNT;//	NUMBER	OUT	
private int LOANTIMESERVICECOST;//	NUMBER	OUT	
private String LOANTIMEORDERDISCOUNT;//	VARCHAR2	OUT	


   //ATRIBUTOS
    public int getRESULT() {
        return RESULT;
    }

    public void setRESULT(int RESULT) {
        this.RESULT = RESULT;
    }

    public String getSUBID() {
        return SUBID;
    }

    public void setSUBID(String SUBID) {
        this.SUBID = SUBID;
    }

    public int getOPERATORID() {
        return OPERATORID;
    }

    public void setOPERATORID(int OPERATORID) {
        this.OPERATORID = OPERATORID;
    }

    public int getSRRID() {
        return SRRID;
    }

    public void setSRRID(int SRRID) {
        this.SRRID = SRRID;
    }

    public String getCHARGEDATE() {
        return CHARGEDATE;
    }

    public void setCHARGEDATE(String CHARGEDATE) {
        this.CHARGEDATE = CHARGEDATE;
    }

    public String getACCREDITATIONDATE() {
        return ACCREDITATIONDATE;
    }

    public void setACCREDITATIONDATE(String ACCREDITATIONDATE) {
        this.ACCREDITATIONDATE = ACCREDITATIONDATE;
    }

    public int getSERVICEFLAG() {
        return SERVICEFLAG;
    }

    public void setSERVICEFLAG(int SERVICEFLAG) {
        this.SERVICEFLAG = SERVICEFLAG;
    }

    public int getDEBITAMOUNT() {
        return DEBITAMOUNT;
    }

    public void setDEBITAMOUNT(int DEBITAMOUNT) {
        this.DEBITAMOUNT = DEBITAMOUNT;
    }

    public int getFLAGFORM() {
        return FLAGFORM;
    }

    public void setFLAGFORM(int FLAGFORM) {
        this.FLAGFORM = FLAGFORM;
    }

    public String getUSERFORM() {
        return USERFORM;
    }

    public void setUSERFORM(String USERFORM) {
        this.USERFORM = USERFORM;
    }

    public int getCURRENTACCCREDITAMT() {
        return CURRENTACCCREDITAMT;
    }

    public void setCURRENTACCCREDITAMT(int CURRENTACCCREDITAMT) {
        this.CURRENTACCCREDITAMT = CURRENTACCCREDITAMT;
    }

    public int getCURRENTACCSERVICECOST() {
        return CURRENTACCSERVICECOST;
    }

    public void setCURRENTACCSERVICECOST(int CURRENTACCSERVICECOST) {
        this.CURRENTACCSERVICECOST = CURRENTACCSERVICECOST;
    }

    public int getSERVICECOSTCHARGED() {
        return SERVICECOSTCHARGED;
    }

    public void setSERVICECOSTCHARGED(int SERVICECOSTCHARGED) {
        this.SERVICECOSTCHARGED = SERVICECOSTCHARGED;
    }

    public String getFREESERVICECOSTDATE() {
        return FREESERVICECOSTDATE;
    }

    public void setFREESERVICECOSTDATE(String FREESERVICECOSTDATE) {
        this.FREESERVICECOSTDATE = FREESERVICECOSTDATE;
    }

    public int getLOANTIMELOANAMOUNT() {
        return LOANTIMELOANAMOUNT;
    }

    public void setLOANTIMELOANAMOUNT(int LOANTIMELOANAMOUNT) {
        this.LOANTIMELOANAMOUNT = LOANTIMELOANAMOUNT;
    }

    public int getLOANTIMESERVICECOST() {
        return LOANTIMESERVICECOST;
    }

    public void setLOANTIMESERVICECOST(int LOANTIMESERVICECOST) {
        this.LOANTIMESERVICECOST = LOANTIMESERVICECOST;
    }

    public String getLOANTIMEORDERDISCOUNT() {
        return LOANTIMEORDERDISCOUNT;
    }

    public void setLOANTIMEORDERDISCOUNT(String LOANTIMEORDERDISCOUNT) {
        this.LOANTIMEORDERDISCOUNT = LOANTIMEORDERDISCOUNT;
    }



  //Constructor
    public PrestamoModelo() {
    }

    
    //STRING
    @Override
    public String toString() {
        return "PrestamoModelo{" + "RESULT=" + RESULT + ", SUBID=" + SUBID + ", OPERATORID=" + OPERATORID + ", SRRID=" + SRRID + ", CHARGEDATE=" + CHARGEDATE + ", ACCREDITATIONDATE=" + ACCREDITATIONDATE + ", SERVICEFLAG=" + SERVICEFLAG + ", DEBITAMOUNT=" + DEBITAMOUNT + ", FLAGFORM=" + FLAGFORM + ", USERFORM=" + USERFORM + ", CURRENTACCCREDITAMT=" + CURRENTACCCREDITAMT + ", CURRENTACCSERVICECOST=" + CURRENTACCSERVICECOST + ", SERVICECOSTCHARGED=" + SERVICECOSTCHARGED + ", FREESERVICECOSTDATE=" + FREESERVICECOSTDATE + ", LOANTIMELOANAMOUNT=" + LOANTIMELOANAMOUNT + ", LOANTIMESERVICECOST=" + LOANTIMESERVICECOST + ", LOANTIMEORDERDISCOUNT=" + LOANTIMEORDERDISCOUNT + '}';
    }
    
	
	
	
}//clase
