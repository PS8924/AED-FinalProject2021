/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Patient;
import Business.UserAccount.UserAccount;
import java.util.Date;
/**
 *
 * @author krishnamayavat
 */
public class Patient {


public class patient {
    private String BloodTest;
    private String Xray;
    private String UrineTest;
    private String PER;
    private String ECGReports;

    public String getBloodTest() {
        return BloodTest;
    }

    public void setBloodTest(String BloodTest) {
        this.BloodTest = BloodTest;
    }

    public String getXray() {
        return Xray;
    }

    public void setXray(String Xray) {
        this.Xray = Xray;
    }

    public String getUrineTest() {
        return UrineTest;
    }

    public void setUrineTest(String UrineTest) {
        this.UrineTest = UrineTest;
    }

    public String getPER() {
        return PER;
    }

    public void setPER(String PER) {
        this.PER = PER;
    }

    public String getECGReports() {
        return ECGReports;
    }

    public void setECGReports(String ECGReports) {
        this.ECGReports = ECGReports;
    }
}

}
