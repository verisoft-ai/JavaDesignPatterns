package adapter;

class UniversalAdapter implements ElectricalOutlet {
    private MobilePhone device;

    UniversalAdapter(MobilePhone device) {
        this.device = device;
    }

    public void request() {
        System.out.println("Converting electrical power to device");
        device.specificRequest();
    }
}