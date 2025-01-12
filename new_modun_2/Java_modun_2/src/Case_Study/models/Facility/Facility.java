package Case_Study.models.Facility;

public abstract class Facility {
    private String idService;
    private String serviceName;
    private double usableArea;
    private double rentalCosts;
    private int peopleMax;
    private String rentalType;

    public Facility() {
    }

    public Facility (String idService,String serviceName, double usableArea, double rentalCosts,
                    int peopleMax, String rentalType) {
        this.idService = idService;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.peopleMax = peopleMax;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getPeopleMax() {
        return peopleMax;
    }

    public void setPeopleMax(int peopleMax) {
        this.peopleMax = peopleMax;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public abstract String infoString();

    @Override
    public String toString() {
        return "Facility{" +
                "idService='" + idService + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", peopleMax=" + peopleMax +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
