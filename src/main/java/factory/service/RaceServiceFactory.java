package factory.service;

import service.raceService.RaceService;

public class RaceServiceFactory {
    public static RaceService getRaceService(){
        return RaceService.getRaceService();
    }
}
