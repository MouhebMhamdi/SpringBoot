package tn.esprit.esponline.controller;
import tn.esprit.esponline.service.IDependencyService;

public class DependencyController {
IDependencyService myService;

public IDependencyService getMyService() {
return myService;
}

public void setMyService(IDependencyService myService) {
this.myService = myService;
}
}