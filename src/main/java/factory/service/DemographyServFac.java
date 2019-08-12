package factory.service;

import service.democraphy.DemographyServ;

public class DemographyServFac {
    public static DemographyServ getDemSerFac(){
        return DemographyServ.geDemoSer();
    }
}
